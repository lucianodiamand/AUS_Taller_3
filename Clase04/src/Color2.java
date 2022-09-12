
public enum Color2 {

	BLANCO(255, 255, 255), GRIS(127, 127, 127), NEGRO(0, 0, 0);

	private Color2(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	private int r;
	private int g;
	private int b;
	
	public int getRGB() {
		return (int)(r * 0.5 + g * 0.5 + b * 0.5);
	}

}
