package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabean.Jugador;

class JugadorTest {
	private Jugador jug1;
	
	@BeforeEach
	void setUp() throws Exception {
		jug1 = new Jugador();
	}

	@AfterEach
	void tearDown() throws Exception {
		jug1 = null;
	}
	

	/**
	 * TEST 1 : Le pasamos por parametro un numero de dorsal = 1
	 * El resultado esperado sería = 1
	 */
	@Test
	void ponerDorsal1() {
		int resultado, resultadoEsperado;
		jug1.ponerDorsal(1);
		resultado = jug1.getDorsal();
		resultadoEsperado = 1;
		
		assertEquals(resultado, resultadoEsperado);
		
	}
	
	
	/**
	 * TEST 2 : Le pasamos por parametro un numero de dorsal = 45
	 * El resultado esperado sería = -1
	 */
	@Test
	void ponerDorsal45() {
		int resultado, resultadoEsperado;
		jug1.ponerDorsal(45);
		resultado = jug1.getDorsal();
		resultadoEsperado = -1;
		
		assertEquals(resultado, resultadoEsperado);
	}
	
	
	/**
	 * TEST1 : Le pasamos por parametro numero de tarjetas amarillas = 2
	 * Resultado esperado estaExpulsado = true
	 */
	@Test
	void estaExpulsadoTarjAmarillas() {
		jug1.setNumeroTarjetasAmarillas(2);
		
		assertTrue(jug1.estaExpulsado());
	}
	
	
	@Test
	void estaExpulsadoNo() {
		jug1.setNumeroTarjetasAmarillas(0);
		
		assertFalse(jug1.estaExpulsado());
	}
	

}
