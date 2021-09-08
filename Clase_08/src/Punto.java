
public class Punto {

	private int x;
	
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distancia(Punto p) {
		return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
	}
}
