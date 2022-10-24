import java.io.FileReader;
import java.io.IOException;

public class Ejemplo03 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("archivo.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
