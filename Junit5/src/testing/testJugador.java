package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabean.Jugador;

class testJugador {
	// CREAMOS UN JUGADOR PARA PROBAR LOS TESTS
	  private Jugador jug1;
	  
	  @BeforeEach 
	  
	  void ini() {
	    jug1 = new Jugador();
	  }
	  
	  @AfterEach
	  
	  void fin( ) {
	    jug1 = null;
	  }
	

	
	/**
	 * TEST 1 :
	 * Asignamos un numero de dorsal positivo : 5
	 * Resultado esperado = 5
	 */
	@Test
	void testPonerDorsal5() {
		int resultado, resultadoEsperado;
		jug1.ponerDorsal(5);
		
		resultado = jug1.getDorsal();
		resultadoEsperado = 5;
		
		assertEquals(resultado, resultadoEsperado);	
	}
	
	/**
	 * TEST 2 :
	 * Asignamos un numero de dorsal 0
	 * Resultado esperado = -1
	 */
	@Test
	void testPonerDorsal0() {
		int resultado, resultadoEsperado;
		jug1.ponerDorsal(0);
		
		resultado = jug1.getDorsal();
		resultadoEsperado = -1;
		
		assertEquals(resultado, resultadoEsperado);	
	}

	/**
	 * TEST 3 :
	 * Asignamos un numero de dorsal 40
	 * Resultado esperado = -1
	 */
	@Test
	void testPonerDorsal40() {
		int resultado, resultadoEsperado;
		jug1.ponerDorsal(40);
		
		resultado = jug1.getDorsal();
		resultadoEsperado = -1;
		
		assertEquals(resultado, resultadoEsperado);	
	}
	
	
	
	/**
	 * TEST 1 :
	 * Pasamos un numero de tarjetas amarillas = 2
	 * Resultado esperado estaExpulsado : true
	 */
	@Test
	void estaExpulsadoTatjAmarillas() {
		jug1.setNumeroTarjetasAmarillas(2);
		
		assertTrue(jug1.estaExpulsado());
	}
	
	
	/**
	 * TEST 2
	 * Pasamos un numero de tarjetas rojas = 1
	 * Resultado esperado estaExpulsado : true
	 */
	@Test
	void estaExpulsadoTarjRoja() {
		jug1.setNumeroTarjetasRojas(1);
		
		assertTrue(jug1.estaExpulsado());
	}
	
	
	/**
	 * TEST 3 :
	 * Pasamos un numero de tarjetas amarillas = 1
	 * Resultado esperado estaExpulsado : false
	 */
	@Test
	void estaExplusadoNo() {
		jug1.setNumeroTarjetasAmarillas(1);
		
		assertFalse(jug1.estaExpulsado());
	}
	
}
