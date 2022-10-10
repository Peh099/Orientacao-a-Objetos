package Model;

import static View.TCadastroOperario.index;
import static View.TCadastroOperario.flag;
import java.util.ArrayList;//A importa��o do ArrayList � necess�ria para criar ArrayList do tipo Operario

import Util.Arquivo;
import json.JSONArray;//A importa��o da classe JSONArray � necess�ria para cria��o de Arrays no formato JSON
import json.JSONObject;//A importa��o da classe JSONObject � fundamental para a cria��o de objetos no formato JSONObject


/**
	 * Essa classe tem como objetivo definir os atributos e met�dos padr�es para todos os tipos de operarios,
	 * sendo uma classe derivada de Funcionario ela possui todas suas caracter�sticas, al�m de implementar a 
	 * interface Salvamento. 
 * @author pedro
 * @version 3.0 (nov. 2020)
 * 
 */

public class Operario extends Funcionario implements Salvamento {

 	//atributos
    private String habilidades;
    private String tiposTrabalhosExecutados;
    private final static String Caminho="Dadosbd/baseOperario.txt";
    
    //metodos especiais
    
        /*public Operario(){
        count++;
        }*/
    /**
     *O construtor de Oper�rio � necess�rio para definir os atributos m�nimos que cada Oper�rio dever� ter no momento
	 * em que a classe for instanciada.
     * @param codigo Codigo do Operario
     * @param nome Nome do Operario
     * @param filiacao Filia��o do Operario
     * @param cargaHoraria Carga Hor�ria do Operario
     * @param comissao Comissao do Operario
     * @param cargo Cargo do Operario
     * @param telefone Telefone do Operario
     * @param endereco Endere�o do Operario
     * @param salario Sal�rio do Operario
     * @param departamento Departamento do Operario
     * @param habilidades Habilidades do Operario
     * @param tiposTrabalhosExecutados Tipos de Trabalhos Executados do Operario
     * @param dataNascimento Data de Nascimento do Operario
     * @param sexo Sexo do Operario
     */
        public Operario(int codigo, String nome,String filiacao, int cargaHoraria, double comissao, String cargo,
            String telefone, String endereco,double salario, String departamento,String habilidades,
            String tiposTrabalhosExecutados,String dataNascimento,String sexo) {
		
                super(codigo,nome,filiacao,cargaHoraria,comissao,cargo,telefone,endereco,salario, departamento, sexo, dataNascimento);
		this.habilidades=habilidades;
		this.tiposTrabalhosExecutados=tiposTrabalhosExecutados;
		this.dataNascimento=dataNascimento;
		this.sexo= sexo;            	
        } 
        /**
         * O construtor de Operario com o par�metro json tem como objetivo converter do formato JSONObject 
         * para o formato Operio. Sendo assim, o contr�rio tamb�m � necess�rio, ou seja de Operario para JSONObject.
         * @param json JSONObject
         */
        public Operario(JSONObject json){
            this.codigo=json.getInt("codigo");
            this.nome=json.getString("nome");
            this.filiacao=json.getString("filiacao");
            this.cargaHoraria=json.getInt("cargaHoraria");
            this.comissao=json.getDouble("comissao");
            this.cargo=json.getString("cargo");
            this.telefone=json.getString("telefone");
            this.endereco=json.getString("endereco");
            this.salario=json.getDouble("salario");
            this.departamento=json.getString("departamento");
            this.habilidades=json.getString("habilidades");
            this.tiposTrabalhosExecutados=json.getString("tiposTrabalhosExecutados");
            this.dataNascimento=json.getString("dataNascimento");
            this.sexo=json.getString("sexo");
         }
     
  //metodos getters e setters
   

    
	public String getHabilidades(){
		return habilidades;
	}
	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}
	public String getTiposTrabalhosExecutados() {
		return tiposTrabalhosExecutados;
	}
	public void setTiposTrabalhosExecutados(String tiposTrabalhoExecutados) {
		this.tiposTrabalhosExecutados = tiposTrabalhoExecutados;
	}
  
	//metodos principais
	
	/**
	 *  O met�do toJson faz a convers�o de Operario para um formato JSON, com o objetivo de salvar em um formato 
	 * padronizado no banco de dados. 
	 * @return json
	 */
	
    @Override
    public JSONObject toJson(){
        JSONObject json= new JSONObject();
        json.put("codigo",this.codigo);
        json.put("nome",this.nome);
        json.put("filiacao",this.filiacao);
        json.put("cargaHoraria",this.cargaHoraria);
        json.put("comissao",this.comissao);
        json.put("cargo",this.cargo);
        json.put("telefone",this.telefone);
        json.put("endereco",this.endereco);
        json.put("salario",this.salario);
        json.put("departamento",this.departamento);
        json.put("habilidades",this.habilidades);
        json.put("tiposTrabalhosExecutados",this.tiposTrabalhosExecutados);
        json.put("dataNascimento",this.dataNascimento);
        json.put("sexo",this.sexo);
        return json;
    }// fim do metodo toJson
    
    /**
     * O m�todo Persistir faz a persist�ncia dos dados fornecidos pelo usu�rio na base de dados. Para isso � feita 
     * uma leitura no arquivo e caso n�o esteja v�zio � criado um Array do tipo JSONArray, se esse Array for criado,
     * e flag=1 os valores s�o inseridos para cada atributo dentro da posi��o no Array e esses dados s�o escritos no 
     * aquivo. Se flag = 2 o metodo pega a referida posi��o no Array e edita com os novos valores fornecidos. Caso 
     * flag=3 o metodo remove a posi��o correspondente. Se as condi��o forem favor�veis retorna true.
     * 
     * @return boolean
     */
    
    @Override
    public boolean Persistir(){
        JSONObject json = this.toJson();
        
        String base = Arquivo.Read(Caminho);
        JSONArray jO = new JSONArray();
        if(!base.isEmpty())
            jO = new JSONArray(base);
        if (flag==1) {
        jO.put(json);
        }
        if(flag==2) {
        	jO.put(index,json);
        }
        if(flag==3) {
        	jO.remove(index);
        }
        Arquivo.Write(Caminho,jO.toString());       
        return true;
    }// fim do metodo persistir
    
    /**
     * O m�todo getOperarios tem como objetivo criar um ArrayList do tipo Operario com todos os operarios que forem
     * instanciados. Para isso � feita uma leitura na base de dados, caso esteja v�zio retorna nulo, caso 
     * contr�rio � criado um vetor de JSON com base no banco de dados, sendo exra�do cada JSONObject do vetor de
     * JSON. Com base no JSONObject � gerado um novo Operario. Cada Operario gerado � inclu�do no vetor de operarios,
     * retornando operarios.
     * @return operarios
     */
    
    public static ArrayList<Operario> getOperarios(){
        ArrayList<Operario> operarios = new ArrayList();
        String base = Arquivo.Read(Caminho);
        if(base.isEmpty()){
    return null;
        }
           
        JSONArray jO = new JSONArray(base);
        for(int i=0;i<jO.length();i++){
            Operario O = new Operario(jO.getJSONObject(i));
            operarios.add(O);
        }
        return operarios;
    }// fim do metodo getOperarios
    
    /**
     * toString estabelece o tipo de retorno String padr�o para a classe Operario, no caso retorna o nome de cada 
     * Operario.
     * @return nome
     */
    
	@Override
	public String toString() {
		return nome;
		}
}


