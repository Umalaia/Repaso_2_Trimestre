package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabean.Soldado;

class SoldadoTest {
	private Soldado sol1, sol2;
	
	@BeforeEach
	void setUp() throws Exception {
		sol1 = new Soldado();
		sol2 = new Soldado();
	}

	@AfterEach
	void tearDown() throws Exception {
		sol1 = null;
		sol2 = null;
	}

	
	/**
	 * Test 1 : Le pasamos por parametro un numero de balas positivo
	 * Resultado esperado puedeDisparar = true
	 */
	@Test
	void PuedeDispararSi() {
		sol1.setNumeroBalas(10);
		
		assertTrue(sol1.puedeDisparar());
	}
	
	
	/**
	 * Test 2 : Le pasamos por parametro un numero de balas = 0
	 * Resultado esperado puedeDisparar = false
	 */
	@Test
	void PuedeDispararNo() {
		sol1.setNumeroBalas(0);
		
		assertFalse(sol1.puedeDisparar());
	}
	
	
	/**
	 * Test 1 : Le pasamos por parametro numero de balas = 10, y sol2 estaMuerto = true
	 * Resultado esperado numero de balas = 9. 
	 * sol1 dispara a sol2. 
	 * Resultado esperado sol2 estaMuerto = true
	 */
	@Test
	void dispararSi() {
		int resultado, resultadoEsperado;
		sol1.setNumeroBalas(10);
		sol1.disparar(sol2);
		
		
		resultado = sol1.getNumeroBalas();
		resultadoEsperado = 9;
		
		assertEquals(resultado, resultadoEsperado);
		
		assertTrue(sol2.isEstaMuerto());
		
	}
	
	
}
