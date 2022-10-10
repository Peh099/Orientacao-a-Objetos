package Controller;

import Model.Gerente;// A importa��o da classe Gerente � necess�ria para criar novos gerentes.
import java.util.ArrayList;//Importa��o necess�ria para criar ArrayList
import java.util.List;


/**
 * A classe GerenteControll � respons�vel por controlar os dados que entram e saem da interface gr�fica em dire��o ao 
 * banco de dados. � ela que faz a intermedia��o entre a camada View e a camada Model.
 *  @author Pedro Henrique
 *  @version 3.0 (nov. 2020)
 */
public class GerenteControll {
	
    /**
     * O m�todo SalvarGerente faz intermedia��o entre a camada View e Model e � respons�vel por coletar tudo aquilo 
     * que foi passado pelo usu�rio e salvar na base de dados. Para isso � criado um novo Gerente com os valores de
     * cada atributo que foram passados pelo usu�rio.  
     * @param codigo C�digo do Gerente
     * @param nome Nome do Gerente
     * @param filiacao Filia��o do Gerente
     * @param cargaHoraria Carga Hor�ria do Gerente
     * @param comissao Comissao do Gerente
     * @param cargo Cargo do Gerente
     * @param telefone Telefone do Gerente
     * @param endereco Endere�o do Gerente
     * @param salario Sal�rio do Gerente
     * @param departamento Departamento do Gerente
     * @param sexo Sexo do Gerente
     * @param dataNascimento Data de Nascimento do Gerente
     * @param projetoGerenciados Projetos Gerenciados Pelo Gerente
     * @return boolean
     */
    public static boolean SalvarGerente(int codigo, String nome,String filiacao, int cargaHoraria, float comissao, String cargo,
	             String telefone, String endereco,float salario, String departamento,String sexo,String dataNascimento,String projetoGerenciados){
        
        Gerente g= new Gerente(codigo,nome,filiacao,cargaHoraria,comissao,cargo,telefone,endereco,salario,departamento,sexo,dataNascimento,projetoGerenciados);
        return g.Persistir();        
        }
    /**
     * O m�todo getGerentes � respons�vel por criar um ArrayList de vetor de String, sendo assim, cada posi��o do 
     * ArrayList ter� um vetor de String, esse vetor de String ter� uma posi��o para cada atributo de gerente. Para
     *  isso,  � coletado um ArrayList de gerentes que a camada Model retorna. Se o ArrayList de gerentes n�o estiver
     *  nulo o m�todo retorna um ArrayList de vetor de String.
     * @return ArrayList
     */
    
    public static ArrayList<String[]> getGerentes(){
        ArrayList<String[]> Gerentes = new ArrayList();        
        ArrayList<Gerente> G = Gerente.getGerentes();
        if(G!=null){
        for(int i=0;i<G.size();i++){
            String g[] = new String[13];                    
            g[0] = Integer.toString(G.get(i).getCodigo());
            g[1] = G.get(i).getNome();
            g[2] = G.get(i).getFiliacao();
            g[3] = Integer.toString(G.get(i).getCargaHoraria());       
            g[4] = Double.toString(G.get(i).getComissao());
            g[5] = G.get(i).getCargo();
            g[6] = G.get(i).getTelefone();
            g[7] = G.get(i).getEndereco();
            g[8] = Double.toString(G.get(i).getSalario());
            g[9] = G.get(i).getDepartamento();
            g[10] = G.get(i).getSexo();
            g[11] = G.get(i).getDataNascimento();
            g[12] = G.get (i).getProjetoGerenciados();
            Gerentes.add(g);
        }
        }
        return Gerentes;
    }
    /**
     * O m�todo getDependentesGerente � respons�vel por criar um ArrayList de vetor de String, sendo assim, cada posi��o do 
     * ArrayList ter� um vetor de String, esse vetor de String ter� uma posi��o para os atributos nome, sexo e dataNascimento.
     *  Para isso,  � coletado um ArrayList de gerentes que a camada Model retorna. Se o ArrayList de gerentes n�o estiver
     *  nulo o m�todo retorna um ArrayList de vetor de String.
     * @return ArrayList
     */
    
    public static ArrayList<String[]> getDependentesGerente(){
        ArrayList<String[]> Gerentes = new ArrayList();        
        ArrayList<Gerente> G = Gerente.getGerentes();
        if(G!=null){
        for(int i=0;i<G.size();i++){
            String g[] = new String[12];                    
            g[0] = G.get(i).getNome();       
            g[1] = G.get(i).getSexo();
            g[2] = G.get(i).getDataNascimento();
            Gerentes.add(g);
        }
        }
        return Gerentes;
    }
}
