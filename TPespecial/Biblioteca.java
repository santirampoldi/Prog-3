package TPespecial;

import java.io.*;
import java.util.*;

public class Biblioteca {
	ArrayList<Genero> generosTotales;
	
	public Biblioteca(){
		this.generosTotales = new ArrayList<Genero>();
	}
	
	public boolean buscarGenero(String g){
		return this.generosTotales.contains(new Genero(g));
	}

	public void reader(){
		String csvFile = "dataset1.csv"; // path
		String line = "";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))){
			br.readLine();//salta la primera linea
			while ((line = br.readLine()) != null) {
				String[] items = line.split(",");
				Libro libroActual = new Libro (items[0],items[1],Integer.parseInt(items[2]),items[3]);

				String[] generos = items[3].split(" ");
				for (int i = 0; i < generos.length; i++) {
					if (!(this.buscarGenero(generos[i]))) {
						this.generosTotales.add(new Genero(generos[i]));	
					}
//					this.generosTotales.get(this.generosTotales.indexOf(generos[i])).addLibro(libroActual);
					System.out.println(this.generosTotales.indexOf(new Genero(generos[i])));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
