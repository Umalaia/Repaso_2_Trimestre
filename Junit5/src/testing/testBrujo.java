package testing;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabean.Brujo;

class testBrujo {
	Brujo brujo = new Brujo();
	
	
	/**
	 * Test 1, se indica que el poder = 0
	 * Valor esperado = 0
	 * 
	 */
	@Test
	void setPoder0() {
		int resultadoEsperado, resultado;
		brujo.setPoder(0);
		
		resultadoEsperado = 0;
		resultado = brujo.getPoder();
		
		assertEquals(resultadoEsperado,resultado);
		
	}

	/**
	 * Test 2. Se le pasa por parametro poder = 50
	 * Resultado esperado = 50
	 */
	@Test
	void setPoder50() {
		int resultadoEsperado, resultado;
		brujo.setPoder(50);
		resultadoEsperado = 50;
		resultado = brujo.getPoder();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	/**
	 * Test 3. Se lepasa por parametro poder = -10
	 * Resultado esperado = 0
	 */
	@Test
	void setPodernegativo() {
		int resultadoEsperado, resultado;
		brujo.setPoder(-10);
		resultado = brujo.getPoder();
		resultadoEsperado = 0;
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	
	
	/**
	 * Test 1. Se establece el numero de vida = 0
	 * tieneAlma = true
	 * resultado esperado true
	 */
	@Test
	void estaMuertoSi() {
		brujo.setVida(0);
		brujo.setTieneAlma(true);
		assertTrue(brujo.estaMuerto());
	}
	
	
	/**
	 * Test 2 . Se establece el numero de vida = 10
	 * tieneAlma = true
	 * resultado esperado = false
	 * 
	 */
	@Test
	void estaMuertoNo() {
		brujo.setVida(10);
		brujo.setTieneAlma(true);
		
		assertFalse(brujo.estaMuerto());
	}
	
	/**
	 * Test 3. Se establece vida = 10
	 * tieneAlma = false
	 * resultado esperado = true
	 */
	@Test
	void estaMuertoSi2() {
		brujo.setVida(10);
		brujo.setTieneAlma(false);
		
		assertTrue(brujo.estaMuerto());
	}
	
	/**
	 * Test 4 vida = 0
	 * alma = false
	 */
	@Test
	void estaMuertoSi3(){
		brujo.setVida(0);
		brujo.setTieneAlma(false);
		
		assertTrue(brujo.estaMuerto());
	}
}
