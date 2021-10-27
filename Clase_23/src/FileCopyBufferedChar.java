import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyBufferedChar {

	public static void main(String[] args) {
		try {
			BufferedInputStream fis = null;
			BufferedOutputStream fos = null;
			try {
				fis = new BufferedInputStream(new FileInputStream("archivo.txt"));
				fos = new BufferedOutputStream(new FileOutputStream("salida.txt"));
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
