package testing;

import java.util.ArrayList;
import java.util.List;

import javabean.Animal;
import javabean.Gato;

public class TestGato {

	public static void main(String[] args) {
		//Creamos un ArrayList de Animales a los que luego le añadiremos contenido y creamos tambien animales
		
		List<Animal> lista = new ArrayList();
		
		Gato gato1 = new Gato(4, true, "Felix", 7);
		Animal gato2 = new Gato(4, true, "Con botas", 1);
		
		lista.add(gato1);
		lista.add(gato2);
		
		// Sacar la lista de gatos
		for (Animal ele : lista) {
			if(ele instanceof Gato) {
				System.out.println(ele);
			}
		}
		
		//Mostrar el nombre de los gatos
		System.out.println(gato1.getNombre());
		System.out.println(((Gato)gato2).getNombre());
		
	}

}
