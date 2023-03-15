package javabean;

import java.util.Objects;

public class Perro extends Animal{
	private String raza;
	private int id_perro;
	
	
	
	// Constructores

	/**
	 *  Constructor using fields deseleccionar invocando al constructor animal.
	 */
	public Perro() {
		super();
	}

	 // Constructor using fiels marcando todos invocando al constructor animal con todo.
	public Perro(int numeroPatas, boolean tienenVertebras, String nombre, String raza, int id_perro) {
		super(numeroPatas, tienenVertebras, nombre);
		this.raza = raza;
		this.id_perro = id_perro;
	}
	
	
	//Getter and setter solo de la clase Perro
	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
	public int getId_perro() {
		return id_perro;
	}

	public void setId_perro(int id_perro) {
		this.id_perro = id_perro;
	}
	

	// toString de clase animal (inherited fields) y clase perro
	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", id_perro=" + id_perro + ", numeroPatas=" + numeroPatas + ", tienenVertebras="
				+ tienenVertebras + ", nombre=" + nombre + "]";
	}
	
		

	// Add unimplemented methods para coger los metodos de la clase padre
	@Override
	public void saludar() {
		System.out.println("Hola, soy un perro y mi raza es : " + raza);
		
	}


	@Override
	public void sonido() {
		System.out.println("Guauuu");
		
	}

	@Override
	public void medioLocomocion() {
		System.out.println("Tengo " + numeroPatas + " patas y tengo vertebras " + tienenVertebras);
		
	}
	
	
	

}
