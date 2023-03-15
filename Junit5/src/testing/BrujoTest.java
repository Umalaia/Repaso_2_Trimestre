package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabean.Brujo;

class BrujoTest {
	private Brujo brujo;

	@BeforeEach
	void setUp() throws Exception {
		brujo = new Brujo();
	}

	@AfterEach
	void tearDown() throws Exception {
		brujo = null;
	}

	/**
	 * Test 1 : Le pasamos por parametro un numero de poder negativo
	 * El resultado esperado sera poder = 0
	 */
	@Test
	void testPoder1() {
		int resultado, resultadoEsperado;
		brujo.setPoder(-10);
		
		resultado = brujo.getPoder();
		resultadoEsperado = 0;
		
		assertEquals(resultado, resultadoEsperado);
	}
	
	
	/**
	 * Test 2 : Le pasamos numero de poder = 10
	 * Resultado esperado = 10
	 */
	@Test
	void testPoder2() {
		int resultado, resultadoEsperado;
		brujo.setPoder(10);
		
		resultado = brujo.getPoder();
		resultadoEsperado = 10;
		
		assertEquals(resultado, resultadoEsperado);
	}
	
	
	
	/**
	 * Test 1 : Le pasamos por parametro tieneAlma = false , y vida = 1
	 * Resultado esperado estaMuerto = true , ya que no tiene alma
	 */
	@Test
	void estaMuertoSinAlma() {
		brujo.setTieneAlma(false);
		brujo.setVida(1);
		
		assertTrue(brujo.estaMuerto());
	}
	
	/**
	 * Test 2 : Le pasamos por parametro tiene alma = true, y vida = 0
	 * Resultado esperado estaMuerto = true , ya que no tiene vida
	 */
	void estaMuertoSinVida() {
		brujo.setTieneAlma(true);
		brujo.setVida(0);
		
		assertTrue(brujo.estaMuerto());
	}
	
	
	/**
	 * Test 3 : Le pasamos por parametro tiene alma = true y vida = 10
	 * Resultado esperado estaMuerto = false, ya que tiene vida y alma
	 */
	void estaMuertoNo() {
		brujo.setTieneAlma(true);
		brujo.setVida(10);
		
		assertFalse(brujo.estaMuerto());
	}
	
	
}
