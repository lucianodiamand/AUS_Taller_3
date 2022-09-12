
public class Persona {

	// Campos de instancia
	private String nombre;

	// Campos de instancia
	private String apellido;
	
	// Campos de instancia
	private int edad;

	// Es un campo de clase
	private static int valor;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Metodos de instancia
	public String getNombre() {
		return nombre;
	}

	// Metodos de instancia
	public void setNombre(String nombre) {
		if (!"Luciano".equals(nombre)) {
		    this.nombre = nombre;
		}	
	}

	public static void setValor(int valor) {
		Persona.valor = valor;
	}

	// Campo de clase
	public static int getValor() {
		return valor;
	}
}
