package prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {

		Prueba prueba = new Prueba();
		ArrayList<String> ejemplo = new ArrayList<String>();

		for (Integer i = 0; i < 100; i++) {
			String algo = i.toString();
			ejemplo.add(algo);
		}

		prueba.generarCsv(ejemplo);

	}

	public void generarCsv(ArrayList<String> a) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("ListadoDeLibros.csv"));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre del libro");
		sb.append("\n");

		for (int i = 0; i < a.size(); i++) {
			sb.append(a.get(i));
			sb.append("\n");
		}
		pw.write(sb.toString());
		pw.close();
		System.out.println("done!");
	}

}
