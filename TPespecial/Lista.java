package TPespecial;

public class Lista {
	Node primero;
	int cantNodos;
	
	public Lista(Libro n){
		this.primero = new Node(n,null);
		this.cantNodos = 1;
	}
	public Lista(){
		this.primero = null;
		this.cantNodos = 0;
	}

	public void insertPrimero(Libro o) {
		Node tmp = new Node(o, null);
		tmp.setNext(this.primero);
		this.primero = tmp;
		cantNodos++;
	}
}
