package testing;

import javabean.Animal;
import javabean.Perro;

public class TestPerro {

	public static void main(String[] args) {
		Animal perro1 = new Perro(4, true, "Barris", "Chihuahua", 10);
		Perro perro2 = new Perro(4, true, "Patas", "Mestizo", 20);
		
		//Test sacar raza
		System.out.println(((Perro)perro1).getRaza());
		System.out.println(perro2.getRaza());
		
		//Test nombre
		System.out.println(((Perro)perro1).getNombre());
		System.out.println(perro2.getNombre());
		
		//Test sacar id
		System.out.println(((Perro)perro1).getId_perro());
		System.out.println(perro2.getId_perro());
		
		//Test saludar
		perro1.saludar();
		perro2.saludar();
		
		//Test medio locomocion
		perro1.medioLocomocion();
		perro2.medioLocomocion();
		
		//Test sonido
		perro1.sonido();

	}

}
