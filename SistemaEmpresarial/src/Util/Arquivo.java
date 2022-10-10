package Util;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
// As importa��es s�o necess�rias para leitura e escrita de arquivos de texto ou para tratamento de excess�es. 
/**
 * A classe ArquivoGerente � respons�vel por fazer a leitura ou escrita de novos gerentes na base de dados.
 * @author Pedro Henrique
 * @version 3.0 (nov.2020)
 */
public class Arquivo {
	
    
    /**
     * O m�todo Read � respons�vel por ler tudo aquilo que estiver escrito dentro do arquivo no diret�rio espec�ficado.
     * Para fazer a leitura, primeiro � criado um FileReader do caminho especificado e em cima desse FileReader � criado
     * um BufferedReader, criando assim um Buffer que l� cada parte do arquivo e vai alimentando at� entregar tudo 
     * aquilo que estiver escrito. Essa leitura � feita linha a linha, caso a linha seja diferente de nulo o conte�do
     * recebe o que estiver na linha, caso contr�rio ele retorna em branco e � apresentado a mensagem de erro.
     * @return String 
     * @param Caminho Diret�rio do Arquivo
     */
    public static String Read(String Caminho){
        String conteudo="";
        try {
            FileReader arq=new FileReader(Caminho);
            BufferedReader lerArq=new BufferedReader(arq);
            String linha="";
            try{
                linha=lerArq.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;               
            }catch (IOException ex){
                System.out.println("Erro: N�o foi possivel ler o arquivo!");
                return "";
            }           
        } catch (FileNotFoundException ex) {
             System.out.println("Erro: N�o foi possivel encontrar o arquivo!");
             return "";
        }
    }
        /**
         * O metodo Write � respons�vel por escrever um novo gerente dentro do arquivo. Pra isso ele verifica a exist�ncia
         * do arquivo especificado, criando assim um FileWriter e com base nesse FireWriter ele cria um PrintWriter, que 
         * imprime o valor correspondente com base no arquivo que est� sendo apontado. Caso tudo d� certo retorna true,
         * caso contr�rio retorna false e a mensagem referente ao erro.
         * @param Texto Texto Que Ser� Escrito no Arquivo 
         * @param Caminho Diret�rio Para o Arquivo
         * @return boolean
         */
        public static boolean Write(String Caminho,String Texto){
            try{
                FileWriter arq=new FileWriter(Caminho);
                PrintWriter gravarArq=new PrintWriter (arq);
                gravarArq.print(Texto);
                gravarArq.close();
                return true;
            }catch(IOException e){
                System.out.println(e.getMessage());
                        return false;
        }
    }
    
}
