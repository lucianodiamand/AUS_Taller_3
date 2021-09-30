import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo03 {

	public static void main(String[] args) {
		try { 
			FileReader fr = new FileReader("hola.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
