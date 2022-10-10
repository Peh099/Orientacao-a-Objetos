/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * A classe OperarioTM é responsável por atribuir um modelo à tabela de operarios. Para isso aplica-se o conceito 
 * de herança da classe AbstractTableModel, que tem uma série de métodos pré definidos para facilitar a atualização
 *  da tabela.
 * 
 * @author Pedro Henrique
 * @version 3.0(nov. 2020)
 * 
 */
public class OperarioTM extends AbstractTableModel {  

    //atributos
    private List <String[]> linhas;
    private String[] colunas = new String[]{"Código","Nome","Filiação","Carga Horaria","Comissão","Cargo","Telefone",
    		"Endereço","Salário","Departamento","Habilidades","Trabs","Data Nasc.","Sexo"};
    
    /**
     * O construtor sem parâmetros de OpearioTM tem como objetivo criar um novo ArrayList do tipo String.
     * 
     */
    public OperarioTM(){
        linhas=new ArrayList<String[]>();
    }
    /**
     * O construtor com parâmetro lista de OpearioTM tem como objetivo criar um novo ArrayList do tipo String recebendo
     * lista 
     * @param lista List do tipo vetor de String
     */
    
    public OperarioTM(List<String[]>lista){
        linhas=new ArrayList<String[]>(lista);
    }
    
    /**
     * O metodo getColumnCount retorna o numero de colunas da tabela
     * @return colunas.length
     */
    
    @Override
    public int getColumnCount() {        
        return colunas.length;
    }
    
    /**
     * O metodo getRowCount retorna o numero de linhas da tabela
     * @return linhas.size
     */
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }
    
    /**
     * O metodo getColumnName retorna o nome da coluna especificada
     * @param columnIndex Index da coluna desejada
     * @return colunas[columnIndex]
     */
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    /**
     * O metodo getColumnClass retorna a classe da coluna especificada
     * @param columnIndex Index da coluna desejada 
     * @return String.class
     */
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        /*
        switch(columnIndex){
            case 0:
                return Integer.class;
            default:
                return String.class;
        }
        */
        return String.class;
    }
    
    /**
     * O metodo getValueAt retorna um objeto padrão, recuperando o Operario relacionado a linha especificada e o 
     * atributo relacionado aquele Opeario. Ao atualizar um Operio, o TableModel irá chamar o metodo getValueAt
     * internamente, sem precisar atualizar constantemente. Caso o valor indicado seja inexistente retorna uma exceção
     * informando que a coluna não existe.
     * @param rowIndex linha desejada
     * @param columnIndex coluna desejada
     * @return Object
     * 
     */
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String t[] = linhas.get(rowIndex);

        switch (columnIndex) {
            case 0:                
                return t[0];
            case 1:
                return t[1];
            case 2:
                return t[2];
            case 3:
                return t[3];
            case 4:
                return t[4];
            case 5:
                return t[5];
            case 6:
                return t[6];
            case 7:
                return t[7];
            case 8:
                return t[8];
            case 9:
                return t[9];
            case 10:
                return t[10];
            case 11:
                return t[11];
            case 12:
                return t[12];
            case 13:
                return t[13];

                
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    /**
     * O metodo setValueAt altera o valor da célula especificada.
     * @param aValue indicar o novo valor
     * @param rowIndex index da linha
     * @param columnIndex index da coluna desejada
     * 
     */
    
    @Override
    //modifica na linha e coluna especificada
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        String t[] = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado

        switch (columnIndex) { // Seta o valor do campo respectivo
            case 0:
                t[0]=aValue.toString();
                break;
            case 1:
                t[1]=aValue.toString();
                break;
            case 2:
                t[2]=aValue.toString();
                break;
               case 3:
                t[3]=aValue.toString();
                break;
                case 4:
                t[4]=aValue.toString();
                break;
                case 5:
                t[5]=aValue.toString();
                break;
                case 6:
                t[6]=aValue.toString();
                break;
                case 7:
                t[7]=aValue.toString();
                break;
                case 8:
                t[8]=aValue.toString();
                break;
                case 9:
                t[9]=aValue.toString();
                break;
                case 10:
                t[10]=aValue.toString();
                break;
                case 11:
                t[11]=aValue.toString();
                break;
                case 12:
                t[12]=aValue.toString();
                    break;
                case 13:
                t[13]=aValue.toString();
                    break;
                
                
                
            default:
                // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
    
    /**
     * O método setValueAt passando como parâmetro aValue e rowIndex modifica o valor da linha especificada e atualiza
     * a tabela com os novos valores informados
     * 
     * @param aValue novo valor 
     * @param rowIndex Index da linha desejada
     */
    
    //modifica na linha especificada
    public void setValueAt(String aValue[], int rowIndex) {
        String t[] = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        
        t[0]=aValue[0];
        t[1]=aValue[1];
        t[2]=aValue[2];
        t[3]=aValue[3];
        t[4]=aValue[4];
        t[5]=aValue[5];
        t[6]=aValue[6];
        t[7]=aValue[7];
        t[8]=aValue[8];
        t[9]=aValue[9];
        t[10]=aValue[10];
        t[11]=aValue[11];
        t[12]=aValue[12];
        t[13]=aValue[13];
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
        fireTableCellUpdated(rowIndex, 5);
        fireTableCellUpdated(rowIndex, 6);
        fireTableCellUpdated(rowIndex, 7);
        fireTableCellUpdated(rowIndex, 8);
        fireTableCellUpdated(rowIndex, 9);
        fireTableCellUpdated(rowIndex, 10);
        fireTableCellUpdated(rowIndex, 11);
        fireTableCellUpdated(rowIndex, 12);
        fireTableCellUpdated(rowIndex, 13);
    }
    
    /**
     * O metodo getOperarios tem como objetivo retornar o Operario relacionado a linha indicada
     * @param indiceLinha Indece da Linha desejada
     * @return String[]
     */
    
    public String[] getOperarios(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    /**
     * O metodo addOperario adiciona um novo Operario à tabela
     * @param o vetor do string 
     */
    
    public void addOperario(String o[] ) {
        // Adiciona o registro.
        linhas.add(o);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    /**
     * Remove a linha especificada da tabela
     * @param indiceLinha indece da linha desejada
     */
    
    public void remove(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
    /**
     * O metodo addLista tem como objetivo adicionar uma nova lista de Opeario ao final dos registros 
     * 
     * @param o List do tipo vetor de String
     */

    public void addLista(List<String []> o) {
        // Pega o tamanho antigo da tabela.
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.
        linhas.addAll(o);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
    
    /**
     * O metodo limpar remove todos os registros 
     */

    /* Remove todos os registros. */
    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }
    
    /**
     * O metodo isEmpty verifica se esta table model esta vázia
     * @return boolean
     * 
     */

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return linhas.isEmpty();
    }   
}