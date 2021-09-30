
public class Persona{

	private String nombre;
	
	private String apellido;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Persona)) { 
			return false;
		}
		Persona tmp = (Persona) obj;
		return this.nombre.equals(tmp.nombre) && this.apellido.equals(tmp.apellido);
	}

	@Override
	public int hashCode() {
		return nombre.hashCode() * apellido.hashCode();
	}
	
    @Override
    public String toString() {
    	return nombre + " " + apellido;
    }

}
