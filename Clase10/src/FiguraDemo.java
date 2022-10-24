
public class FiguraDemo {

	public static void main(String[] args) {
		FiguraGeometrica figuras[] = new FiguraGeometrica[3];

		figuras[0] = new Circulo(1);
		figuras[1] = new Cuadrado(3);
		figuras[2] = new Triangulo(1, 2, 3);

		mostrarPerimetro(figuras);
		
		// FiguraGeometrica ff = new FiguraGeometrica();
	}

	private static void mostrarPerimetro(FiguraGeometrica[] figuras) {
		for (FiguraGeometrica figuraGeometrica : figuras) {
			if (figuraGeometrica != null) {
				System.out.println(figuraGeometrica.perimetro());
				System.out.println(figuraGeometrica.getColor());
			}
		}
	}

}
