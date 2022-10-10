package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Util.*;
/**
 * A classe TesteArquivo � respons�vel por fazer os testes unit�rios referentes � classe Arquivo
 * @author Pedro Henrique
 * @version 3.0 (nov. 2020)
 *
 */



class TesteArquivo {
	//atributos
	private final static String Caminho="ArquivoDeTeste.txt";
	/**
	 * O m�todo testRead � respons�vel por fazer os testes unit�rios relacionados aos m�todos Write e Read
	 * da classe Arquivo
	 */
	@Test
	void testRead() {
		/*1) Verifica se o arquivo de testo est� sendo lido da maneira correta, para isso escreve dentro
		 * do arquivo e depois verifica se o conte�do corresponde com aquilo que foi escrito
		*/
		String Texto="TESTANDO A ESCRITA\n";	
		String a;
		Arquivo.Write(Caminho,Texto);
		a=Arquivo.Read(Caminho);
		assertEquals(Texto,a);	
		Arquivo.Write(Caminho,"");
		/*2)Verifica se o arquivo est� v�ziom, para isso compara uma String v�zia com o conte�do do 
		 * arquivo.
		*/
		String b="";
		b=Arquivo.Read(Caminho);
		assertEquals("",b);
				
	}
}
