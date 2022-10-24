import java.io.Serializable;

public class Persona implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 8365929387638710163L;

	private String apellido;
	private String nombre;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return nombre + " " + apellido;
	}
}
