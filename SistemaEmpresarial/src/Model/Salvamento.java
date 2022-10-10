
package Model;

import json.JSONObject;//A importa��o � necess�ria para cria��o do metodo abstrado do tipo JSONObject
/**
 * Essa classe � uma interface, por tanto possui apenas m�todos do tipo abstrato que ser�o implementados por outras 
 * classes
 * 
 * @author pedro
 * @version 3.0 (nov.2020)
 * 
 */
public interface Salvamento {
	
    public abstract JSONObject toJson();
    public abstract boolean Persistir();   
}
