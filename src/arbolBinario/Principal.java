package arbolBinario;

public class Principal {

	public static void main(String[] args) {
		ArbolBinario MyArbol = new ArbolBinario();

		System.out.println("Existe el elemento 12?");
		System.out.println(MyArbol.hasElem(12));

		System.out.println("---------------------------------");
		
		
		MyArbol.insert(12);
		MyArbol.insert(7);
		MyArbol.insert(10);
		MyArbol.insert(9);
		MyArbol.insert(11);
		MyArbol.insert(5);
		MyArbol.insert(3);
		MyArbol.insert(6);
		MyArbol.insert(4);
		MyArbol.insert(15);
		MyArbol.insert(14);
		MyArbol.insert(13);
		MyArbol.insert(18);
		MyArbol.insert(17);
		MyArbol.insert(20);
		MyArbol.insert(22);




		System.out.println("Inserté todos los elementos");
		System.out.println("---------------------------------");


		System.out.println("Existe el elemento 12?");
		System.out.println(MyArbol.hasElem(12));

	}
}
