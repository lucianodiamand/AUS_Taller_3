import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File2Demo {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("Hola.txt");
		FileReader fr = new FileReader(f);
	}
}
