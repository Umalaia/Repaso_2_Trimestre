package testing;

import java.util.ArrayList;

import modelo.dao.AutorDaoImplList;
import modelo.javabean.Autor;
import modelo.javabean.Persona;

public class TestAutorDao {

	public static void main(String[] args) {
		
		//Nos creamos un adao para llamar a los autores en los tests
		AutorDaoImplList adao = new AutorDaoImplList();
		
		//Creamos varios autores
		Autor au1= new Autor("Macarena", "Arabe", "Maca");
		Autor au2 = new Autor("Pep", "Ruso", "Pezki");
		
		
		
		//toString mostrar nombres
		System.out.println("Autor au1 : " + au1.getNombre());
		System.out.println("Autor au1 : " + au2.getNombre());
		
		//Dar de alta
		System.out.println(adao.altaAutor(au1));
		System.out.println(adao.altaAutor(au2));
		
		//Mostrar todos
		for (Autor ele : adao.buscarTodos()) {
			System.out.println(ele);	
		}
		
		//Buscar uno
		System.out.println(adao.buscarUno(au1.getSeudonimo()));
		System.out.println(adao.buscarUno("Pezki"));

		//Borrar uno
		System.out.println(adao.bajaAutor(au1));
		
		//Buscar todos
		for (Autor ele : adao.buscarTodos()) {
			System.out.println(ele);
		}
		System.out.println(" ");
		
		
		//Para probar la herencia, nos creamos una persona que sea Autor
		Persona au3 = new Autor("Olivia","Finlandia","Oli");
		
		//Nos creamos un ArrayList de Personas, añadiendo a la lista los autores
		ArrayList<Persona> lista = new ArrayList();
		lista.add(au1);
		lista.add(au2);
		lista.add(au3);
		
		//Buscamos todos los autores
		for(Persona ele : lista) {
			if(ele instanceof Autor) {
				System.out.println(ele);
			}
		}
		
		//Para saber el nombre, nacionalidad y seudonimo de la persona au3
		System.out.println(((Autor)au3).getNombre());
		System.out.println(((Autor)au3).getNacionalidad());
		System.out.println(((Autor)au3).getSeudonimo());
		
		
	}

}
