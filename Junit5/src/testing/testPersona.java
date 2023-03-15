package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabean.Persona;

class testPersona {
	
	private Persona p1,p2;

	@BeforeEach
	void setUp() throws Exception {
		 p1 = new Persona();
		 p2 = new Persona();
	}

	@AfterEach
	void tearDown() throws Exception {
		 p1 = null;
		 p2 = null;
	}

	
	/**
	 * TEST 1 :
	 * Indicamos una posicion inicial = 0 y camninar = 5
	 * Resultado esperado = 5
	 */
	@Test
	void caminar5() {
		p1.setPosicion(0);
		p1.caminar(5);
		
		int resultadoEsperado = 5;
		int resultadoObtenido = p1.getPosicion();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	
	
	/**
	 * TEST 2 :
	 * Indicamos una distancia inicial de 30 y caminar = 20
	 * Resultado esperado = 50
	 */
	@Test 
	void caminar20() {
		p1.setPosicion(30);
		p1.caminar(20);
		
		int resultadoEsperado = 50;
		int resultadoObtenido = p1.getPosicion();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	
	
	/**
	 * Test 1:
	 * Le indicamos una edad = 30
	 */
	@Test
	void personaMayor1() {
		p1.setEdad(30);
		p2.setEdad(40);
	}
	
}
