package java2_EleccionesMejorado;

import java.util.Scanner;

public class Inmueble {
	
	private String v_localidad;
	private String v_direccion;
	private String v_tipo; // finca, piso, oficina...
	private String v_fecha_construccion;
	private String v_fecha_compra;
	
	public Inmueble () {};

	public void setLocalidad(String localidad) {

		this.v_localidad = localidad;
	}

	public String getLocalidad() {

		return v_localidad;
	}

	public void setDireccion(String direccion) {

		this.v_direccion = direccion;
	}

	public String getDireccion() {

		return v_direccion;
	}

	public void setTipo(String tipo) {

		this.v_tipo = tipo;
	}

	public String getTipo() {

		return v_tipo;
	}

	public void setConstruccion(String f_construccion) {

		this.v_fecha_construccion = f_construccion;
	}

	public String getConstruccion() {

		return v_fecha_construccion;
	}

	public void setCompra(String f_compra) {

		this.v_fecha_compra = f_compra;
	}

	public String getCompra() {

		return v_fecha_compra;
	}
	
	public void introducidirHabitante () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce localidad: ");
		v_localidad = sc.next();
		System.out.print("Dirección: ");
		v_direccion = sc.next();
		System.out.print("Tipo: ");
		v_tipo = sc.next();
		System.out.print("Fecha de construcción: ");
		v_fecha_construccion = sc.next();
		System.out.print("Fecha de compra: ");
		v_fecha_compra = sc.next();
		
		sc.close();
	}

	void mostrarInmuebles() {
		
		System.out.println("\n-- Datos del Inmueble --\n");
		System.out.println("Localidad: " + v_localidad);
		System.out.println("Direccion: " + v_direccion);
		System.out.println("Tipo: " + v_tipo);
		System.out.println("Fecha de Construccion: " + v_fecha_construccion);
		System.out.println("Fecha de compra: " + v_fecha_compra);
	}

}