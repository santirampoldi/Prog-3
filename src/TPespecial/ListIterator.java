package TPespecial;

import java.util.Iterator;

public class ListIterator implements Iterator<Object> {

	
	private Node n;
	
	public ListIterator() {
		this.n = null;
	}
	
	public boolean hasNext() {
		return n != null;
	}

	public Object next() {
		Node tmp = n;
		n = n.getNext();
		return tmp;
	}

	public void setPrimero(Node n) {
		this.n = n;
	}
	
	
	
}
