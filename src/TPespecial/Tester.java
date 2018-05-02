package TPespecial;


public class Tester {

	public static void main(String[] args) {
		Biblioteca b = new Biblioteca();
		Timer reloj = new Timer();
		
		reloj.start();
		
		b.reader();
		
		String eleccionUsuario = b.pedirGenero();
		Lista libros = b.getLibros(eleccionUsuario);
		b.writer(libros);
		System.out.println("El tiempo de la operacion fue de: " + reloj.stop());
	}

}
