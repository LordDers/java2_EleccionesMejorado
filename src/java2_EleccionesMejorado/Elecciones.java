package java2_EleccionesMejorado;

import java.util.Scanner;

public class Elecciones {

	public static void main (String args[]) {

		char opcion;

		Scanner op = new Scanner(System.in);
		System.out.println("¿Qué desea visualizar (H), (I), (E), (A), (P), (Q), (V) o Terminar(T)?");
		opcion = op.next().charAt(0);

		while (opcion == 'h' || opcion == 'i' || opcion == 'e' ||  opcion == 'a' || opcion == 'p' || opcion == 't' || opcion == 'q' | opcion == 'v') {
			
			if (opcion == 'h') {
				
				Habitante habi = new Habitante();
				habi.introducidirHabitante();
				habi.mostrarHabitante();
				break;
			}
		//		------------------------

			if (opcion == 'i') {

				Inmueble inmueble = new Inmueble();
				inmueble.introducidirHabitante();
				inmueble.mostrarInmuebles();
				break;
			}

		//		------------------------

			/*if (opcion == 'e') {
				
				//EspacioPublico ep = new EspacioPublico(); --> Siendo abstract no se puede instanciar
				
				String[] espub = new String[3];
				EspacioPublico ep = new EspacioPublico();

				// Enviar valores a EspacioPublico.java
				ep.setNombre("Sinde");
				ep.setDireccion("aaa");
				ep.setTipo("Parque");

				// Recoger valores de EspacioPublico.java
				espub[0] = ep.getNombre();
				espub[1] = ep.getDireccion();
				espub[2] = ep.getTipo();

				// Datos del Espacio Publico
				System.out.println("\nDatos del Espacio Publico\n");
				System.out.println("Nombre: " + espub[0]);
				System.out.println("Direccion: " + espub[1]);
				System.out.println("Tipo: " + espub[2]);
				break;
			}*/

		//		------------------------

			if (opcion == 'a') {

				Ayuntamiento ayuntamiento = new Ayuntamiento();
				ayuntamiento.introducidirAyuntamiento();
				ayuntamiento.mostrarAyuntamientos();
				break;
			}

		//		------------------------

			if (opcion == 'p') {

				Partido partido = new Partido();
				partido.introducidirPartido();
				partido.mostrarPartidos();

				System.out.println("\n\nPartidos participantes fichero:");
				MostrarPartidos mpartido = new MostrarPartidos();
				mpartido.mostrarPartidos();
				break;
			}

			//		-------------Ejercicio 3.9 PARTIDOS-------------

			if (opcion == 'q') {

				MostrarPartidos mpartido = new MostrarPartidos();
				mpartido.mostrarPartidos();
				break;
			}

			//		-------------Ejercicio 3.9 HABITANTES-------------

			if (opcion == 'v') {

				Censo censo = new Censo();
				censo.mostrarHabitantes();
				break;
			}

			if (opcion == 't') {
				
				System.out.println("Has decidido salir");
				break;
			}
		}
		// Cerramos Scanner
		op.close();
	}
}