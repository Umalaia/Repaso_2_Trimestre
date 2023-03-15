package javabean;

public class Jugador {

    private int dorsal;

    private int numeroTarjetasAmarillas;

    private int numeroTarjetasRojas;

                 
    // Constructores

    public Jugador() {
		super();
	}


	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	
	// getter and setter

	public int getDorsal() {
		return dorsal;
	}



	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}



	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}



	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}



	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}



	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}


	// Metodos propios
	
	/**
	 * Metodo poner dorsal, se le pasa por parametro un numero de dorsal.
	 * Si el dorsal es >= 1 y <=30 , se le asignará ese numero.
	 * Si el numero de dorsal no esta comprendido entre los valores anteriores, 
	 * se le asignara el numero -1.
	 * 
	 * @param dorsal : Numero de dorsal
	 */
	public void ponerDorsal(int dorsal){
       if(dorsal >= 1 && dorsal <= 30){
    	   this.dorsal = dorsal;
       }
       else{
    	   this.dorsal = -1;
       }
    }

   
	/**
	 * Metodo que indica si un jugador esta expulsado o no.
	 * 
	 * @return expulsado : boolean
	 * true : si tarjetas amarillas = 2 o si tarjetas rojas = 1.
	 * false : Si no se cumple ninguna de las anteriores
	 */
    public boolean estaExpulsado() {
      boolean expulsado = false;                                                  
         if(numeroTarjetasAmarillas == 2) {
        	 expulsado = true;
         }                          
         if(numeroTarjetasRojas == 1) {
              expulsado = true;
         }                          
     return expulsado;
    }            

}
