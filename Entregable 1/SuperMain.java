

public class SuperMain {

	public static void main(String[] args) {
		String info;
		MySimpleLinkedList lista = new MySimpleLinkedList();
		MySimpleLinkedList lista2 = new MySimpleLinkedList();

		int cantCiclos = 500;
//*****************//
		for(int i =0; i < cantCiclos;i++){
			lista.insert((int)(Math.random() * cantCiclos*2) + 1);
		}

		for(int i =0; i < cantCiclos;i++){
			lista2.insert((int)(Math.random() * cantCiclos*2) + 1);
		}
		Timer itemsDesordenados = new Timer();
		itemsDesordenados.start();
		MySimpleLinkedList listaDesordenada = lista.buscarIguales(lista2);
		System.out.println(itemsDesordenados.stop());
//*****************//

//*****************//
		for(int i =0; i < cantCiclos;i++){
			lista.insert(i);
		}

		for(int i =0; i < cantCiclos;i++){
			lista2.insert(i);
		}
		Timer itemsOrdenados = new Timer();
		itemsOrdenados.start();
		MySimpleLinkedList listaOrdenada = lista.buscarIguales(lista2);
		System.out.println(itemsOrdenados.stop());
//*****************//	


		
	}
}