import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo05 {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		try {
			f2();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

	private static void f2() throws FileNotFoundException {
		f3();
	}

	private static void f3() throws FileNotFoundException {
		FileReader fr = new FileReader("hola.txt");
	}
}
