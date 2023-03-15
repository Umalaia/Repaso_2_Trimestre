package testing;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Lector;
import modelo.javabean.Persona;

public class TestLector {

	public static void main(String[] args) {
		Lector l1 = new Lector("Sheila", "Española", 31);
		
		// metodo toString
		System.out.println(l1.getNombre());
		System.out.println(l1.getEdad());
		System.out.println(l1.getNacionalidad());
		
		//metodo escribir critica
		System.out.println(l1.escribirCritica());
		
		//Test herencia, creamos una persona que sea un lector
		Persona p2 = new Lector("Lola","Inglesa", 20);
		
		//Sacar el nombre, la edad y nacionalidad de la persona p2
		System.out.println(((Lector)p2).getNombre());
		System.out.println(((Lector)p2).getNacionalidad());
		System.out.println(((Lector)p2).getEdad());
		
		
		//Creamos un Arraylist de PERSONAS y las añadimos a la lista, para poder buscarlas
		ArrayList<Persona> lista = new ArrayList();
		lista.add(l1);
		lista.add(p2);
		
		//Mostrar a todos los lectores
		for (Persona ele : lista) {
			if (ele instanceof Lector) {
				System.out.println(ele);
			}
				
		}

	}

}
