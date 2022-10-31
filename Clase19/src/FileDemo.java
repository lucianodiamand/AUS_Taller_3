import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File f = new File("archiv.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File dir = new File("dir.txt");
		dir.mkdir();

		File echo = new File("bin/EchoServer.class");
		System.out.println(echo.getAbsolutePath());
		System.out.println(echo.length());

		File dir2 = new File("bin/anonimas");
		if (dir2.isDirectory() && dir2.exists()) {
			File[] files = dir2.listFiles();
			for (File file : files) {
				System.out.println(file.getAbsolutePath());
			}
		} else {
			System.out.println("No existe el directorio anonimas");
		}
		
		File [] roots = File.listRoots();
		for (File file : roots) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
