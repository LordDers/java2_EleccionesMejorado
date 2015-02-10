package java2_EleccionesMejorado;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
//import java.io.IOException;
import java.util.ArrayList;

public class Censo {
	
	public void mostrarHabitantes () {
		
		try {
			// Leyendo el archivo censo.txt
			File archivo = new File("/home/zubiri/ProyectosJava/java2_Elecciones2/java2_EleccionesMejorado/ficheros/censo.txt");
			BufferedReader br = new BufferedReader(new FileReader(archivo));
	
			ArrayList <Habitante> habitante = new ArrayList <Habitante> ();
	
			String lineahabi = br.readLine();
			while(lineahabi != null) {
	
				// 2Dividir la linea del fichero mediante ", " y obtener dichos datos
				String [] divString = lineahabi.split(", ");
	
				Habitante habi = new Habitante();
				//Habitante habi = new Habitante(splitArrhabi[0], splitArrhabi[1],splitArrhabi[2], Integer.parseInt(splitArrhabi[3]), splitArrhabi[4], splitArrhabi[5], splitArrhabi[6], Integer.parseInt(splitArrhabi[7]));
	
				// Añadir el objeto "part" al ArrayList "partidos"
				habitante.add(habi);
	
				// 2Poner los atributos al objeto "part"
				habi.setDni(divString[0]);
				habi.setNombre(divString[1]);
				habi.setApellido(divString[2]);
				habi.setEdad(Integer.parseInt(divString[3]));
				habi.setNacionalidad(divString[4]);
				habi.setNacimiento(divString[5]);
				habi.setSexo(divString[6]);
				habi.setTelefono(Integer.parseInt(divString[7]));
	
				// Comprobar la edad del habitante
				if (habi.getEdad() >= 18) {
					System.out.println("DNI: " + habi.getDni());
					System.out.println("Nombre: " + habi.getNombre());
					System.out.println("Apellido: " + habi.getApellido());
					System.out.println("Fecha de Nacimiento: " + habi.getNacimiento());
					System.out.println("Edad: " + habi.getEdad());
					System.out.println("Nacionalidad: " + habi.getNacionalidad());
					System.out.println("Sexo: " + habi.getSexo());
					System.out.println("Telefono: " + habi.getTelefono());
					System.out.println("");
				}
	
				// Leemos la siguiente linea
				lineahabi = br.readLine();
			}
				// Cerramos BufferedReader
				br.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

}