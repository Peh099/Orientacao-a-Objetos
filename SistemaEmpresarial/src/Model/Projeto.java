package Model;

import static View.TNovoProjeto.index;
import static View.TNovoProjeto.flag;
import json.JSONArray;//A importa��o da classe JSONArray � necess�ria para criar um JSONArray de Projeto
import json.JSONObject;// A classe JSONObject � necess�ria para criar um objeto do tipo JSONObject

import java.util.ArrayList;// A importa��o � necess�ria para criar ArrayList

import Util.*;

/**
 * Essa classe tem como objetivo definir os atributos e met�dos padr�es para todos os tipos de projetos instanciados,
 * al�m disso, implementa a interface Salvamento.
 * @author pedro
 * @version 3.0 (nov. 2020)
 */

public class Projeto implements Salvamento {
	   //atributos
       private int codigoProjeto;        
	   private String nomeProjeto;
	   private String dataInicio; 
	   private String dataFinalizacao; 
	   private String atividadesDesenvolvidas ;
	   private String stakeholders;
	   private String historico;
	   private String produtosEntregues;
	   private String stats;
       private String gerenteProj;
	   private Gerente gerenteProjeto;
	   private ArrayList <Gerente> ListaGerente;
       private ArrayList <Projeto> ListaProj;
       private final static String Caminho="Dadosbd/baseProjeto.txt";
           
	   //metodos especiais
       /*
           public Projeto (){
           ListaGerente=new ArrayList();
           //this.stats=true;
           }*/
       
       	   /**
       	    *  O construtor de Projeto com o par�metro json tem como objetivo converter do formato JSONObject 
            *  para o formato Projeto. Sendo assim, o contr�rio tamb�m � necess�rio, ou seja de Projeto para 
            *  JSONObject.
       	    * 
       	    * @param json JSONObject
       	    */
           public Projeto(JSONObject json){
           this.codigoProjeto=json.getInt("codigoProjeto");
           this.nomeProjeto=json.getString("nomeProjeto");
           this.dataInicio=json.getString("dataInicio");
           this.dataFinalizacao=json.getString("dataFinalizacao");
           this.atividadesDesenvolvidas=json.getString("atividadesDesenvolvidas");
           this.stakeholders=json.getString("stakeholders");
           this.historico=json.getString("historico");
           this.produtosEntregues=json.getString("produtosEntregues"); 
           this.gerenteProj=json.getString("gerenteProj");
           this.stats=json.getString("stats");       
           }
           
           /**
            * O construtor de Projeto � necess�rio para definir os atributos m�nimos que cada Projeto dever� ter 
            * no momento em que a classe for instanciada.
            * @param codigoProjeto Codigo do projeto
            * @param nomeProjeto Nome do projeto
            * @param dataInicio Data de Inicio do projeto
            * @param dataFinalizacao Data de Finaliza��o do projeto
            * @param atividadesDesenvolvidas Atividades Desenvolvidas no Projeto
            * @param stakeholders StakeHolders do projeto
            * @param historico Historico do projeto
            * @param produtosEntregues Produtos entregues no projeto
            * @param gerenteProj Gerente do projeto
            * @param stats Status do projeto
            */
	   
	   public Projeto(int codigoProjeto,String nomeProjeto, String dataInicio, String dataFinalizacao,
                                     String atividadesDesenvolvidas, String stakeholders, 
                                     String historico,String produtosEntregues,String gerenteProj,String stats) {
	       this.codigoProjeto=codigoProjeto;
               this.nomeProjeto=nomeProjeto;
               this.dataInicio=dataInicio;
               this.dataFinalizacao=dataFinalizacao;
               this.atividadesDesenvolvidas=atividadesDesenvolvidas;
               this.stakeholders=stakeholders;
               this.historico=historico;
               this.produtosEntregues=produtosEntregues;                  	  	       	       
               this.gerenteProj=gerenteProj;
               this.stats=stats;
	    }

    //metodos getters e setters

 
    public String getGerenteProj() {
        return gerenteProj;
    }

    public void setGerenteProj(String gerenteProj) {
        this.gerenteProj = gerenteProj;
    }
    
    public int getCodigoProjeto() {
		return codigoProjeto;
	}    
    public void setCodigoProjeto(int codigoProjeto) {
        this.codigoProjeto = codigoProjeto;
    }

    public String getDataInicio() {
        return dataInicio;
    }
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(String dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	public String getAtividadesDesenvolvidas() {
		return atividadesDesenvolvidas;
	}
	public void setAtividadesDesenvolvidas(String atividadesDesenvolvidas) {
		this.atividadesDesenvolvidas = atividadesDesenvolvidas;
	}
	public String getStakeholders() {
		return stakeholders;
	}
	public void setStakeholders(String stakeholders) {
		this.stakeholders = stakeholders;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public String getProdutosEntregues() {
		return produtosEntregues;
	}
	public void setProdutosEntregues(String produtosEntregues) {
		this.produtosEntregues = produtosEntregues;
	}

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public Gerente getGerenteProjeto() {
		return gerenteProjeto;
	}

	public void setGerenteProjeto(Gerente gerenteProjeto) {
		this.gerenteProjeto = gerenteProjeto;
	}

       public ArrayList<Gerente> getListaGerente() {
       return ListaGerente;
       }

       public void setListaGerente(ArrayList<Gerente> ListaGerente) {
       this.ListaGerente = ListaGerente;
       }
    

	//metodos principais
       /**
        *  O met�do toJson faz a convers�o de Projeto para um formato JSON, com o objetivo de salvar em um formato 
	    *  padronizado no banco de dados.
        * 
        */
           @Override
        public JSONObject toJson(){
            JSONObject json= new JSONObject();
            json.put("codigoProjeto",this.codigoProjeto);
            json.put("nomeProjeto",this.nomeProjeto);
            json.put("dataInicio",this.dataInicio);
            json.put("dataFinalizacao",this.dataFinalizacao);
            json.put("atividadesDesenvolvidas",this.atividadesDesenvolvidas);
            json.put("stakeholders",this.stakeholders);
            json.put("historico",this.historico);
            json.put("produtosEntregues",this.produtosEntregues);
            json.put("gerenteProj",this.gerenteProj);
            json.put("stats", this.stats);            
            return json;
        }//fim do metodo toJson
        
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
        JSONArray jP = new JSONArray();
        if(!base.isEmpty() )
            jP = new JSONArray(base);   
        if (flag==1) {
            jP.put(json);
        }
        if (flag==2) {
        	jP.put(index,json);
        }
        if(flag==3) {
        	jP.remove(index);
        }
        Arquivo.Write(Caminho,jP.toString());
       
        return true;
    }//fim do metodo Persistir
           
           
     /**
     * O m�todo getProjeto tem como objetivo criar um ArrayList do tipo Projeto com todos os projetos que forem
     * instanciados. Para isso � feita uma leitura na base de dados, caso esteja v�zio retorna nulo, caso 
     * contr�rio � criado um vetor de JSON com base no banco de dados, sendo exra�do cada JSONObject do vetor de
     * JSON. Com base no JSONObject � gerado um novo Projeto. Cada Projeto gerado � inclu�do no vetor de projetos,
     * retornando projetos.
     * @return projetos
     */
    public static ArrayList<Projeto> getProjeto(){
        ArrayList<Projeto> projetos = new ArrayList();
        String base = Arquivo.Read(Caminho);
        if(base.isEmpty())
            return null;    
        JSONArray jP = new JSONArray(base);
        for(int i=0;i<jP.length();i++){           
            Projeto P = new Projeto(jP.getJSONObject(i)); 
            projetos.add(P);       
	}
        return projetos;
    }//fim do metodo getProjeto
    
    /**
     * O metodo toString tem como objetivo definir uma sa�da de String padr�o para a classe Projeto
     * @return nomeProjeto 
     */
       
    @Override 
    public String toString(){
        return nomeProjeto;
    }
}
    