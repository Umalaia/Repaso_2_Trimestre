package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

public class Instituto implements InstitutoDao{
	
	//Se crea una lista Persona de nombre personas.
	private List<Persona> personas;
	
	//Constructor con la lista de personas y el metodo cargar datos
	public Instituto(List<Persona> personas) {
		super();
		this.personas = personas;
		cargarDatos();
	}
	
	//Creamos el metodo cargar datos y añadimos a las diferentes personas
	public void cargarDatos() {
		personas.add(new Alumno("5632145p", "Luis", "C/Paz,3", "654896571", "1ºDAM"));
		personas.add(new Profesor("1234567k", "Pepe", "C/Pez, 2", "644525625", "Programacion"));
		personas.add(new Administrativo("5412356p", "Elena", "C/Luna, 8" , "689521412", "Personal"));
		personas.add(new Profesor("20900551z", "Sheila", "C/Luna, 28", "644595055", "Programación"));
		personas.add(new Alumno("4056658P", "Miguel", "C/Sol, 37", "658695234", "1º DAW"));
		personas.add(new Administrativo("54126357Q", "Esther", "C/Estrella, 9", "654789215", "Getionar matriculas"));
	}
	
	@Override
	public boolean altaPersona(Persona persona) {
		if (personas.contains(persona)){
			return false;
		}else
		return personas.add(persona);
	}

	@Override
	public boolean bajaPersona(Persona persona) {
		return personas.remove(persona);
	}

	/**
	 * Se recorre la lista de personas, hasta encontrar cual coincide con el nif que se pasa por parametro.
	 * Si el nif de la persona es igual que el nif que se le pase por parametro, mostrar la persona ele.
	 */
	@Override
	public Persona buscarPersona(String nif) {
		for (Persona ele: personas) {
			if (ele.getNif().equalsIgnoreCase(nif))
			return ele;
		}
		return null;
	}

	@Override
	public List<Persona> buscarTodas() {
		return personas;
	}

	/**
	 * Se reccorre la lista de personas, si la persona coincide con el tipo de persona que se le pase por parametro y 
	 * esta a su vez es una instancia de esa persona, se mostraria, en el caso contrario, no se mostraria nada
	 */
	@Override
	public List<Persona> buscarPersonasPorTipo(String tipoPersona) {
		List<Persona> aux = new ArrayList();
	for (Persona ele : personas) {
		if (tipoPersona.equals("Profesor") && ele instanceof Profesor) {
			aux.add(ele);
		}
		else
		if (tipoPersona.equals("Alumno") && ele instanceof Alumno) {
			aux.add(ele);
		}
		else
		if (tipoPersona.equals("Administrativo") && ele instanceof Administrativo) {
			aux.add(ele);
		}
		
	}	return aux;
	}	

}
