package TPespecial;

public class Node {
	Libro libro;
	Node siguiente;
	
	public Node(Libro l,Node s){
		this.libro = l;
		this.siguiente = s;
	}
	
	public void setNext(Node n){
		this.siguiente = n;
	}
	
	public Node getNext() {
		return this.siguiente;
	}
	
	public Libro getLibro() {
		return this.libro;
	}
}
