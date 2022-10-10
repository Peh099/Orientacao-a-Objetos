package Controller;

import Model.Projeto;// A importa��o da classe Projeto � necess�ria para criar novos projetos.
import java.util.ArrayList;//Importa��o necess�ria para criar ArrayList

/**
 * A classe ProjetoControll � respons�vel por controlar os dados que entram e saem da interface gr�fica em dire��o ao 
 * banco de dados. � ela que faz a intermedia��o entre a camada View e a camada Model.
 *  @author Pedro Henrique
 *  @version 3.0 (nov. 2020)
 */
public class ProjetoControll {
	/**
	 * O m�todo SalvarProjeto faz intermedia��o entre a camada View e Model e � respons�vel por coletar tudo aquilo 
     * que foi passado pelo usu�rio e salvar na base de dados. Para isso � criado um novo Projeto com os valores de
     * cada atributo que foram passados pelo usu�rio. 
	 * @param codigoProjeto Codigo do Projeto
	 * @param nomeProjeto Nome do Projeto
	 * @param dataInicio Data de Inicio do Projeto
	 * @param dataFinalizacao Data de Finaliza��o do Projeto
	 * @param atividadesDesenvolvidas Atividades Desenvolvidas no Projeto
	 * @param stakeholders Stakeholder do Projeto
	 * @param historico Hist�rico do Projeto
	 * @param ProdutosEntregues Produtos Entregues pelo Projeto
	 * @param gerenteProj Gerente do Projeto
	 * @param stats Status do Projeto
	 * @return boolean
	 */
    public static boolean SalvarProjeto(int codigoProjeto,String nomeProjeto, String dataInicio, String dataFinalizacao,
                                     String atividadesDesenvolvidas, String stakeholders, 
                                     String historico,String ProdutosEntregues,String gerenteProj,String stats){
        
        Projeto p= new Projeto(codigoProjeto,nomeProjeto,dataInicio,dataFinalizacao,atividadesDesenvolvidas,stakeholders,historico,ProdutosEntregues,gerenteProj,stats);
        return p.Persistir();        
        }
    /**
     * O m�todo getProjetos � respons�vel por criar um ArrayList de vetor de String, sendo assim, cada posi��o do 
     * ArrayList ter� um vetor de String, esse vetor de String ter� uma posi��o para cada atributo de Projeto. Para
     *  isso,  � coletado um ArrayList de projetos que a camada Model retorna. Se o ArrayList de projetos n�o estiver
     *  nulo o m�todo retorna um ArrayList de vetor de String.
     * @return ArrayList
     */
    
    public static ArrayList<String[]> getProjetos(){
        ArrayList<String[]> Projetos = new ArrayList();
        
        ArrayList<Projeto> P = Projeto.getProjeto();
        if(P!=null){
        for(int i=0;i<P.size();i++){
            String p[] = new String[10];                    
            p[0] = Integer.toString(P.get(i).getCodigoProjeto());
            p[1] = P.get(i).getNomeProjeto();
            p[2] = P.get(i).getDataInicio();
            p[3] = P.get(i).getDataFinalizacao();      
            p[4] = P.get(i).getAtividadesDesenvolvidas();
            p[5] = P.get(i).getStakeholders();
            p[6] = P.get(i).getHistorico();
            p[7] = P.get(i).getProdutosEntregues();
            p[8] = P.get(i).getGerenteProj();
            p[9] = P.get(i).getStats();
            
            Projetos.add(p);
        }
        }
        return Projetos;
    }
    /**
     * O m�todo getProjetos � respons�vel por criar um ArrayList de vetor de String, sendo assim, cada posi��o do 
     * ArrayList ter� um vetor de String, esse vetor de String ter� uma posi��o para o nome e uma posi��o para o
     * gerente do projeto. Para isso,  � coletado um ArrayList de projetos que a camada Model retorna. Se o 
     * ArrayList de projetos n�o estiver nulo o m�todo retorna um ArrayList de vetor de String.
     * @return ArrayList
     */
    public static ArrayList<String[]> getProjetos2(){
        ArrayList<String[]> Projetos = new ArrayList();
        
        ArrayList<Projeto> P = Projeto.getProjeto();
        if(P!=null){
        for(int i=0;i<P.size();i++){
            String p[] = new String[10];                    
            p[0] = P.get(i).getNomeProjeto();
            p[1] = P.get(i).getGerenteProj();          
            Projetos.add(p);
        }
        }
        return Projetos;
    }
    
}