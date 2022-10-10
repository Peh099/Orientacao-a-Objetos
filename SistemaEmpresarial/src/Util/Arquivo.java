package Util;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
// As importações são necessárias para leitura e escrita de arquivos de texto ou para tratamento de excessões. 
/**
 * A classe ArquivoGerente é responsável por fazer a leitura ou escrita de novos gerentes na base de dados.
 * @author Pedro Henrique
 * @version 3.0 (nov.2020)
 */
public class Arquivo {
	
    
    /**
     * O método Read é responsável por ler tudo aquilo que estiver escrito dentro do arquivo no diretório específicado.
     * Para fazer a leitura, primeiro é criado um FileReader do caminho especificado e em cima desse FileReader é criado
     * um BufferedReader, criando assim um Buffer que lê cada parte do arquivo e vai alimentando até entregar tudo 
     * aquilo que estiver escrito. Essa leitura é feita linha a linha, caso a linha seja diferente de nulo o conteúdo
     * recebe o que estiver na linha, caso contrário ele retorna em branco e é apresentado a mensagem de erro.
     * @return String 
     * @param Caminho Diretório do Arquivo
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
                System.out.println("Erro: Não foi possivel ler o arquivo!");
                return "";
            }           
        } catch (FileNotFoundException ex) {
             System.out.println("Erro: Não foi possivel encontrar o arquivo!");
             return "";
        }
    }
        /**
         * O metodo Write é responsável por escrever um novo gerente dentro do arquivo. Pra isso ele verifica a existência
         * do arquivo especificado, criando assim um FileWriter e com base nesse FireWriter ele cria um PrintWriter, que 
         * imprime o valor correspondente com base no arquivo que está sendo apontado. Caso tudo dê certo retorna true,
         * caso contrário retorna false e a mensagem referente ao erro.
         * @param Texto Texto Que Será Escrito no Arquivo 
         * @param Caminho Diretório Para o Arquivo
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
