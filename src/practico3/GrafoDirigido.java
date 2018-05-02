package practico3;

import java.util.List;

public class GrafoDirigido extends Grafo {

	protected int numV, numA;
	//ListaAdyacencia vertices;

	public GrafoDirigido(int numVertices){
		numV = numVertices;
		numA = 0;
		//vertices = new ListaAdyacencia();
		for (int i = 0; i < numV; i++){
			//	vertices.add(i);
		}
	}

	public int numVertices() {return numV;}

	public int numAristas() {return numA;}

	/*public boolean existeArista(int i, int j) {
		boolean esta = false;
		//ListaAdyacencia l = vertices;
		for (l.inicio(); !l.esFin() && !esta; l.siguiente()) {
			if (l.recuperar().destino == j)
				esta = true;
		}
		return esta;
	}

	public double pesoArista(int i, int j) {
		ListaAdyacencia l = vertices;
		for (l.inicio(); !l.esFin(); l.siguiente())
			if (l.recuperar().destino==j)
				return l.recuperar().peso;
		return 0.0;
	}*/

	@Override
	public void addVertice(int v) {
		// TODO Auto-generated method stub

	}
	@Override
	public void addArista(int v1, int v2) {
		// TODO Auto-generated method stub

	}
	@Override
	public List<Integer> getVertices() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean existArista(int v1, int v2) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<Arista> getAdyacentes(int v) {
		// TODO Auto-generated method stub
		return null;
	}
}
