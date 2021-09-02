
public class Arbol {

	private int altura;

	private String nombre;
	
	public Arbol(int altura) {
		this("Fresno");
		this.altura = altura;
	}
	
	public Arbol(String nombre) {
		this.nombre = nombre;
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
