
public class Main {

	public static void main(String[] args) {
		Libro[] libros = new Libro[3];
		libros[0] = new Libro("El señor de los añillos", "12-312-312-1", 1935);
		libros[1] = new Libro("Programación Java", "5-441-244-56-1", 2010);
		libros[2] = new Libro("Lenguaje Assembly", "9-0032-3132-1", 1990);
		
		Ordenador.ordenar(libros);
		
		for (Libro libro : libros) {
			System.out.println(libro.getAnio() + " " + libro.getTitulo() + " " + libro.getISBN());
		}
		
		Pelicula[] peliculas = new Pelicula[3];
		peliculas[0] = new Pelicula("El refrigerador asesino", "Terror", 1955);
		peliculas[1] = new Pelicula("Matrix", "SCFI", 2000);
		peliculas[2] = new Pelicula("Mi pobre angelito", "Comedia", 1990);

		Ordenador.ordenar(peliculas);

		for (Pelicula pelicula : peliculas) {
			System.out.println(pelicula.getAnio() + " " + pelicula.getTitulo() + " " + pelicula.getGenero());
		}
	}
}
