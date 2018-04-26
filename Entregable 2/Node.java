
public class Node {
	int value;
	Node izq;
	Node der;
	
	public Node(int val){
		this.value = val;
		this.izq = null;
		this.der = null;
	}
	public int getVal(){
		return  value;
	}
	public void setIzq(Node n){
		this.izq = n;
	}
	public void setDer(Node n){
		this.der = n;
	}
	public Node getIzq(){
		return this.izq;
	}
	public Node getDer(){
		return this.der;
	}
}
