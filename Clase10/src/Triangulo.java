
public class Triangulo extends FiguraGeometrica {

	private int l1;
	private int l2;
	private int l3;
	
	public Triangulo(int l1, int l2, int l3) {
		super();
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	@Override
	public double perimetro() {
		return l1 + l2 + l3;
	}

}
