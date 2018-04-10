package ProgramacionIII.util;

public class Ejemplo {

	public MySimpleLinkedList generarListaOrdenada(MySimpleLinkedList lista1, MySimpleLinkedList lista2) {
		MySimpleLinkedList retorno = new MySimpleLinkedList();
		boolean encontro = false;
		Object elem1;
		Object elem2;
		
		lista1.iniciarCursor();
		
		while (lista1.hasNext()) {
			elem1 = lista1.next();
			encontro = false;
			
			lista2.iniciarCursor();
			
			while (lista2.hasNext() && !encontro) {
				elem2 = lista2.next();
				
				if (elem1 == elem2) {
					retorno.insertOrdenado(elem1);
					encontro = true;
				}
			}
		}
		
		return retorno;
	}

	
	public MySimpleLinkedList generarLista(MySimpleLinkedList lista1, MySimpleLinkedList lista2) {
		MySimpleLinkedList retorno = new MySimpleLinkedList();
		boolean encontro = false;
		Object elem1;
		Object elem2;
		
		while (lista1.hasNext()) {
			elem1 = lista1.next();
			encontro = false;
			
			while (lista2.hasNext() && !encontro) {
				elem2 = lista2.next();
				
				if (elem1 == elem2) {
					retorno.insertarUltimo(elem1);
					encontro = true;
				}
			}	
		}
		
		return retorno;
	}
	

	public static void main(String[] args) {

		final int tam = 100;

		MySimpleLinkedList lista1 = new MySimpleLinkedList();
		MySimpleLinkedList lista2 = new MySimpleLinkedList();

		for (int i = 0; i < tam; i++) {
			lista1.insert(i);
			if (i%2 == 0) {
				lista2.insert(i);
			}
		}

		Ejemplo esto = new Ejemplo();
		
		MySimpleLinkedList lista3 = esto.generarListaOrdenada(lista1, lista2);
		
		lista3.iniciarCursor();
		
		while (lista3.hasNext()) {
			System.out.println(lista3.next());
		}


	}

}
