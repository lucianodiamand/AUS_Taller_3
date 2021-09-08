
public class Color2Test {

	public static void main(String[] args) {
		Color2 c = Color2.GRIS;
		
		Color2 cc = Color2.GRIS.BLANCO.NEGRO.BLANCO;
		System.out.println(c.getNombre() + ", " + c.getValor());
		
		switch(c) {
		
		case GRIS:
			System.out.println("Gris");
			break;
		case BLANCO:
			System.out.println("Blanco");
			break;
//		case ROJO:
//			System.out.println("Rojo");
		}
	}

}
