package javabean;

public class Gato extends Animal {
	private int vidas;
	
	//Contructores

	public Gato() {
		super();
	}
	
	
	public Gato(int numeroPatas, boolean tienenVertebras, String nombre, int vidas) {
		super(numeroPatas, tienenVertebras, nombre);
		this.vidas = vidas;
	}
	

	// Getter and setter

	public int getVidas() {
		return vidas;
	}


	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	
	// toString

	@Override
	public String toString() {
		return "Gato [vidas=" + vidas + ", numeroPatas=" + numeroPatas + ", tienenVertebras=" + tienenVertebras
				+ ", nombre=" + nombre + "]";
	}

	// Metodos heredados de la clase animal
	@Override
	public void saludar() {
		System.out.println("Hola soy un gato y me llamo " + nombre);
		
	}

	@Override
	public void sonido() {
		System.out.println("Miauuu");
		
	}

	@Override
	public void medioLocomocion() {
		System.out.println("Tengo " + numeroPatas + " patas");
		
	}
	
	

}
