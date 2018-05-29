
public class Tester {

	public static void main(String[] args) {
		Arbol primerArbol = new Arbol();
		
		primerArbol.insert(7);
		primerArbol.insert(2);
		primerArbol.insert(6);
		primerArbol.insert(3);
		primerArbol.insert(4);
		primerArbol.insert(1);
		primerArbol.insert(9);
				
		System.out.println(primerArbol.hasElem(2));//true
		System.out.println(primerArbol.hasElem(7));//true
		System.out.println(primerArbol.hasElem(11));//false

	}

}
