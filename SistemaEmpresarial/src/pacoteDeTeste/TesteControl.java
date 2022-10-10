package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Controller.GerenteControll;
import Model.Gerente;
import java.lang.ModuleLayer.Controller.*;
//As importa��es s�o necess�rias para fazer os testes referentes ao metodo da classe GerenteControll
/**
 * A classe TesteControl � respons�vel por fazer os testes unit�rios referentes �s classes do pacote controller
 * 
 * @author Pedro Henrique
 * @version 3.0 (nov. 2020)
 *
 */


class TesteControl {
	/**
	 * O m�todo testSalvarGerente faz o teste unit�rio com rela��o ao metodo Salvar pertencente � classe 
	 * GerenteControll do pacote Controller.
	 */
	@Test
	void testSalvarGerente() {
		/*1)Verifica se o m�todo est� conseguindo salvar um novo Gerente na base de dados, para isso �
		 * passado os valores corretos para cada par�metro.
		 */
		boolean b;
		b=GerenteControll.SalvarGerente(1,"Francisco", "Correios",
            8,460,
            "Gerente", "61996999999", "Quadra 207",
            4300,"Gerencia", "Masculino",
            "09/04/1967","Projeto1");
		assertTrue(b);
		
	}

}
