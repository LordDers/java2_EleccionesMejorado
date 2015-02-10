package java2_EleccionesMejorado;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class MostrarPartidos {
	
	public void mostrarPartidos () {

		// Leyendo el archivo listadosPartidos.txt
		try {
			
			File archivo = new File("/home/zubiri/ProyectosJava/java2_Elecciones2/java2_EleccionesMejorado/ficheros/listadosPartidos.txt");
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			//FileReader fr = new FileReader(archivo);
			//BufferedReader br = new BufferedReader(fr);
			
			ArrayList <Partido> partidos = new ArrayList <Partido> ();

			String linea = br.readLine();
			while(linea != null) {

				// 2Dividir la linea del fichero mediante ", " y obtener dichos datos
				String [] divString = linea.split(", ");

				Partido part = new Partido();
				/*Partido part = new Partido(splitArr[0], splitArr[1], Integer.parseInt(splitArr[2]), splitArr[3], Integer.parseInt(splitArr[4]), Boolean.parseBoolean(splitArr[5]));*/

				// Añadir el objeto "part" al ArrayList "partidos"
				partidos.add(part);

				// 2Poner los atributos al objeto "part"
				part.setNombre(divString[0]);
				part.setPresidente(divString[1]);
				part.setNumero(Integer.parseInt(divString[2]));
				part.setTipo(divString[3]);
				part.setVotos(Integer.parseInt(divString[4]));
				part.setGobierno(Boolean.parseBoolean(divString[5]));

				// Imprimir datos
				System.out.println("\nNombre: " + part.getNombre());
				System.out.println("Presidente: " + part.getPresidente());
				System.out.println("Tipo: " + part.getTipo());
				System.out.println("Numero: " + part.getNumero());
				System.out.println("Votos: " + part.getVotos());
				if (part.getGobierno() == true)
					System.out.println("Gobierna");
				else
					System.out.println("No Gobierna");

				// Leemos la siguiente linea
				linea = br.readLine();
			}

			// Cerramos BufferedReader
			br.close();
			
			// Vaciar el ArrayList
			partidos.clear();
			// Comprobamos que se haya vaciado
			System.out.println("\nVaciado correctamente. (" + partidos.size() + ")");

	
		}catch(IOException e) {
			System.out.println("Error E/S: "+e);
		}
	}
	
}