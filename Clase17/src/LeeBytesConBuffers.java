import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeeBytesConBuffers {

	public static void main(String[] args) {
		try (
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("archivo1.bin"));
		    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("archivo2.bin"));
		) {
			long start = System.currentTimeMillis();
			int result;
			while ((result = bis.read()) != -1) {
			    bos.write(result);
			}
			long end = System.currentTimeMillis();
			System.out.println("Pasaron " + (end - start) + " ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
