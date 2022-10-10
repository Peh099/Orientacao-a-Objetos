package Controller;

import Model.Gerente;// A importação da classe Gerente é necessária para criar novos gerentes.
import java.util.ArrayList;//Importação necessária para criar ArrayList
import java.util.List;


/**
 * A classe GerenteControll é responsável por controlar os dados que entram e saem da interface gráfica em direção ao 
 * banco de dados. É ela que faz a intermediação entre a camada View e a camada Model.
 *  @author Pedro Henrique
 *  @version 3.0 (nov. 2020)
 */
public class GerenteControll {
	
    /**
     * O método SalvarGerente faz intermediação entre a camada View e Model e é responsável por coletar tudo aquilo 
     * que foi passado pelo usuário e salvar na base de dados. Para isso é criado um novo Gerente com os valores de
     * cada atributo que foram passados pelo usuário.  
     * @param codigo Código do Gerente
     * @param nome Nome do Gerente
     * @param filiacao Filiação do Gerente
     * @param cargaHoraria Carga Horária do Gerente
     * @param comissao Comissao do Gerente
     * @param cargo Cargo do Gerente
     * @param telefone Telefone do Gerente
     * @param endereco Endereço do Gerente
     * @param salario Salário do Gerente
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
     * O método getGerentes é responsável por criar um ArrayList de vetor de String, sendo assim, cada posição do 
     * ArrayList terá um vetor de String, esse vetor de String terá uma posição para cada atributo de gerente. Para
     *  isso,  é coletado um ArrayList de gerentes que a camada Model retorna. Se o ArrayList de gerentes não estiver
     *  nulo o método retorna um ArrayList de vetor de String.
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
     * O método getDependentesGerente é responsável por criar um ArrayList de vetor de String, sendo assim, cada posição do 
     * ArrayList terá um vetor de String, esse vetor de String terá uma posição para os atributos nome, sexo e dataNascimento.
     *  Para isso,  é coletado um ArrayList de gerentes que a camada Model retorna. Se o ArrayList de gerentes não estiver
     *  nulo o método retorna um ArrayList de vetor de String.
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
