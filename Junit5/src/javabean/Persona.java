package javabean;

public class Persona {
	
	//ATRIBUTOS	
	/**
	 * El nombre de la persona
	 */
	private String nombre;
	private int edad;
	
	/**
	 * Posicion de la persona en el eje de las X dentro de una matriz
	 */
	private int posicion;
	
	/**
	 * La direccion de la persona asociada
	 * @see Direccion
	 */
	private Direccion direccion;
	
	/**
	 * Constructor por defecto
	 */
	public Persona() {
		super();
	}
	
	/**
	 * Constructor con parametros
	 * 
	 * @param a representa el nombre de la persona
	 * @param b representa la edad de la persona
	 * @param c representa la posicion de la persona
	 */
	public Persona(String a, int b, int c) {
		super();
		nombre = a;
		edad = b;
		posicion = c;
	}
	
	/**
	 * Constructor con el parametro del nombre
	 * 
	 * @param a representa el nombre de la persona
	 */
	public Persona(String a) {
		super();
		nombre = a;
	}
	
	//GETTER Y SETTER
	//Estos metodos no hace falta probarlos y tampoco hace falta
	//hace javadoc	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}		
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	//setNombre() en cambio si que har�a falta probarlo y documentarlo, ya que 
	//lo hemos cambiado
	/**
	 * Este metodo asiganar� el nombre pasado por parametro a la 
	 * propiedad nombre del objeto, pero unicamente cuando el nombre 
	 * pasado tenga m�s de 3 caracteres. En caso contrario (menor o 
	 * igual que 3 caracteres) se le pondra el valor de vacio ("")
	 * 
	 * @param nombre representa el nombre a dar de alta
	 */
	public void setNombre(String nombre) {
		if(nombre.length() > 3) {
			this.nombre = nombre;
		}else {
			this.nombre = "";
		}
	}
	
	//METODOS
	
	/**
	 * Metodo que mueve a la persona un n�mero de metros dado, 
	 * aumentando el atributo posicion actual en un numero 
	 * entero de metros.
	 * 
	 * @param metros representa el numero de metros que queremos 
	 * incrementar
	 */
	public void caminar(int metros) {
		this.posicion += metros;
	}
	
	/**
	 * Metodo que copia la persona atributo por atributo a un
	 * nuevo objeto persona
	 * 
	 * @return el objeto con la persona copiada
	 */
	public Persona copiarPersona() {
		Persona p1 = new Persona();
		p1.setNombre(this.nombre);
		p1.setEdad(this.edad);
		p1.setPosicion(this.posicion);
		
		return p1;
	}
	
	/**
	 * Este metodo compar� la edad de la persona que invoca el m�todo con la
	 * edad de la persona que se pasa por parametro, devolviendo la referencia
	 * de la persona que sea mayor de las dos
	 * 
	 * @param p persona pasada por parametro
	 * @return la persona que invoca el m�todo en caso de que esta persona sea 
	 * mayor. p en caso de que p sea la mayor. En caso de que sean iguales se 
	 * devuelve la refrencia p
	 */
	public Persona personaMayor(Persona p) {
		if(this.edad > p.edad) {
			return this;
		}else {
			return p;
		}
	}
	
	/**
	 * Calcula la distancia de un objeto persona respecto a una 
	 * posicion en metros en valor absoluto
	 * 
	 * No se admiten posiciones negativas
	 * 
	 * @param posicion representa una posicion en el eje de las X, es 
	 * la posici�n con la que voy a comparar la persona
	 * 
	 * @return la distancia en metros y absoluta de la posicion 
	 * respecto al objeto. Devolvemos -1 en caso de que la posicion 
	 * sea negativa
	 */
	public int calcularDistancia(int posicion) {
		if(posicion < 0) {
			return -1;//error, no se aceptan posiciones negativas
			//Tambien valdr�a y ser�a una mejor opci�n, arrojar 
			//Excepciones
		}
		
		if(posicion < this.posicion) {
			return this.posicion - posicion;
		}else {
			return posicion - this.posicion;
		}
	}

}
