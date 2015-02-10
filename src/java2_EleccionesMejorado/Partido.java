package java2_EleccionesMejorado;

import java.util.Scanner;

public class Partido {
	
	private String v_nombre;
	private String v_presidente;
	private int v_numero; // numero de afiliados
	private String v_tipo; // izq der
	private int v_votos;
	private boolean v_gobierno; // Si - No
	
	public Partido () {};

	public void setNombre (String nombre) {

		this.v_nombre = nombre;
	}

	public String getNombre () {

		return v_nombre;
	}

	public void setPresidente (String presidente) {

		this.v_presidente = presidente;
	}

	public String getPresidente () {

		return v_presidente;
	}

	public void setNumero (int numero) {

		this.v_numero = numero;
	}

	public int getNumero () {

		return v_numero;
	}

	public void setTipo (String tipo) {

		this.v_tipo = tipo;
	}

	public String getTipo () {

		return v_tipo;
	}

	public void setVotos (int votos) {

		this.v_votos = votos;
	}

	public int getVotos () {

		return v_votos;
	}

	public void setGobierno(boolean gobierno) {

		this.v_gobierno = gobierno;
	}

	public boolean getGobierno() {

		return v_gobierno;
	}
	
	public void introducidirPartido () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce nombre: ");
		v_nombre = sc.next();
		System.out.print("Presidente: ");
		v_presidente = sc.next();
		System.out.print("Número miembros: ");
		v_numero = sc.nextInt();
		System.out.print("Tipo: ");
		v_tipo = sc.next();
		System.out.print("Votos: ");
		v_votos = sc.nextInt();
		System.out.print("¿Gobierna? (false/true) ");
		v_gobierno = sc.nextBoolean();
		
		sc.close();
	}
	
	void mostrarPartidos() {
		
		System.out.println("\n-- Datos del Partido --\n");
		System.out.println("Nombre: " + v_nombre);
		System.out.println("Presidente: " + v_presidente);
		System.out.println("Numero miembros: " + v_numero);
		System.out.println("Tipo: " + v_tipo);
		System.out.println("Votos: " + v_votos);
		if (v_gobierno == true) {

			System.out.println("Gobierna");
		}
		else {

			System.out.println("NO Gobierna");
		}
	}
}