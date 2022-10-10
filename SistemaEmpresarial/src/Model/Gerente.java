package Model;


import java.util.ArrayList;//A importação do ArrayList é necessária para criar uma lista de gerentes;

import Util.Arquivo;
import json.JSONArray;//A importação da classe JSONArray é necessária para criar um Array de gerentes no formato JSON;
import json.JSONObject;//A importação da classe JSONObject é necessária para criar um objeto no formato JSON;

import static View.TCadastroGerente.index;
import static View.TCadastroGerente.flag;

	/**
	 * Essa classe tem como objetivo definir os atributos e metódos padrões para todos os tipos de gerentes,
	 * sendo uma classe derivada de Funcionario ela possui todas suas características, além de implementar a 
	 * interface Salvamento. 
	 * @author pedro
	 * @version 3.0 (nov. 2020)
	 * 
	 */



public class Gerente extends Funcionario implements Salvamento {
	
	//atributos
	private final static String Caminho="Dadosbd/baseGerente.txt";
	private Projeto projetosGerenciados;
	private String projetoGerenciados;
	//metodos especiais 
	
	/**
	 * O construtor de Gerente é necessário para definir os atributos mínimos que cada Gerente deverá ter no momento
	 * em que a classe for instanciada
	 * @param codigo Codigo do Gerente
	 * @param nome Nome do Gerente
	 * @param filiacao Filiacao do Gerente
	 * @param cargaHoraria Carga Horaria do Gerente
	 * @param comissao Comissao do Gerente
	 * @param cargo Cargo do Gerente
	 * @param telefone Telefone do Gerente
	 * @param endereco Endereço do Gerente
	 * @param salario Salario do Gerente
	 * @param departamento Departamento do Gerente
	 * @param sexo Sexo do Gerente
	 * @param dataNascimento Data de Nascimento do Gerente
	 * @param projetoGerenciados Projetos Gerenciados pelo Gerente
	 */
	public Gerente(int codigo, String nome,String filiacao, int cargaHoraria, double comissao, String cargo,
            String telefone, String endereco, double salario,String departamento,String sexo,String dataNascimento,String projetoGerenciados) {
		super(codigo,nome,filiacao,cargaHoraria,comissao,cargo,telefone,endereco,salario, departamento,sexo,dataNascimento);		
		this.dataNascimento=dataNascimento;
		this.sexo= sexo;
		this.projetoGerenciados=projetoGerenciados;
	}
	/**
	 * O construtor de gerente com o parâmetro json tem como objetivo converter do formato JSONObject para o formato
	 * Gerente. Sendo assim o contrário também é necessário, ou seja de Gerente para JSONObject.
	 * @param json JSONObject
	 */
        
        public Gerente(JSONObject json){
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
           this.sexo=json.getString("sexo");
           this.dataNascimento=json.getString("dataNascimento");
           this.projetoGerenciados=json.getString("projetoGerenciados");
        }
	
	

    //metodos getters e setters
    public Projeto getProjetosGerenciados() {
		return projetosGerenciados;
	}    
    public void setProjetosGerenciados(Projeto projetosGerenciados) {
        this.projetosGerenciados = projetosGerenciados;
    }

	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getProjetoGerenciados() {
		return projetoGerenciados;
	}
	
	public void setProjetoGerenciados(String projetoGerenciados) {
		this.projetoGerenciados=projetoGerenciados;
	}
	
	//metodos principais
	/**
	 * O metódo toJson faz a conversão de Gerente para um formato JSON, com o objetivo de salvar em um formato 
	 * padronizado no banco de dados. 
	 * @return json
	 *
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
            json.put("sexo",this.sexo);
            json.put("dataNascimento",this.dataNascimento);
            json.put("projetoGerenciados",this.projetoGerenciados);
            return json;
        }// fim do metodo toJson
    
    
    /**
     * O método Persistir faz a persistência dos dados fornecidos pelo usuário na base de dados. Para isso é feita 
     * uma leitura no arquivo e caso não esteja vázio é criado um Array do tipo JSONArray, se esse Array for criado,
     * e flag=1 os valores são inseridos para cada atributo dentro da posição no Array e esses dados são escritos no 
     * aquivo. Se flag = 2 o metodo pega a referida posição no Array e edita com os novos valores fornecidos. Caso 
     * flag=3 o metodo remove a posição correspondente. Se as condição forem favoráveis retorna true.
     * 
     * @return boolean
     */
       @Override
       public boolean Persistir(){
        JSONObject json = this.toJson();
        
        String base = Arquivo.Read(Caminho);
        JSONArray jG = new JSONArray();
        if(!base.isEmpty())
            jG = new JSONArray(base);
        if (flag==1) {
        	jG.put(json);
        }
        if(flag==2) {
        jG.put(index,json);
        }
        if(flag==3) {
        	jG.remove(index);
        }
        Arquivo.Write(Caminho,jG.toString());
       
        return true;
    }//fim do metodo Persistir
       
    
         /** 
          * O método getGerentes tem como objetivo criar um ArrayList do tipo Gerente com todos os gerentes que forem
          * instanciados. Para isso é feita uma leitura na base de dados, caso esteja vázio retorna nulo, caso 
          * contrário é criado um vetor de JSON com base no banco de dados, sendo exraído cada JSONObject do vetor de
          * JSON. Com base no JSONObject é gerado um novo Gerente. Cada Gerente gerado é incluído no vetor de gerentes,
          * retornando gerentes.
          * @return gerentes
          */
    public static ArrayList<Gerente> getGerentes(){
        ArrayList<Gerente> gerentes = new ArrayList();
        String base = Arquivo.Read(Caminho);
        if(base.isEmpty())
            return null;
    
        JSONArray jG = new JSONArray(base);
        for(int i=0;i<jG.length();i++){
            Gerente G = new Gerente(jG.getJSONObject(i));
            gerentes.add(G);
        }
        return gerentes;
    }// fim do metodo getGerentes
     
    /**
     * toString estabelece o tipo de retorno String padrão para a classe Gerente, no caso retorna o nome de cada 
     * Gerente.
     * @return nome
     */
    
     @Override 
     public String toString(){
         return nome;
     }//fim do metodo toString
     
}
