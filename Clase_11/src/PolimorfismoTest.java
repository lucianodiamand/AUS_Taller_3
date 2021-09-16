
public class PolimorfismoTest {

	public static void main(String[] args) {
		
		//FG f = new FG();
		
		FG[] figuras = new FG[3];
		figuras[0] = new Cuadrado(4);
		figuras[1] = new Circulo(1);
		figuras[2] = new Triangulo();

		muestraFiguras(figuras);
	}

	private static void muestraFiguras(FG[] figuras) {
		for (FG fg : figuras) {
			if (fg != null) {
				System.out.println(fg.area());
				System.out.println(fg.perimetro());
				
				if (fg instanceof Triangulo) {
					Triangulo tr = (Triangulo) fg;
					System.out.println(tr.isEquilatero());
				}
			}
		}
	}
}
