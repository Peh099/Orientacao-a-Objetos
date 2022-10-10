package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Controller.GerenteControll;
import Model.Gerente;
import java.lang.ModuleLayer.Controller.*;
//As importações são necessárias para fazer os testes referentes ao metodo da classe GerenteControll
/**
 * A classe TesteControl é responsável por fazer os testes unitários referentes às classes do pacote controller
 * 
 * @author Pedro Henrique
 * @version 3.0 (nov. 2020)
 *
 */


class TesteControl {
	/**
	 * O método testSalvarGerente faz o teste unitário com relação ao metodo Salvar pertencente à classe 
	 * GerenteControll do pacote Controller.
	 */
	@Test
	void testSalvarGerente() {
		/*1)Verifica se o método está conseguindo salvar um novo Gerente na base de dados, para isso é
		 * passado os valores corretos para cada parâmetro.
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
