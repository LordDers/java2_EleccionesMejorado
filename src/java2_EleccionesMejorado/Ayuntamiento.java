package java2_EleccionesMejorado;

import java.util.Scanner;

public class Ayuntamiento extends EspacioPublico {

	private String v_alcalde;
	private int v_numero;
	private String v_localidad;

	public Ayuntamiento () {};

	public Ayuntamiento (String nombre, String direccion, String tipo) {

		super(nombre, direccion, tipo);
	}

	public void setAlcalde (String alcalde) {

		this.v_alcalde = alcalde;
	}

	public String getAlcalde () {

		return v_alcalde;
	}

	public void setNumero (int numero) {

		this.v_numero = numero;
	}

	public int getNumero () {

		return v_numero;
	}

	public void setLocalidad (String localidad) {

		this.v_localidad = localidad;
	}

	public String getLocalidad () {

		return v_localidad;
	}
	
	@Override
	final public void datosEspacioPublico () {
		
		System.out.println("-- Ayuntamiento --");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Localidad: " + v_localidad);
		System.out.println("Dirección: " + getDireccion());
		System.out.println("Alcalde: " + v_alcalde);
		System.out.println("Número de empleados: " + v_numero);
	}
	
	public void introducidirAyuntamiento () {
		
		Scanner sc = new Scanner(System.in);
		
		//EspacioPublico ep = new EspacioPublico();
		
		System.out.print("Introduce nombre: ");
		/*ep.*/setNombre(sc.next());
		System.out.print("Alcalde: ");
		v_alcalde = sc.next();
		System.out.print("Localidad: ");
		v_localidad = sc.next();
		System.out.print("Dirección: ");
		setDireccion(sc.next());
		System.out.print("Número de personal: ");
		v_numero = sc.nextInt();
		
		sc.close();
	}
	
	void mostrarAyuntamientos() {
		
		System.out.println("\n-- Datos del Ayuntamiento --\n");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Localidad: " + v_localidad);
		System.out.println("Dirección: " + getDireccion());
		System.out.println("Alcalde: " + v_alcalde);
		System.out.println("Número de empleados: " + v_numero);
	}
}