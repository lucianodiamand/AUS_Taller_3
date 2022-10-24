
public class Libro implements Comparable<Libro> {

	private int anio;
	
	private String isbn;
	
	private String autor;

	public Libro(int anio, String isbn, String autor) {
		super();
		this.anio = anio;
		this.isbn = isbn;
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public int compareTo(Libro o) {
		return this.anio - o.anio;
	}
	
}
