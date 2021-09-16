
public class Circulo implements FG {

	private int radio;
	
	public Circulo(int radio) {
		this.radio = radio;
	}
	
	public double perimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double area() {
		return Math.PI * radio * radio;
	}
}
