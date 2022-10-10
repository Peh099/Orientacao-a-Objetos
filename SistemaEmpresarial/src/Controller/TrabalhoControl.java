package Controller;

import Model.Trabalho;// A importação da classe Trabalho é necessária para criar novos trabalhos.
import java.util.ArrayList;//Importação necessária para criar ArrayList

/**
 * A classe TrabalhoControl é responsável por controlar os dados que entram e saem da interface gráfica em direção ao 
 * banco de dados. É ela que faz a intermediação entre a camada View e a camada Model.
 *  @author Pedro Henrique
 *  @version 3.0 (nov. 2020)
 */
public class TrabalhoControl {
    //static ArrayList<Operario> listaDeOperarios=Operario.getOperarios();
	/**
	 * O método SalvarTrabalho faz intermediação entre a camada View e Model e é responsável por coletar tudo aquilo 
     * que foi passado pelo usuário e salvar na base de dados. Para isso é criado um novo Trabalho com os valores de
     * cada atributo que foram passados pelo usuário. 
	 * @param codigoTrab Codigo do Trabalho
	 * @param nomeTrabalho Nome do Trabalho
	 * @param caracteristicas Caracteristicas do Trabalho
	 * @param periodo Periodo do Trabalho
	 * @param operario1 Primeiro Operario do Trabalho
	 * @param operario2 Segundo Operario do Trabalho
	 * @param operario3 Terceiro Operario do Trabalho
	 * @param operario4 Quarto Operario do Trabalho
	 * @param statusTrabalho Status do Trabalho
	 * @return boolean
	 */
    public static boolean SalvarTrabalho(int codigoTrab,String nomeTrabalho,String caracteristicas,String periodo,String operario1,String operario2,String operario3,String operario4,String statusTrabalho){  
        Trabalho t= new Trabalho(codigoTrab,nomeTrabalho,caracteristicas,periodo,operario1,operario2,operario3,operario4,statusTrabalho);
        return t.Persistir();        
        }
    /**
     * O método getTrabalhos é responsável por criar um ArrayList de vetor de String, sendo assim, cada posição do 
     * ArrayList terá um vetor de String, esse vetor de String terá uma posição para cada atributo de Trabalho. Para
     *  isso,  é coletado um ArrayList de trabalhos que a camada Model retorna. Se o ArrayList de trabalhos não estiver
     *  nulo o método retorna um ArrayList de vetor de String.
     * @return ArrayList
     */
    
    public static ArrayList<String[]> getTrabalhos(){
        ArrayList<String[]> Trabalhos = new ArrayList();
        
        ArrayList<Trabalho> T = Trabalho.getTrabalhos();
        if(T!=null){
        for(int i=0;i<T.size();i++){
            String t[] = new String[10];                    
            t[0] = Integer.toString(T.get(i).getCodigoTrab());
            t[1] = T.get(i).getNomeTrabalho();
            t[2] = T.get(i).getCaracteristicas();   
            t[3] = T.get(i).getPeriodo();
            t[4] = T.get(i).getOperario1();
            t[5] = T.get(i).getOperario2();
            t[6] = T.get(i).getOperario3();
            t[7] = T.get(i).getOperario4();
            t[8] = T.get(i).getStatusTrabalho();
    
            Trabalhos.add(t);
        }
        }
        return Trabalhos;
    }
}