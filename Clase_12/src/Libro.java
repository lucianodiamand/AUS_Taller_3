
public class Libro implements Ordenable {

	private String titulo;
	
	private String ISBN;
	
	private int anio;

	public Libro(String titulo, String ISBN, int anio) {
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.anio = anio;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getAnio() {
		return anio;
	}

	public int compareTo(Ordenable ord) {
		Libro tmp = (Libro) ord;
		return this.anio - tmp.anio;
	}
}
