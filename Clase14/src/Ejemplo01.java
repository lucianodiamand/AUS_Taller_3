
public class Ejemplo01 {

	public static void main(String[] args) {
		int i = 1;
		int j = 0;

		try {
		    System.out.println("resultado: " + i / j);
		    System.out.println("Hola!");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("FIN");
	}

}
