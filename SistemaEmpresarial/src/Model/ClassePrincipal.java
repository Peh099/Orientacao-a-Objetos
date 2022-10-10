package Model;



import Util.ValidaData;
import View.TelaLogin;
/**
 * A classe principal funciona com o objetivo de inicializar a Tela de Login como primeira tela do projeto
 * @author Pedro Henrique
 * @version 3.0(nov. 2020)
 *
 */

public class ClassePrincipal {
	
	public static void main(String[] args) {
           TelaLogin vise= new TelaLogin();
            vise.setVisible(true);       
        }
    }