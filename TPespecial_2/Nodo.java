import java.util.ArrayList;

public class Nodo {
	
	String valor;
	ArrayList<Arista> aristas ;
	
	public Nodo(String valor) {
		aristas = new ArrayList<Arista>();
		this.valor = valor;
	}
	
	public Nodo() {
		aristas = new ArrayList<Arista>();
		this.valor = null;
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public ArrayList<Arista> getAristas() {
		return aristas;
	}
	
	public Arista getAristaAt(int pos){
		return aristas.get(pos);
	}
	
	public Arista getArista(String valor){
		for (Arista arista : aristas) {
			if (arista.getDestino().getValor().equals(valor)){
				return arista;
			}
		}
		return null;
	}
	

	public void setAristas(ArrayList<Arista> aristas) {
		this.aristas = aristas;
	}  
	
	public void addArista(Arista ady) {
		aristas.add(ady);
	}
	
	public boolean tieneAdyacentes(){
		return !aristas.isEmpty();
	}
	
	public Nodo getNodoAdyacenteMayor(){
		Nodo aux = null;
		int pesoAux = 0;
		for (Arista arista : aristas) {
			if(arista.getPeso()>pesoAux){
				pesoAux = arista.getPeso();
				aux = arista.getDestino();
			}
		}
		return aux;
	}
}