
package TPespecial;


public class TesterTP {

	public static void main(String[] args) {
		Biblioteca b = new Biblioteca();
		Timer reloj = new Timer();
		
		reloj.start();
		b.reader();
		System.out.println("El tiempo de la operacion de carga fue de: " + reloj.stop());

		
		String eleccionUsuario = b.pedirGenero();
		
		
		reloj.start();
		Lista libros = b.getLibros(eleccionUsuario);
		System.out.println("El tiempo de la operacion de busqueda fue de: " + reloj.stop());
		
		
		reloj.start();
		b.writer(libros);
		System.out.println("El tiempo de la operacion de escritura fue de: " + reloj.stop());
	}

}
