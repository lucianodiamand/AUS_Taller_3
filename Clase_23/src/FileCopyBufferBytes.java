import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBufferBytes {

	public static void main(String[] args) {
		try {
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream("cortito.pdf");
				fos = new FileOutputStream("salida.pdf");
				int cant;
				byte [] buffer = new byte[1024];
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
