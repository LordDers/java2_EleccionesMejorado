package java2_EleccionesMejorado;

import java.util.Scanner;

public class Habitante {

	// Propiedades / Atributos
	private String v_dni;
	private String v_nombre;
	private String v_apellido;
	private int v_edad;
	private String v_nacionalidad;
	private String v_fecha_nacimiento;
	private String v_sexo;
	private int v_telefono;
	
	public Habitante () {};

	public void setDni(String dni) {

		this.v_dni = dni;
	}

	public String getDni() {

		return v_dni;
	}

	public void setNombre(String nombre) {

		this.v_nombre = nombre;
	}

	public String getNombre() {

		return v_nombre;
	}

	public void setApellido(String apellido) {

		this.v_apellido = apellido;
	}

	public String getApellido() {

		return v_apellido;
	}

	public void setEdad(int edad) {

		this.v_edad = edad;
	}

	public int getEdad() {

		return v_edad;
	}

	public void setNacionalidad(String nacionalidad) {

		this.v_nacionalidad = nacionalidad;
	}

	public String getNacionalidad() {
		
		return v_nacionalidad;
	}

	public void setNacimiento(String f_nacimiento) {

		this.v_fecha_nacimiento = f_nacimiento;
	}

	public String getNacimiento() {

		return v_fecha_nacimiento;
	}

	public void setSexo(String sexo) {

		this.v_sexo = sexo;
	}

	public String getSexo() {

		return v_sexo;
	}

	public void setTelefono(int telefono) {

		this.v_telefono = telefono;
	}

	public int getTelefono() {

		return v_telefono;
	}
	
	public void introducidirHabitante () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce DNI: ");
		v_dni = sc.next();
		System.out.print("Nombre: ");
		v_nombre = sc.next();
		System.out.print("Apellido: ");
		v_apellido = sc.next();
		System.out.print("Edad: ");
		v_edad = sc.nextInt();
		System.out.print("Nacionalidad: ");
		v_nacionalidad = sc.next();
		System.out.print("Fecha de Nacimiento: ");
		v_fecha_nacimiento = sc.next();
		System.out.print("Sexo: ");
		v_sexo = sc.next();
		System.out.print("Teléfono: ");
		v_telefono = sc.nextInt();
		
		sc.close();
	}
	
	void mostrarHabitante () {
		
		System.out.println("\n-- Datos del Habitante --\n");
		System.out.println("DNI: " + v_dni);
		System.out.println("Nombre: " + v_nombre + " " + v_apellido);
		System.out.println("Fecha de Nacimiento: " + v_nacionalidad);
		System.out.println("Edad: " + v_edad);
		System.out.println("Nacionalidad: " + v_nacionalidad);
		System.out.println("Sexo: " + v_sexo);
		System.out.println("Telefono: " + v_telefono);
	}
}