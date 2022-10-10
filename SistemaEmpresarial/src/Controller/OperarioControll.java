package Controller;

import java.util.ArrayList;//Importação necessária para criar ArrayList
import java.util.List;
import Model.Operario;// A importação da classe Operario é necessária para criar novos operarios.

/**
 * A classe OperarioControll é responsável por controlar os dados que entram e saem da interface gráfica em direção ao 
 * banco de dados. É ela que faz a intermediação entre a camada View e a camada Model.
 *  @author Pedro Henrique
 *  @version 3.0 (nov. 2020)
 */
public class OperarioControll {
	/**
     * O método SalvarOperario faz intermediação entre a camada View e Model e é responsável por coletar tudo aquilo 
     * que foi passado pelo usuário e salvar na base de dados. Para isso é criado um novo Operario com os valores de
     * cada atributo que foram passados pelo usuário. 
     * @param codigo Código do Operario
     * @param nome Nome do Operario
     * @param filiacao Filiação do Operario
     * @param cargaHoraria Carga Horária do Operario
     * @param comissao Comissao do Operario
     * @param cargo Cargo do Operario
     * @param telefone Telefone do Operario
     * @param endereco Endereço do Operario
     * @param salario Salário do Operario
     * @param departamento Departamento do Operario
     * @param habilidades Habilidades do Operario
     * @param tiposTrabalhosExecutados Tipos de Trabalhos Executados pelo Operario
     * @param dataNascimento Data de Nascimento do Operario
     * @param sexo Sexo do Operario
     * @return boolean
     */

    public static boolean SalvarOperario(int codigo, String nome,String filiacao, int cargaHoraria, double comissao, String cargo,
            String telefone, String endereco,double salario, String departamento,String habilidades,
            String tiposTrabalhosExecutados,String dataNascimento,String sexo){
        
        Operario o= new Operario(codigo,nome,filiacao,cargaHoraria,comissao,cargo,telefone,endereco,salario,departamento,habilidades,tiposTrabalhosExecutados,dataNascimento,sexo);
        return o.Persistir();        
        }
    
     /**
      * O método getOperarios é responsável por criar um ArrayList de vetor de String, sendo assim, cada posição do 
      * ArrayList terá um vetor de String, esse vetor de String terá uma posição para cada atributo de Operario. Para
      *  isso,  é coletado um ArrayList de operarios que a camada Model retorna. Se o ArrayList de operarios não estiver
      *  nulo o método retorna um ArrayList de vetor de String.
      * @return ArrayList
      */
    
    public static ArrayList<String[]> getOperarios(){
        ArrayList<String[]> Operarios = new ArrayList();        
        ArrayList<Operario> O = Operario.getOperarios();
        if(O!=null){
        for(int i=0;i<O.size();i++){
            String o[] = new String[14];                    
            o[0] = Integer.toString(O.get(i).getCodigo());
            o[1] = O.get(i).getNome();
            o[2] = O.get(i).getFiliacao();
            o[3] = Integer.toString(O.get(i).getCargaHoraria());       
            o[4] = Double.toString(O.get(i).getComissao());
            o[5] = O.get(i).getCargo();
            o[6] = O.get(i).getTelefone();
            o[7] = O.get(i).getEndereco();
            o[8] = Double.toString(O.get(i).getSalario());
            o[9] = O.get(i).getDepartamento();
            o[10] = O.get(i).getHabilidades();
            o[11] = O.get(i).getTiposTrabalhosExecutados();
            o[12]=O.get(i).getDataNascimento();
            o[13]=O.get(i).getSexo();
            Operarios.add(o);
        }     	
        }
        return Operarios;
    }
    /**
     * O método getOperarios2 é responsável por criar um ArrayList de vetor de String, sendo assim, cada posição do 
     * ArrayList terá um vetor de String, esse vetor de String terá uma posição para o nome do Operario e uma para
     * suas habilidades. Para isso, é coletado um ArrayList de operarios que a camada Model retorna. Se o ArrayList
     * de operarios não estiver nulo o método retorna um ArrayList de vetor de String.
     * 
     * @return ArrayList
     */
    
    public static ArrayList<String[]> getOperarios2(){
        ArrayList<String[]> Operarios = new ArrayList();        
        ArrayList<Operario> O = Operario.getOperarios();
        if(O!=null){
        for(int i=0;i<O.size();i++){
            String o[] = new String[14];                    
            o[0] = O.get(i).getNome();
            o[1] = O.get(i).getHabilidades();                   
            Operarios.add(o);
        }     	
        }
        return Operarios;
    }
    /**
     * O método getOperariosDependentes é responsável por criar um ArrayList de vetor de String, sendo assim, cada
     * posição do  ArrayList terá um vetor de String, esse vetor de String terá uma posição para o nome do Operario,
     * para o sexo e para a dataNascimento. Para isso, é coletado um ArrayList de operarios que a camada Model retorna.
     * Se o ArrayList de operarios não estiver nulo o método retorna um ArrayList de vetor de String.
     * 
     * @return ArrayList
     */
    
    public static ArrayList<String[]> getOperariosDependentes(){
        ArrayList<String[]> Operarios = new ArrayList();        
        ArrayList<Operario> O = Operario.getOperarios();
        if(O!=null){
        for(int i=0;i<O.size();i++){
            String o[] = new String[14];                    
            o[0] = O.get(i).getNome();
            o[1] = O.get(i).getSexo();  
            o[2] = O.get(i).getDataNascimento();
            Operarios.add(o);
        }     	
        }
        return Operarios;
    }
    }

