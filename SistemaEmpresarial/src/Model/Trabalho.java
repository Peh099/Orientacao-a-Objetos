package Model;

import static View.TNovoTrabalho.index;
import static View.TNovoTrabalho.flag;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;// A importação é necessária para criar ArrayList
import java.util.Date;

import Util.*;
import json.JSONArray;//A importação se faz necessária para criar Array do tipo JSONArray
import json.JSONObject;// A importação se faz necessária para criar objetos do tipo JSONObject

/**
 *Essa classe tem como objetivo definir os atributos e metódos padrões para todos os tipos de trabalhos instanciados,
 * além disso, implementa a interface Salvamento.
 * @author pedro
 * @version 3.0 (nov. 2020)
 */


public class Trabalho implements Salvamento{
	
	   //atributos
	   private final static String Caminho="Dadosbd/baseTrabalho.txt";
	   private String nomeTrabalho;
	   private int codigoTrab; 
	   private String caracteristicas; 	   
	   private ArrayList<Operario> operarios;
       private String operario1;
       private String operario2;
       private String operario3;
       private String operario4;
	   private String periodo;
	   private String statusTrabalho;
   
	   //metodos especiais
         /* public Trabalho(){
              operarios=new ArrayList();
          }*/
       
	   /**
         * O construtor de Trabalho com o parâmetro json tem como objetivo converter do formato JSONObject 
         * para o formato Trabalho. Sendo assim, o contrário também é necessário, ou seja de Trabalho para JSONObject.
         * @param json JSONObject
         */

          public Trabalho(JSONObject json){              
           this.codigoTrab=json.getInt("codigoTrab");
           this.nomeTrabalho=json.getString("nomeTrabalho");
           this.caracteristicas=json.getString("caracteristicas");          
           this.periodo=json.getString("periodo");           
           this.operario1=json.getString("operario1");
           this.operario2=json.getString("operario2");
           this.operario3=json.getString("operario3");
           this.operario4=json.getString("operario4");
           this.statusTrabalho=json.getString("statusTrabalho");
           operarios=new ArrayList();
           }
          /**
           * O construtor de Trabalho é necessário para definir os atributos mínimos que cada Trabalho deverá ter 
           * no momento em que a classe for instanciada.
           * @param codigoTrab Codigo do Trabalho
           * @param nomeTrabalho Nome do Trabalho
           * @param caracteristicas Caracteristicas do Trabalho
           * @param periodo Periodo do Trabalho
           * @param operario1 Primeiro Operario do Trabalho
           * @param operario2 Segundo Operario do Trabalho
           * @param operario3 Terceiro Operario do Trabalho
           * @param operario4 Quarto Operario do Trabalho
           * @param statusTrabalho Status do Trabalho
           */ 
	       public Trabalho(int codigoTrab,String nomeTrabalho,String caracteristicas,String periodo,String operario1,String operario2,String operario3,String operario4,String statusTrabalho) {
               this.codigoTrab=codigoTrab;
               this.nomeTrabalho=nomeTrabalho;
               this.caracteristicas=caracteristicas;
	          //this.operarios=operarios;
               this.periodo=periodo;
               this.operario1=operario1;
               this.operario2=operario2;
               this.operario3=operario3;
               this.operario4=operario4;
               this.statusTrabalho=statusTrabalho; 
               operarios=new ArrayList();
	    }   
	//metodos getters e setters

    public String getOperario2() {
        return operario2;
    }

    public void setOperario2(String operario2) {
        this.operario2 = operario2;
    }

    public String getOperario3() {
        return operario3;
    }

    public void setOperario3(String operario3) {
        this.operario3 = operario3;
    }

    public String getOperario4() {
        return operario4;
    }

    public void setOperario4(String operario4) {
        this.operario4 = operario4;
    }          
	public int getCodigoTrab() {
		return codigoTrab;
	}
	public void setCodigoTrab(int codigoTrab) {
		this.codigoTrab = codigoTrab;
		//setCaracteristicas(caracteristicas);
	}
        public String getCaracteristicas(){
            return caracteristicas;
        }
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getNomeTrabalho() {
		return nomeTrabalho;
	}
	public void setNomeTrabalho(String nomeTrabalho) {
		this.nomeTrabalho = nomeTrabalho;
	}
	public ArrayList<Operario> getOperarios() {
		return operarios;
	}
	public void setOperarios(ArrayList<Operario> operarios) {
		this.operarios = operarios;
	}  
	public String getStatusTrabalho() {
		return statusTrabalho;
	}

	public void setStatusTrabalho(String statusTrabalho) {
		this.statusTrabalho = statusTrabalho;
	}

    public String getOperario1() {
        return operario1;
    }

    public void setOperario1(String operario1) {
        this.operario1 = operario1;
    }

	//metodos principais
		/**
		 * O metódo toJson faz a conversão de Trabalho para um formato JSON, com o objetivo de salvar em um formato 
	     * padronizado no banco de dados.
	     * @return json
		 */
    
           @Override
        public JSONObject toJson(){
            JSONObject json= new JSONObject();
            
            json.put("codigoTrab",this.codigoTrab);
            json.put("nomeTrabalho",this.nomeTrabalho);
            json.put("caracteristicas",this.caracteristicas);
            json.put("periodo",this.periodo);
            json.put("operario1", this.operario1);
            json.put("operario2", this.operario2);
            json.put("operario3", this.operario3);
            json.put("operario4", this.operario4);
            json.put("statusTrabalho", this.statusTrabalho);
            return json;
        }//fim do metodo toJson
        
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
               JSONArray jT = new JSONArray();
               if(!base.isEmpty()){
                   jT = new JSONArray(base);}
               if(flag==1){
                   jT.put(json);
               }
               if(flag==2){
                   jT.put(index,json);
               }
               if(flag==3) {
            	   jT.remove(index);
               }               
               Arquivo.Write(Caminho,jT.toString());
              
               return true;
           }//fim do metodo Persistir
             
        /**
         * O método getTrabalho tem como objetivo criar um ArrayList do tipo Trabalho com todos os trabalhos que forem
         * instanciados. Para isso é feita uma leitura na base de dados, caso esteja vázio retorna nulo, caso 
         * contrário é criado um vetor de JSON com base no banco de dados, sendo exraído cada JSONObject do vetor de
         * JSON. Com base no JSONObject é gerado um novo Trabalho. Cada Trabalho gerado é incluído no vetor de 
         * trabalhos, retornando trabalhos.
         * 
         * 
         * @return trabalhos
         */
        public static ArrayList<Trabalho> getTrabalhos(){
        ArrayList<Trabalho> trabalhos = new ArrayList();
        String base = Arquivo.Read(Caminho);
        if(base.isEmpty())
            return null;
    
        JSONArray jT = new JSONArray(base);
        for(int i=0;i<jT.length();i++){
            Trabalho T = new Trabalho(jT.getJSONObject(i));
            trabalhos.add(T);
        }
        return trabalhos;   
    } // fim do metodo getTrabalhos
              
	}