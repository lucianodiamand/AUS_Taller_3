import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo07 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("hola.txt");
			fr.read();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
