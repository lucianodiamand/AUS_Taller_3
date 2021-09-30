import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo06 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("hola.txt");
			fr.read();
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
