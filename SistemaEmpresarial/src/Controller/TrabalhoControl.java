package Controller;

import Model.Trabalho;// A importa��o da classe Trabalho � necess�ria para criar novos trabalhos.
import java.util.ArrayList;//Importa��o necess�ria para criar ArrayList

/**
 * A classe TrabalhoControl � respons�vel por controlar os dados que entram e saem da interface gr�fica em dire��o ao 
 * banco de dados. � ela que faz a intermedia��o entre a camada View e a camada Model.
 *  @author Pedro Henrique
 *  @version 3.0 (nov. 2020)
 */
public class TrabalhoControl {
    //static ArrayList<Operario> listaDeOperarios=Operario.getOperarios();
	/**
	 * O m�todo SalvarTrabalho faz intermedia��o entre a camada View e Model e � respons�vel por coletar tudo aquilo 
     * que foi passado pelo usu�rio e salvar na base de dados. Para isso � criado um novo Trabalho com os valores de
     * cada atributo que foram passados pelo usu�rio. 
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
     * O m�todo getTrabalhos � respons�vel por criar um ArrayList de vetor de String, sendo assim, cada posi��o do 
     * ArrayList ter� um vetor de String, esse vetor de String ter� uma posi��o para cada atributo de Trabalho. Para
     *  isso,  � coletado um ArrayList de trabalhos que a camada Model retorna. Se o ArrayList de trabalhos n�o estiver
     *  nulo o m�todo retorna um ArrayList de vetor de String.
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