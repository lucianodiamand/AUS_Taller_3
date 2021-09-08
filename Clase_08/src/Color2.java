
public enum Color2 {

	BLANCO("Blanco", 255), NEGRO("Negro", 0), GRIS("Gris", 127);
	
	private String nombre;
	
	private int valor;
	
	private Color2(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public int getValor() {
		return valor;
	}

}
