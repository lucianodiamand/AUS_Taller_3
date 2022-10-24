
public class Cuadrado extends FiguraGeometrica {

	private int lado;
	
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}
	
	public double perimetro() {
	    return lado * 4;	
	}

}
