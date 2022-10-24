import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeeBytes {

	public static void main(String[] args) {
		try (
			FileInputStream fis = new FileInputStream("archivo1.bin");
		    FileOutputStream fos = new FileOutputStream("archivo2.bin");
		) {
			int result;
			while ((result = fis.read()) != -1) {
			    fos.write(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
