package TPespecial;

public class Genero {
	Lista libros;
	String genero;
	
	public Genero (String g){
		this.genero = g;
		this.libros = new Lista();
	}
	
	public Genero (){
		this.genero = null;
		this.libros = null;
	}
	
	public Lista getLista(){
		return this.libros;
	}
	
	public void addLibro(Libro l){
		this.libros.insertPrimero(l);
	}

	public String getGenero() {
		return this.genero;
	}
	
}
