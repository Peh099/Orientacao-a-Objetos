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
 * A classe OperarioHabilidadesTM � respons�vel por atribuir um modelo � tabela de Habilidades dos operarios.
 * Para isso aplica-se o conceito de heran�a da classe AbstractTableModel, que tem uma s�rie de m�todos pr� 
 * definidos para facilitar a atualiza��o da tabela.
 * @author Pedro Henrique
 * @version 3.0 (nov. 2020)
 */
public class OperarioHabilidadesTM extends AbstractTableModel {  
	//atributos
    private List <String[]> linhas;   
    private String[] colunas= new String[]{"Nome","Habilidades"};
    /**
     * O construtor sem par�metros de OperarioHabilidadesTM tem como objetivo criar um novo ArrayList do tipo String.
     * 
     */
    public OperarioHabilidadesTM(){
        linhas=new ArrayList<String[]>();
    }   
    /**
     * O construtor com par�metro lista de ProjetoGerenteTM tem como objetivo criar um novo ArrayList do tipo 
     * String recebendo lista 
     * @param lista Lista de String
     */
    public OperarioHabilidadesTM(List<String[]>lista){
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
     * @return linhas.size(
     */
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }
    /**
     * O metodo getColumnName retorna o nome da coluna especificada
     * @param columnIndex Index da coluna
     * @return colunas[columnIndex]
     */
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    /**
     * O metodo getColumnClass retorna a classe da coluna especificada
     * @param columnIndex Index da coluna
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
     * O metodo getValueAt retorna um objeto padr�o, recuperando os dependentes do gerente relacionado a linha
     * especificada e o atributo relacionado aquele Gerente. Ao atualizar um Gerente, o TableModel ir� chamar o
     * metodo getValueAt internamente, sem precisar atualizar constantemente. Caso o valor indicado seja 
     * inexistente retorna uma exce��o informando que a coluna n�o existe.
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
            
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    /**
     * O metodo setValueAt altera o valor da c�lula especificada.
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
                                            
                
            default:
                // Isto n�o deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
}