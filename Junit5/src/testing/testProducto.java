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
	 *  Resultado esperado: PVC*BENEFICIO = 13
	 */
	@Test
	void damePvpSinIVACorrecto() {
		double resultadoEsperado, resultado;
		resultadoEsperado = 13;
		prod.setPvc(10);
		prod.setBeneficio(1.30);
		resultado = prod.getPvc()*prod.getBeneficio();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	
	@Test
	void damePvpConIVACorrecto() {
		double resultadoEsperado, resultado;
	}
	
	
	

}
