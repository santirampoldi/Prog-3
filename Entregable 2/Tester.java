
public class Tester {

	public static void main(String[] args) {
		Arbol primerArbol = new Arbol(new Node(5));
		
		primerArbol.insert(7);
		primerArbol.insert(2);
		primerArbol.insert(6);
		primerArbol.insert(3);
		primerArbol.insert(4);
		primerArbol.insert(1);
		primerArbol.insert(9);
		
		System.out.println(primerArbol.hasElem(2));//true
		System.out.println(primerArbol.hasElem(5));//true
		System.out.println(primerArbol.hasElem(11));//false

	}

}
