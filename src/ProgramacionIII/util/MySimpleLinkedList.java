package ProgramacionIII.util;

public class MySimpleLinkedList {

	protected Node first;
	protected Node last;
	protected Node cursor;
	protected int tam;

	public MySimpleLinkedList() {
		first = null;
		last = null;
		tam = 0;
	}
	public void insert(Object o) {
		Node tmp = new Node(o, null);
		tmp.setNext(first);
		first = tmp;
		tam++;
		if (tam == 1) {
			this.last = this.first;
		}
	}

	public void insertOrdenado(Object o) {
		if (this.isEmpty() || (Integer)o < (Integer)this.first.getInfo()) {
			this.insert(o);
		}
		else {
			Node i = this.first;
			boolean insertado = false;
			
			while (i.getNext() != null && !insertado) {

				if ((Integer)o < (Integer)i.getNext().getInfo()) {
					Node tmp = new Node(o, null);
					tmp.setNext(i.getNext());
					insertado = true;
					i.setNext(tmp);
					tam++;
				}
			}
			
			if (!insertado) {
				insertarUltimo(o);
			}
		}
	}
	
	public void insertarUltimo(Object o) {
		Node tmp = new Node(o, null);
		this.last.setNext(tmp);
		//tmp.setNext(null);
		tam++;
		this.last = tmp;
	}

	public Object extract() {
		if (!this.isEmpty()) {
			Object retorno = first;
			first = first.getNext();
			tam--;
			return retorno;
		}

		return null;
	}

	public void print(int n) {
		System.out.println(this.buscar(n).getInfo());;
	}

	public Node buscar(int n) {
		if (n < this.tam) {

			Node actual = first;
			int iterador = 0;

			while (iterador < n) {
				actual = actual.getNext();
				iterador++;
			}
			return actual;

		}
		return null;
	}

	public boolean isEmpty() {
		return first == null;
	}
	public int size() { 
		return tam;
	}

	public void iniciarCursor() {
		this.cursor = this.first;
	}

	public Object next() {
		Node retorno = cursor;
		cursor = cursor.getNext();
		return retorno.getInfo();
	}

	public boolean hasNext() {
		return cursor != null;
	}
}
