package testing;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javabean.Producto;

class testProducto {

		Producto prod = new Producto();

	
	/**
	 *  Test 1 : Pvc: 10 * Beneficio: 1,30
	 *  Resultado esperado: PVC*BENEFICIO = 13, para ello llamamos al metodo
	 */
	@Test
	void damePvpSinIVACorrecto() {
		double resultadoEsperado, resultado;
		prod.setPvc(10);
		prod.setBeneficio(1.30);
		resultado = prod.getPvc()*prod.getBeneficio();
		//   IMPORTANTE !!
		resultadoEsperado = prod.damePvp();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	/**
	 * Test 1: Se le indica un pvp de 13, y el iva es :1.21
	 * El resultado esperado es 15.73
	 */
	@Test
	void damePvpConIVACorrecto() {
		double pvp,resultadoEsperado, resultado;
		prod.setPvc(10);
		prod.setBeneficio(1.30);
		pvp = prod.getPvc()*prod.getBeneficio();
		
		prod.setIva(1.21);
		resultado = pvp*prod.getIva();
		resultadoEsperado = prod.damePvpIva();
		
		assertEquals(resultado, resultadoEsperado);
	}
	
	
	

}
