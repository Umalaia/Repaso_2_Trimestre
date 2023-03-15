package modelo.dao;

import java.util.List;

import modelo.javabean.Autor;
import modelo.javabean.Libro;

public interface AutorDao {
	public boolean altaAutor(Autor autor);
	public boolean bajaAutor(Autor autor);
	public Autor modificarAutor(Autor autor);
	public Autor buscarUno(String seudonimo);
	public List<Autor> buscarTodos(); 
}
