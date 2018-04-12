import java.util.Iterator;

public class MySimpleLinkedList implements Iterable{
	protected Node primero;
	protected int cantNodos;
	
	public MySimpleLinkedList() {
		primero = null;
		cantNodos = 0;
	}
	public void insert(Object o) {
		Node tmp = new Node(o, null);
		tmp.setNext(primero);
		primero = tmp;
		cantNodos++;
	}
	public void masCant(){
		cantNodos++;
	}
	public void cambiarPrimero(Object o,Node e) {
		Node tmp = new Node(o, e);
		tmp.setNext(primero);
		primero = tmp;
		cantNodos++;
	}
	public int getCantNodos(){
		return cantNodos; 
	}

	public Node extract() {
		Node auxNode = new Node();
		if (primero != null) {
			auxNode = primero;
		//System.out.println(auxNode.getInfo());
			if (primero.getNext() != null) {
				primero = primero.getNext();
			}else{
				primero = null;
			}
		}
		cantNodos--;
		return auxNode;
	}
	public boolean isEmpty(){
		if (primero == null) {
			return true;
		}
		return false;
	}
	
	public Node getNode(int n) {
		Node tmp = null;
		if((n>=0)&&(n<this.size())) {
			tmp = primero;
			for (int i = 0; i < n; i++) {
				tmp = tmp.getNext();
			}
		}	
		return tmp;
	}
	
	public int size(){
		return cantNodos;
	}
	
	public void print(int posNodito){
		Node aux = new Node();
		int contador = 1;
		boolean	existe = true;
		aux = primero;
		if(aux != null){
			if ((posNodito != contador) && existe){
				if (aux.getNext() != null) {	
					aux = aux.getNext();
				}else{
					System.out.println("No existe ese nodo");
					existe = false;
				}
				contador++;
			}else if(posNodito == contador){
				System.out.println(aux.getInfo());
			}
		}
	}
	
	public Node getPrimero(){
		return primero;
	}
	
	public MySimpleLinkedList buscarIguales(MySimpleLinkedList l2){
		MySimpleLinkedList listaRet = new MySimpleLinkedList();
		ListIterator li1 = iterator();
		while(li1.hasNext()){
			int actualL1 = (int) ((Node) li1.next()).getInfo();
			ListIterator li2 = l2.iterator();
			while(li2.hasNext()){
				int actualL2 = (int) ((Node) li2.next()).getInfo();
				if (actualL1 == actualL2) {
					listaRet = insertarOrdenado(listaRet,new Node(actualL1));
				}		
			}
		}
		return listaRet;
	}

	public MySimpleLinkedList insertarOrdenado(MySimpleLinkedList lista, Node nodoAux){
		boolean inserto=false;
		ListIterator li = new ListIterator(lista.getPrimero());
		if (lista.isEmpty()){
			lista.insert(nodoAux.getInfo());
			inserto = true;
		}	
		//Node anterior = lista.getPrimero();
		Node anterior = null;
		while(li.hasNext() && !inserto){
			Node actual = (Node) li.next();
			if((int) actual.getInfo() > (int) nodoAux.getInfo()){	
				if(anterior != null){
					Node aux = new Node((int) nodoAux.getInfo(),actual);
					anterior.setNext(aux);
				}else{
					lista.insert(nodoAux.getInfo());
				}
				inserto = true;
			}
			anterior = actual;
		}
		if (!inserto) {
			anterior.setNext(nodoAux);
//			lista.insert(nodoAux.getInfo());
		}
		return lista;
	}

	public ListIterator iterator() {
		ListIterator it = new ListIterator(this.primero);
		return it;
	}
}