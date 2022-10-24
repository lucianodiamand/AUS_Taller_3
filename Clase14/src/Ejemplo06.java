
public class Ejemplo06 {

	public static void main(String[] args) {
		try {
		    f1();
		} catch (ClassNotFoundException e) {
			System.err.println("Upss");
		}
	}

	private static void f1() throws ClassNotFoundException {
		f2();
	}

	private static void f2() throws ClassNotFoundException {
		f3();
	}

	private static void f3() throws ClassNotFoundException {
		Class.forName("org.apache.derby.jdbc.JdbcClient");
	}

}
