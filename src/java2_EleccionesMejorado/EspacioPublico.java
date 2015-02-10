package java2_EleccionesMejorado;

//import java.util.Scanner;

public abstract class EspacioPublico {
	
	private String v_nombre;
	private String v_direccion;
	private String v_tipo;

	public EspacioPublico () {};

	public EspacioPublico (String nombre, String direccion, String tipo) {

		this.v_nombre = nombre;
		this.v_direccion = direccion;
		this.v_tipo = tipo;
	}

	public void setNombre (String nombre) {

		this.v_nombre = nombre;
	}

	public String getNombre () {

		return v_nombre;
	}

	public void setDireccion (String direccion) {

		this.v_direccion = direccion;
	}

	public String getDireccion () {

		return v_direccion;
	}
	
	public void setTipo (String tipo) {

		this.v_tipo = tipo;
	}

	public String getTipo () {

		return v_tipo;
	}
	
	abstract void datosEspacioPublico();
	
	/*public void introducidirEspacioPublico() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce nombre: ");
		v_nombre = sc.next();
		System.out.print("Dirección: ");
		v_direccion = sc.next();
		System.out.print("Tipo: ");
		v_tipo = sc.next();
		
		sc.close();
	}
	
	void mostrarEspacioPublico() {
		
		System.out.println("\n-- Datos del Espacio Publico --\n");
		System.out.println("Nombre: " + v_nombre);
		System.out.println("Direccion: " + v_direccion);
		System.out.println("Tipo: " + v_tipo);
	}*/
}