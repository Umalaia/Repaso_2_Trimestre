package testing;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Profesor;

public class Principal {

	public static void main(String[] args) {
		Profesor prof1 = new Profesor("20900551z", "Sheila", "C/Luna, 28", "644595055", "Programación");
		Alumno al1 = new Alumno("4056658P", "Miguel", "C/Sol, 37", "658695234", "1º DAW");
		Administrativo admin1 = new Administrativo("54126357Q", "Esther", "C/Estrella, 9", "654789215", "Getionar matriculas");
		
		// Test toString
		System.out.println("Nombre profesor : " + prof1.getNombre());
		System.out.println("Telefono Alunmo : " + al1.getTelefono());
		System.out.println("Calle administrativo : " + admin1.getDireccion());
		
		//Test metodo trabajar
		prof1.trabajar();
		al1.trabajar();
		admin1.trabajar();
		
		// Ejecuta el método llamar(Persona p) para que el alumno llame al profesor.
		System.out.println(prof1.llamar(al1));
		
		// Ejecuta el método ponerNotas() del objeto Profesor.
		System.out.println(prof1.ponerNotas());
		
		// Ejecuta el método hacerExamen() del objeto Alumno.
		System.out.println(al1.hacerExamen());
		
		// Ejecuta el método gestionarMatricula() del objeto Administrativo.
		System.out.println(admin1.gestionarMatricula());
		
		
		
		
	}

}
