package modelo.javabean;

import java.util.Objects;

public class Autor extends Persona{
	private String seudonimo;

	public Autor() {
		super();
	}

	public Autor(String nombre, String nacionalidad, String seudonimo) {
		super(nombre, nacionalidad);
		this.seudonimo = seudonimo;
	}
	

	public String getSeudonimo() {
		return seudonimo;
	}

	public void setSeudonimo(String seudonimo) {
		this.seudonimo = seudonimo;
	}

	//toString cogiendo inheriteds fields
	@Override
	public String toString() {
		return "Autor [seudonimo=" + seudonimo + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(seudonimo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(seudonimo, other.seudonimo);
	}
	
	
	
	
}
