package clase02;

public class Persona {

	private String claveBancaria;
	private String nombre;
	private String apellido;
	private int edad;

	public Persona() {
	    this.claveBancaria = "ACV";	
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad >= 1) {
			this.edad = edad;
		} else {
			this.edad = 1;
		}
	}
}
