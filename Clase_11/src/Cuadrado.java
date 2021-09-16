
public class Cuadrado implements FG {

	private long lado;
	
	public Cuadrado(long lado) {
		this.lado = lado;
	}
	
	public double perimetro() {
		return lado * 4;
	}
	
	public double area() {
		return lado * lado;
	}

}
