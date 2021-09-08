
public class ColorTest {

	public static void main(String[] args) {

		Color c1 = Color.GRIS;
		
		Color c2 = Color.GRIS;
		
		for (Color color : Color.values()) {
			System.out.println("Color: " + color.getNombre() + ", " + color.getValor());	
		}
		if (c1 == c2) {
			System.out.println("Es el mismo objeto");
		} else {
			System.out.println("NO Es el mismo objeto");
		}
		
	}
}
