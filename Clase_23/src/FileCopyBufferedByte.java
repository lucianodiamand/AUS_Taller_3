import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyBufferedByte {

	public static void main(String[] args) {
		try {
			BufferedReader fis = null;
			BufferedWriter fos = null;
			try {
				fis = new BufferedReader(new FileReader("archivo.txt"));
				fos = new BufferedWriter(new FileWriter("salida.txt"));
				int cant;
				while ((cant = fis.read()) != -1) {
					fos.write(cant);
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
