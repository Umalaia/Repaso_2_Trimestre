package testing;

import java.util.ArrayList;
import java.util.List;

import modelo.dao.Instituto;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

public class Testing {

	public static void main(String[] args) {
		
		// Crear un ArrayList para que contenga una lista de personas
		ArrayList<Persona> lista = new ArrayList<>();
		//Creamos un instituto, pasandole en el new el nombre del arraylist
		Instituto insti1 = new Instituto(lista);
		
		//Dar de alta
		insti1.altaPersona(new Alumno("45118012", "Laura León", "Plaza del Toro, 5", "447852369", "1º DAW"));
		
		//BuscarUno
		System.out.println(insti1.buscarPersona("45118012"));
		System.out.println("");
		
		//Buscar todos
		for (Persona ele: lista) {
			System.out.println(ele);
		}
		System.out.println("");
		
		//Dar de baja
		System.out.println(insti1.bajaPersona(insti1.buscarPersona("45118012")));
		
		//Buscar todos
		for (Persona ele: lista) {
			System.out.println(ele);
		}
			System.out.println("");
			
		//Buscar por tipo
		for (Persona ele : insti1.buscarPersonasPorTipo("Alumno")) {
			System.out.println(ele);
		}
		
	}

}
