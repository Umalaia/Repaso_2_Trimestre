package testing;

import modelo.dao.AutorDaoImplList;
import modelo.javabean.Autor;

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
	}

}
