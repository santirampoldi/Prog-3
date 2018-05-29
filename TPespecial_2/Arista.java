public class Arista {
	
	Nodo destino;
	int peso;
	
	public Arista(Nodo destino) {
		this.destino = destino;
		this.peso = 1;
	}
	
	public Nodo getDestino() {
		return destino;
	}

	public void setDestino(Nodo destino) {
		this.destino = destino;
	}
	
	public void aumentarArista(){
		peso++;
	}
	
	public int getPeso(){
		return this.peso;
	}

}