import java.util.Iterator;

public class ListIterator implements Iterator<Object>{
	
	private Node n; 
	
	public ListIterator(Node n) {
		this.n = n;
	}
	public boolean hasNext() {
		return n != null;
	}
	public Object next() {
		Node tmp;
		tmp = n;
		n = n.getNext();
		return tmp;
//		return tmp.getInfo();
	}
	
	public Object siguiente() {
		if(n != null){
			if (n.getNext() != null){
				return n.getNext();
			}
		}
		return null;
	}

}