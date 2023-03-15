package javabean;
/**
 * La clase soldado consta de dos metodos propios, uno consiste en saber si el soldado está muerto y el otro
 * el numero de balas que tiene el soldado.
 * 
 * @author Sheila
 * @since 07/03/2023
 * 
 * @version v.1
 * 
 */
public class Soldado {

	/**
	 * @param estaMuerto : parametro tipo boolean que indica si el soldado esta muerto o no
	 */
    private boolean estaMuerto;
    /**
     * @param numeroBalas : parametro tipo int que indica el numero de balas
     */
    private int numeroBalas;

    // Constructores
    
    public Soldado() {
		super();
	}

	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}



	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	
	
	// METODOS PROPIOS
	/**
	 *  Metodo que indica si puede disparar o no dependiendo del numero de balas.
	 * @return true : si el numero de balas es mayor a 0.      
	 * false: si el numero de malas es menor o igual a 0.
	 */
	public boolean puedeDisparar() {
    	if(this.numeroBalas > 0) {
           return true;
        }                          
        return false;
    }

   
	/**
	 * Metodo que indica la accion de disparar.
	 * Resta el numero de balas del soldado.
	 * Indica true : sol.estaMuerto.
	 * @param sol
	 */
    public void disparar(Soldado sol) {
    	this.numeroBalas--;
        sol.estaMuerto = true;
    }

}
