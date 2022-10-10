package Util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * A classe ValidaData tem como objetivo facilitar o trabalho com a manipulação de datas e casos de testes que 
 * necessitem a comparação de duas datas distintas.
 * 
 * @author Pedro Henrique 
 * @version 3.0 (nov. 2020)
 * 
 */

public class ValidaData {
	//atributos
    private Timestamp data;
    public static final String BarraSemHora="dd/MM/yyyy";
    public static final String BarraComHora="dd/MM/yyyy hh:mm";
    public static final String HifenSemHora="yyyy-MM-dd";
    public static final String HifenComHora="yyyy-MM-dd hh:mm:ss";
    /**
     * O construtor de ValidaData sem parâmetros mostra a data atual do sistema.
     */
    public ValidaData() {
        Timestamp timestamp = null;  
        try { 
            Timestamp agora = new Timestamp(System.currentTimeMillis());
            SimpleDateFormat formatoData = new SimpleDateFormat(HifenComHora);
            Calendar c = Calendar.getInstance();  
            c.setTime(formatoData.parse(agora.toString()));  
            timestamp = new Timestamp(c.getTimeInMillis());  
        } catch (Exception e) { 
            System.err.println(e.getMessage());
        }
        this.data = timestamp;
    }
    /**
     * O construtor de ValidaData passadando Data como parametro mostra a data digitada pelo Usuário
     * @param Data Data Digitada Pelo Usuário
     */
    
    public ValidaData(Timestamp Data) {
        this.data = Data;
    }
    /**
     * O Construtor de ValidaData passando como parametro Data e Format formata a dada digitada pelo usuário conforme
     * as diretrizes específicadas.
     * @param Data Data Digitada 
     * @param Format Formato desejado
     */
    
    public ValidaData(String Data,String Format) {
        if(Format.isEmpty())
            Format=BarraComHora;
        
        //if(Format.equals(BarraSemHora) || Format.equals(HifenSemHora))
            //Data+=" 00:00:00";
        
        Timestamp timestamp = null;
        try {  
            SimpleDateFormat formatoData = new SimpleDateFormat(Format);  
            Calendar c = Calendar.getInstance();  
            c.setTime(formatoData.parse(Data));  
            timestamp = new Timestamp(c.getTimeInMillis());  
        } catch (Exception e) { 
            System.err.println(e.getMessage());
        }  
        this.data = timestamp;
    }
    /**
     * O metodo getDataString retorna a data conforme o formato dd/MM/yyyy, ou seja dia mês e ano.
     * @return dataS
     */
    public String getDataString(){
        String dataS = this.data.toString().split(" ")[0];
        return dataS.split("-")[2]+"/"+dataS.split("-")[1]+"/"+dataS.split("-")[0];
    }
    /**
     * O metodo getTimestamp retorna a data no formato Timestamp.
     * @return data
     */
    public Timestamp getTimestamp() {
        return data;
    }    
}
