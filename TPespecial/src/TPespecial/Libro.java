package TPespecial;


public class Libro {
	
	String titulo;
	String autor;
	int cantPaginas;
	String[] generos;
	
	public Libro(String t, String a, int cantPaginas,String generos){
		this.titulo = t;
		this.autor = a;
		this.cantPaginas = cantPaginas;
		this.generos = generos.split(" ");
	}
	public boolean tieneGenero(String g){
		for (int i = 0; i<this.generos.length;i++) {
			if (generos[i].equals(g)){
				return true;
			}
		}
		return false;
	}
	public String getTitulo() {
		return this.titulo;
	}
}
