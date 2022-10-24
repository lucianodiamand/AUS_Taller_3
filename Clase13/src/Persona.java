public class Persona implements Comparable<Persona> {

	private String nombre;

	private String apellido;

	private int dni;

	public Persona(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Persona)) {
			return false;
		}
		Persona tmp = (Persona) obj; // Downcast
		return dni == tmp.dni && nombre.equals(tmp.nombre) && apellido.equals(tmp.apellido);
	}

	@Override
	public int hashCode() {
		return dni;
	}

	@Override
	public int compareTo(Persona o) {
		return dni - o.dni;
	}

	@Override
	public String toString() {
		return dni + ": " + nombre + " " + apellido;
	}

}
