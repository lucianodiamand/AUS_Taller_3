
public class Circulo extends FiguraGeometrica {

	private int radio;
	
	public Circulo(int radio) {
		super();
		this.radio = radio;
	}
	
	public double perimetro () {
		return 2 * Math.PI * radio;
	}
}
