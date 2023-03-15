package modelo.dao;

import java.util.List;

import modelo.javabean.Persona;

public interface InstitutoDao {
	public boolean altaPersona(Persona persona);
	public boolean bajaPersona(Persona persona);
	public Persona buscarPersona(String nif);
	List<Persona>buscarTodas();
	List<Persona>buscarPersonasPorTipo(String tipoPersona);

}
