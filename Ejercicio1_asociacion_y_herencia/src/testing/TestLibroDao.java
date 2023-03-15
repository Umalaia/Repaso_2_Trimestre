package testing;

import java.util.ArrayList;
import java.util.List;

import modelo.dao.LibroDao;
import modelo.dao.LibroDaoImplList;
import modelo.javabean.Autor;
import modelo.javabean.Critica;
import modelo.javabean.Lector;
import modelo.javabean.Libro;

public class TestLibroDao {

	public static void main(String[] args) {
		//SOLO CREAR UN DAOIMPLLIST
		//Creamos un libroDaoImplList sin meter datos por parametro, con el que llamamos a los metodos de los test.
		LibroDaoImplList libImpl = new LibroDaoImplList();
		
		//Como para crear un libro hace falta crear un autor, una critica y un lector, al que hacen referencia, los creamos antes.
		Lector l1 = new Lector("Sheila", "Española", 31);
		Autor a1= new Autor("Paco", "Francesa", "Pacopipas");
		Critica c1 = new Critica(9, "01/03/2023", "Muy buena", l1);
		
		Libro libro1 = new Libro("Pets", "02/10/1916", "Accion", "Ingles", 9.1, a1, c1);
		
		// Dar de alta un libro
		//tambien se puede dar de alta directamente con un new metido en el parentesis
		System.out.println(libImpl.altaLibro(libro1)) ;
		System.out.println(new Libro("Donuts", "02/10/1916", "Comedia", "Español", 7.3, a1, c1));
		
		//Buscar todos
		for(Libro ele : libImpl.buscarTodos()) {
			System.out.println(ele);
		}
		System.out.println("");
		
		//Buscar uno	
		//Buscar un libro pasandole el get titulo
		// tambien se puede buscar uno pasandole el titulo con un string
		System.out.println(libImpl.buscarUno(libro1.getTitulo()));
		System.out.println(libImpl.buscarUno("Amapolas"));
		System.out.println("");
		
		//Buscar por genero pasandole el genero con un string
		System.out.println(libImpl.buscarPorGenero("Drama"));
		
		//Buscar not ade la critica
		System.out.println(libImpl.buscarUno("Amapolas").getCritica().getPuntuacion());
		
		
		
		
		

	}

}
