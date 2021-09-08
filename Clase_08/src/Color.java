
// TypeSafe enum
public class Color {

	public static final Color BLANCO = new Color("Blanco", 255);
	public static final Color NEGRO = new Color("Negro", 0);
	public static final Color GRIS = new Color("Gris", 127);

	private static final Color [] COLORES = { BLANCO, NEGRO, GRIS };
	
	private String nombre;
	
	private int valor;

	private Color(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;			
	}

	public String getNombre() {
		return nombre;
	}

	public int getValor() {
		return valor;
	}

	public static Color[] values() {
		return COLORES;
	}
}
