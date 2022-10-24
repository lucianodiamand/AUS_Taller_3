
public class Ejemplo05 {

	public static void main(String[] args) {
		try {
		    f1();
		} catch (ArithmeticException e) {
			System.err.println("Upss");
		}
	}

	private static void f1() {
		f2();
	}

	private static void f2() {
		f3();
	}

	private static void f3() {
		System.out.println(1 / 0);
	}

}
