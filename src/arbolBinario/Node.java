package arbolBinario;

public class Node {
	Integer info;
	Node izq;
	Node der;
	
	public Node (Integer o) {
		this.info = o;
	}
	
	public void addNode(Node n) {
		boolean condicion = (n.getInfo().compareTo(this.getInfo()) < 0);
		if (this.izq == null && condicion) {
			izq = n;
		}
		else if (this.der == null) {
			der = n;
		}
		else if (condicion){
			izq.addNode(n);
		}
		else {
			der.addNode(n);
		}
	}
	
	public Integer getInfo() {
		return this.info;
	}
}
