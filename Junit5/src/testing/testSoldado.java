package testing;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabean.Soldado;

class testSoldado {
	
	// Creamos dos soldados para realizar las pruebas de los test
	Soldado sol1 = new Soldado();
	Soldado sol2 = new Soldado();
	
	
	// PRUEBAS METODO PUEDE DISPARAR
	
	/**
	 *  TEST 1 :
	 *  Pasamos por parametro el numero de balas = 10
	 *  Resultado esperado: true
	 */
	@Test
	void puedeDispararSi() {
		sol1.setNumeroBalas(10);
		
		assertTrue(sol1.puedeDisparar());
	}
	
	/**
	 * TEST 2 :
	 * Pasamos por parametro el numero de balas = 0
	 * Resultado esperado = false
	 */
	@Test
	void puedeDispararNo() {
		sol1.setNumeroBalas(0);
		
		assertFalse(sol1.puedeDisparar());
	}
	
	/**
	 * TEST 3
	 * Pasamos por parametro un numero de balas negativo = -10
	 * Resultado esperado : false
	 */
	@Test
	void puedeDisparar() {
		sol1.setNumeroBalas(-10);
		
		assertFalse(sol1.puedeDisparar());
	}
	
	
	// PRUEBAS METODO DISPARAR
	
	
	/**
	 * TEST 1
	 * Pasamos por parametro numero de balas = 10.
	 * Resultado esperado numero de balas = 9.
	 * Pasamos que el soldado 1 dispara al soldado 2
	 * Resultado esperado soldado 1: estaMuerto = false
	 * Resultado esperado soldado 2: estaMuerto = true
	 * 
	 */
	@Test
	void dispararSi() {
		int resultado, resultadoEsperado;
		sol1.setNumeroBalas(10);
		sol1.disparar(sol2);
		
		// Resultados Soldado muerto(si/no)
		assertTrue(sol2.isEstaMuerto());
		assertFalse(sol1.isEstaMuerto());
		
		// Se decrementa el numero de balas
		resultado = sol1.getNumeroBalas();
		resultadoEsperado = 9;
		assertEquals(resultado, resultadoEsperado);
		
	}
	
	/**
	 * TEST 2
	 * Pasamos por parametro el numero de balas = 0
	 * Resultado esperado de balas = -1
	 * Le pasamos que el soldado 1 dispara al soldado 2
	 * Resultado esperado soldado 1: estaMuerto = false
	 * Resultado esperado soldado 2: estaMuerto = true
	 * 
	 */
	@Test
	void dispararNo() {
		int resultado, resultadoEsperado;
		sol1.setNumeroBalas(0);
		sol1.disparar(sol2);
		
		// Resultados Soldado muerto(no/si)
		assertFalse(sol1.isEstaMuerto());
		assertTrue(sol2.isEstaMuerto());
		
		// Se decrementa el numero de balas
		resultado = sol1.getNumeroBalas();
		resultadoEsperado= -1;
		
		assertEquals(resultado, resultadoEsperado);
		
	}
	

}
