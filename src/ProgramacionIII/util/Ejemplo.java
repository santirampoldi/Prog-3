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
				System.out.println(elem1 + " comparado con " + elem2);
				
				if (elem1 == elem2) {
					System.out.println("entro");
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
		lista1.iniciarCursor();
		
		while (lista1.hasNext()) {
			elem1 = lista1.next();
			encontro = false;
			
			lista2.iniciarCursor();
			
			while (lista2.hasNext() && !encontro) {
				elem2 = lista2.next();
				if ((Integer)elem1 < (Integer)elem2) {
					encontro = true;
				}
				
				if (elem1 == elem2) {
					retorno.insertarUltimo(elem1);
					encontro = true;
				}
			}	
		}
		
		return retorno;
	}
	

	public static void main(String[] args) {


		MySimpleLinkedList lista1 = new MySimpleLinkedList();
		MySimpleLinkedList lista2 = new MySimpleLinkedList();		

			/* Llenar las listas ordenadas
			lista1.insert(15);
			lista1.insert(14);
			lista1.insert(13);
			lista1.insert(12);
			lista1.insert(11);
			lista1.insert(10);
			lista1.insert(9);
			lista1.insert(8);
			lista1.insert(7);
			lista1.insert(6);
			lista1.insert(5);
			lista1.insert(4);
			lista1.insert(3);
			lista1.insert(2);
			lista1.insert(1);
			lista1.insert(0);
			lista2.insert(15);
			lista2.insert(13);
			lista2.insert(11);
			lista2.insert(9);
			lista2.insert(7);
			lista2.insert(5);
			lista2.insert(3);
			lista2.insert(1);*/
		
		
		// Llenar las listas desordenadas
		lista1.insert(220);
		lista1.insert(14);
		lista1.insert(160);
		lista1.insert(8);
		lista1.insert(21);
		lista1.insert(10);
		lista1.insert(112);
		lista1.insert(44);
		lista1.insert(7);
		lista1.insert(54);
		lista1.insert(57);
		lista1.insert(42);
		lista1.insert(32);
		lista1.insert(2);
		lista1.insert(130);
		lista1.insert(12);
		lista2.insert(220);
		lista2.insert(77);
		lista2.insert(112);
		lista2.insert(9);
		lista2.insert(3);
		lista2.insert(57);
		lista2.insert(32);
		lista2.insert(130);	
		
		
		Ejemplo claseMain = new Ejemplo();
		
		MySimpleLinkedList lista3 = claseMain.generarListaOrdenada(lista1, lista2); //Para listas desordenadas
		//MySimpleLinkedList lista3 = claseMain.generarLista(lista1, lista2);		  Para listas ordenadas
		
		lista3.iniciarCursor();
		
		while (lista3.hasNext()) {
			System.out.println(lista3.next());
		}

		
	}
}
