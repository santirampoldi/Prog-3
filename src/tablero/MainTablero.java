package tablero;

public class MainTablero {

	public static void main(String[] args) {
		TableroMagico tablero = new TableroMagico(3,10,15);

		tablero.resolver(0);
		//System.out.println("Hay " + tablero.total + " posibilidades.");
	}

}
