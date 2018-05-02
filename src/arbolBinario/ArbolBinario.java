package arbolBinario;

//import java.util.List;

public class ArbolBinario {

	Node root;

	public ArbolBinario() {this.root = null;}
	public ArbolBinario(Node n) {this.root = n;}
	public ArbolBinario(Integer i) {this.insert(i);}

	public Object getRoot() {
		if (this.isEmpty()) {
			return null;
		}
		return this.root.getInfo();
	}

	public boolean hasElem(Integer o) {
		return hasElem(this.root, o);
	} 


	//La complejidad de este metodo es igual a O(log n) en el caso de que sea un arbol balanceado.
	//O de O(n) en el peor caso de que sea un arbol con todos los elementos en una sola branch.
	private boolean hasElem(Node raiz, Integer o) {
		if(raiz != null) {
			if(raiz.getInfo().equals(o)) {
				return true;
			}
			else if(raiz.getInfo().compareTo(o) < 0) {
				return hasElem(raiz.der, o);
			}
			else {
				return hasElem(raiz.izq, o);
			}
		}
		else {
			return false;
		}
	}

	public boolean isEmpty() {
		return root == null;
	}

	
	//La complejidad de este metodo es igual a O(log n) en el caso de que sea un arbol balanceado.
	//O de O(n) en el peor caso de que sea un arbol con todos los elementos en una sola branch.
	public void insert(Integer o) {
		insert(root, o);
	}

	private void insert(Node raiz, Integer o) {
		if(!this.isEmpty()) {
			if(raiz.getInfo().compareTo(o) < 0) {
				if (raiz.der != null) {
					insert(raiz.der, o);
				}
				else {
					raiz.der = new Node(o);
				}
			}
			else if (raiz.getInfo().compareTo(o) > 0) {
				if (raiz.izq != null) {
					insert(raiz.izq, o);
				}
				else {
					raiz.izq = new Node(o);
				}
			}
		}
		else {
			this.root = new Node(o);
		}
	}

	//public boolean delete(Integer o) {}

	public int getHeight() {
		int c = 0;
		if (this.root == null) {
			return c;
		}
		return getHeight(root, c);
	}

	private int getHeight(Node raiz, int c) {
		c++;
		int temp1 = 0;
		int temp2 = 0;
		if (raiz.der != null) {
			temp1 = getHeight(raiz.der, c);
		}
		if (raiz.izq != null) {
			temp2 = getHeight(raiz.izq, c);
		}
		if (temp1 != 0) {
			if (temp1 <= temp2 ) {
				c = temp2;
			}
			else if(temp1 > temp2) {
				c = temp1;
			}
		}
		return c;
	}

	public Integer getMaxElem() {
		if (this.root != null) {
			return this.getMaxElem(root.der);
		}
		else {
			return null;
		}
	}

	private Integer getMaxElem(Node n) {
		if (n.der != null) {
			return this.getMaxElem(n.der);
		}
		else {
			return n.getInfo();
		}
	}
	

	/*private boolean isHoja(Node n){
		return n.der == null && n.izq == null;
	}*/

	/*public void printPosOrder() {

	} 

	public void printPreOrder() {

	}

	public void printInOrder() {

	}

	public List getLongestBranch() {

	}

	public List getFrontera() {

	}

	public List getElemAtLevel(int i) {

	}*/
}
