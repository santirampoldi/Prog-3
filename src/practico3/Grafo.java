package practico3;

import java.util.ArrayList;
import java.util.List;

public abstract class Grafo {
	public abstract void addVertice(int v);
	
	public abstract void addArista(int v1, int v2);
	
	public abstract List<Integer> getVertices();
	
	public abstract int numVertices();
	
	public abstract int numAristas();
	
	public abstract boolean existArista(int v1, int v2);
	
	public abstract List<Arista> getAdyacentes(int v);
	
	class Arista {
		int destino;
		double peso;
		public Arista(int codAdy, double p){
			destino = codAdy;
			peso = p;
		}
	}
	
	class Vertice {
		List<Arista> aristas;
		
		public Vertice() {
			aristas = new ArrayList<Arista>();
		}
	}
}
