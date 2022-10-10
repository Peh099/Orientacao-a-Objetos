package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Util.*;
/**
 * A classe TesteArquivo é responsável por fazer os testes unitários referentes à classe Arquivo
 * @author Pedro Henrique
 * @version 3.0 (nov. 2020)
 *
 */



class TesteArquivo {
	//atributos
	private final static String Caminho="ArquivoDeTeste.txt";
	/**
	 * O método testRead é responsável por fazer os testes unitários relacionados aos métodos Write e Read
	 * da classe Arquivo
	 */
	@Test
	void testRead() {
		/*1) Verifica se o arquivo de testo está sendo lido da maneira correta, para isso escreve dentro
		 * do arquivo e depois verifica se o conteúdo corresponde com aquilo que foi escrito
		*/
		String Texto="TESTANDO A ESCRITA\n";	
		String a;
		Arquivo.Write(Caminho,Texto);
		a=Arquivo.Read(Caminho);
		assertEquals(Texto,a);	
		Arquivo.Write(Caminho,"");
		/*2)Verifica se o arquivo está váziom, para isso compara uma String vázia com o conteúdo do 
		 * arquivo.
		*/
		String b="";
		b=Arquivo.Read(Caminho);
		assertEquals("",b);
				
	}
}
