
public class Pelicula implements Ordenable {

	private String titulo;
	
	private String genero;
	
	private int anio;
	
	public Pelicula(String titulo, String genero, int anio) {
		this.titulo = titulo;
		this.genero = genero;
		this.anio = anio;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public int getAnio() {
		return anio;
	}

	public int compareTo(Ordenable ord) {
		Pelicula tmp = (Pelicula) ord;
		return this.titulo.compareTo(tmp.getTitulo());
	}
}
