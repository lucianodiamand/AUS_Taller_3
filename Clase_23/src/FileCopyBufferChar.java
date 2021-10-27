import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyBufferChar {

	public static void main(String[] args) {
		try {
			FileReader fis = null;
			FileWriter fos = null;
			try {
				fis = new FileReader("archivo.txt");
				fos = new FileWriter("salida.txt");
				int cant;
				char[] buffer = new char[1024];
				while ((cant = fis.read(buffer)) != -1) {
					fos.write(buffer, 0, cant);
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
