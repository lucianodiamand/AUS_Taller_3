import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBytes {

	public static void main(String[] args) {
		try {
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream("cortito.pdf");
				fos = new FileOutputStream("salida.pdf");
				int caracter;
				while ((caracter = fis.read()) != -1) {
					fos.write(caracter);
				}
			} finally {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
