import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeeChars {

	public static void main(String[] args) {
		try (
			FileReader fr = new FileReader("archivo1.txt");
		    FileWriter fw = new FileWriter("archivo2.txt");
		) {
			int result;
			while ((result = fr.read()) != -1) {
			    fw.write(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
