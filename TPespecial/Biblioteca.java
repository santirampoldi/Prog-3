package TPespecial;

import java.io.*;
import java.util.*;

public class Biblioteca implements Iterable<Object>{
	ArrayList<Genero> generosTotales;

	public Biblioteca(){
		this.generosTotales = new ArrayList<Genero>();
	}

	public Lista getLibros(String eleccionUsuario) {
		if (this.contiene(this.getGenero(eleccionUsuario))) {
			return this.getGenero(eleccionUsuario).getLista();
		}
		return new Lista();
	}

	public boolean contiene(Genero g) {
		for (int i = 0; i < this.generosTotales.size(); i++) {
			if (this.generosTotales.get(i).getGenero().equals(g.getGenero())) {
				return true;
			}
		}
		return false;
	}

	public void addGenero(Genero g) {
		boolean completado = false;
		if (this.generosTotales.size() == 0) {
			this.generosTotales.add(g);
		}
		else {
			int i = 0;
			while (i < this.generosTotales.size() && !completado) {
				if (this.generosTotales.get(i).getGenero().compareTo(g.getGenero()) > 0) {
					this.generosTotales.add(i, g);
					completado = true;
				}	
				i++;
			}
			if (!completado) {
				this.generosTotales.add(this.generosTotales.size(), g);
			}
		}
	}

	public boolean buscarGenero(String g){
		return this.contiene(new Genero(g));
	}

	public void reader(){
		String csvFile = "dataset4.csv";
		String line = "";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))){
			br.readLine();//salta la primera linea
			while ((line = br.readLine()) != null) {
				String[] items = line.split(",");
				Libro libroActual = new Libro (items[0],items[1],Integer.parseInt(items[2]),items[3]);

				String[] generos = items[3].split(" ");
				for (int i = 0; i < generos.length; i++) {
					if (!(this.buscarGenero(generos[i]))) {
						this.addGenero(new Genero(generos[i]));	
					}
					this.getGenero(generos[i]).addLibro(libroActual);
					//this.generosTotales.get(this.generosTotales.indexOf(generos[i])).addLibro(libroActual);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Genero getGenero(String s) {
		for (int i = 0; i < this.generosTotales.size(); i++) {
			if (this.generosTotales.get(i).getGenero().equals(s)) {
				return this.generosTotales.get(i);
			}
		}
		return new Genero(s);
	}

	public void writer(Lista l) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("ListadoDeLibros.csv"));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre del libro");
		sb.append("\n");

		ListIterator it = iterador(l.getPrimero());
		
		while (it.hasNext()) {
			sb.append(((Node) it.next()).getLibro().getTitulo());
			sb.append("\n");

		}

		pw.write(sb.toString());
		pw.close();
	}

	public String pedirGenero() {
		String retorno = "";
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un género ");
			retorno = entrada.readLine();
		}
		catch (Exception exc ) {
			System.out.println( exc );
		}
		return retorno;
	}

	public ListIterator iterador(Node n) {
		ListIterator l = this.iterator();
		l.setPrimero(n);
		return l;
	}

	@Override
	public ListIterator iterator() {
		return new ListIterator();
	}


}
