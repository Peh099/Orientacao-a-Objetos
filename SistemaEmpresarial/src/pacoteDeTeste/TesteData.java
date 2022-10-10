package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Util.*;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


class TesteData {
	//atributos
	private String dAleatoria="20/12/2000";
	//metodos
	/**
	 * O metodo getDateTime � um m�todo simples que retorna a data atual do sistema. Ele foi criado para
	 * que se possa fazer o teste unit�rio do m�todo testDataAtual.
	 * @return dateFormat.format(date)
	 */
	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
		//retorna a data atual
	}
	
	/**
	 * O metodo testDataAtual faz o teste unit�rio para ter a certeza que a data retornada pelo metodo da 
	 * classe ValidaData realmente � a data atual do sistema.
	 */
	@Test
	void testDataAtual() {	
		
		ValidaData d=new ValidaData();
		String dAtual=d.getDataString();
		
		/*
		 * 1) Verifica se a data recebida pela classe ValidaData realmente � a data atual do sistema.
		 */
		
		assertEquals(dAtual,this.getDateTime());
		/*
		 * 2) Verifica se a data aleatoria passada realmente � diferente da data atual do sistema.
		 */		
		assertNotEquals(dAtual, dAleatoria);		
	}
	
	/**
	 * O metodo testDataPassada verifica se a data passada realmente corresponde com o formato desejado.
	 */
	@Test
	void testDataPassada() {
		 ValidaData D= new ValidaData("01/01/1994",ValidaData.BarraSemHora);//data passada | formato
		 String dPassada=D.getDataString();
		 //1) verifica se o construtor realmente est� atribuindo a data desejada ao atributo.
		 assertEquals(dPassada,"01/01/1994");
		 //2) verifica se a data passada � diferente da data aleat�ria.
		 assertNotEquals(dPassada,dAleatoria);
		 
	}

}
