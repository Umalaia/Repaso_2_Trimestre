package testing;

import modelo.javabean.Autor;
import modelo.javabean.Persona;

public class TestAutor {

	public static void main(String[] args) {
		Autor a1= new Autor("Paco", "Francesa", "Pacopipas");
		
		//toString
		System.out.println(a1.getNombre());
		System.out.println(a1.getSeudonimo());
		System.out.println(a1.getNacionalidad());
		
		//Test Herencia
		//Creamos una persona que sea un Autor
		Persona p1 = new Autor();
		
		//Mostrar el seudonimo de la persona p1
		System.out.println(((Autor)p1).getSeudonimo());
		
		

	}

}
