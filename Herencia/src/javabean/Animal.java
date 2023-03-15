package javabean;

public abstract class Animal {
	protected int numeroPatas;
	protected boolean tienenVertebras;
	protected String nombre;
	
	
	//Constructores
	public Animal(int numeroPatas, boolean tienenVertebras, String nombre) {
		super();
		this.numeroPatas = numeroPatas;
		this.tienenVertebras = tienenVertebras;
		this.nombre = nombre;
	}


	public Animal() {
		super();
	}

	
	//Getter and setter
	public int getNumeroPatas() {
		return numeroPatas;
	}


	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}


	public boolean isTienenVertebras() {
		return tienenVertebras;
	}


	public void setTienenVertebras(boolean tienenVertebras) {
		this.tienenVertebras = tienenVertebras;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//toString
	@Override
	public String toString() {
		return "Animal [numeroPatas=" + numeroPatas + ", tienenVertebras=" + tienenVertebras + ", nombre=" + nombre
				+ "]";
	}
	
	
	
	
	//Metodos propios
	public abstract void saludar();
	
	public abstract void sonido();
	
	public abstract void medioLocomocion();

	
	
	
	
	
	

}
