package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Autor;
import modelo.javabean.Libro;

public class AutorDaoImplList implements AutorDao {
	private List<Autor> lista;
	
	public AutorDaoImplList() {
		super();
		lista = new ArrayList<>();
		cargarDatos();
	}
	
	public void cargarDatos() {
		lista.add(new Autor("Oscar", "Polaco", "OSVAL"));
		lista.add(new Autor("Marisa", "Española", "Meryluise"));
	}

	@Override
	public boolean altaAutor(Autor autor) {
		if(lista.contains(autor))
		return false;
		else
			return lista.add(autor);
	}

	@Override
	public boolean bajaAutor(Autor autor) {
		return lista.remove(autor);
	}

	@Override
	public Autor buscarUno(String seudonimo) {
		for (Autor ele : lista) {
			if (ele.getSeudonimo().equalsIgnoreCase(seudonimo))
				return ele;
		}return null;
	}
	

	@Override
	public List<Autor> buscarTodos() {
		return lista;
	}

}
