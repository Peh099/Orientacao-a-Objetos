package Controller;

import Model.Projeto;// A importação da classe Projeto é necessária para criar novos projetos.
import java.util.ArrayList;//Importação necessária para criar ArrayList

/**
 * A classe ProjetoControll é responsável por controlar os dados que entram e saem da interface gráfica em direção ao 
 * banco de dados. É ela que faz a intermediação entre a camada View e a camada Model.
 *  @author Pedro Henrique
 *  @version 3.0 (nov. 2020)
 */
public class ProjetoControll {
	/**
	 * O método SalvarProjeto faz intermediação entre a camada View e Model e é responsável por coletar tudo aquilo 
     * que foi passado pelo usuário e salvar na base de dados. Para isso é criado um novo Projeto com os valores de
     * cada atributo que foram passados pelo usuário. 
	 * @param codigoProjeto Codigo do Projeto
	 * @param nomeProjeto Nome do Projeto
	 * @param dataInicio Data de Inicio do Projeto
	 * @param dataFinalizacao Data de Finalização do Projeto
	 * @param atividadesDesenvolvidas Atividades Desenvolvidas no Projeto
	 * @param stakeholders Stakeholder do Projeto
	 * @param historico Histórico do Projeto
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
     * O método getProjetos é responsável por criar um ArrayList de vetor de String, sendo assim, cada posição do 
     * ArrayList terá um vetor de String, esse vetor de String terá uma posição para cada atributo de Projeto. Para
     *  isso,  é coletado um ArrayList de projetos que a camada Model retorna. Se o ArrayList de projetos não estiver
     *  nulo o método retorna um ArrayList de vetor de String.
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
     * O método getProjetos é responsável por criar um ArrayList de vetor de String, sendo assim, cada posição do 
     * ArrayList terá um vetor de String, esse vetor de String terá uma posição para o nome e uma posição para o
     * gerente do projeto. Para isso,  é coletado um ArrayList de projetos que a camada Model retorna. Se o 
     * ArrayList de projetos não estiver nulo o método retorna um ArrayList de vetor de String.
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