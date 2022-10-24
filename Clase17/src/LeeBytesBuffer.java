import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeeBytesBuffer {

	public static void main(String[] args) {
		try (
			FileInputStream fis = new FileInputStream("ubuntu-22.04.1-desktop-amd64.iso");
		    FileOutputStream fos = new FileOutputStream("copy_ubuntu.iso");
		) {
			byte [] buffer = new byte[8192];
			int result;
			long start = System.currentTimeMillis();
			while ((result = fis.read(buffer)) != -1) {
			    fos.write(buffer, 0, result);
			}
			long end = System.currentTimeMillis();
			System.out.println("Pasaron " + (end - start) + " ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
