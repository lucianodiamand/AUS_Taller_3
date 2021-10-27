import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileUtils {

	public static void main(String[] args) throws IOException {
		File f = new File("src", "File2Demo.java");
		Scanner s = new Scanner(f);
		String line = s.nextLine();
		System.out.println(line);
		
		FileWriter fw = new FileWriter("salida.txt");
		PrintWriter pw = new PrintWriter(fw, true);
		pw.println("akjshdjkasdh");
		pw.println("bvcbcvbcvbvb");
	}
}
