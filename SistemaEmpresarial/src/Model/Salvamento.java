
package Model;

import json.JSONObject;//A importação é necessária para criação do metodo abstrado do tipo JSONObject
/**
 * Essa classe é uma interface, por tanto possui apenas métodos do tipo abstrato que serão implementados por outras 
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
