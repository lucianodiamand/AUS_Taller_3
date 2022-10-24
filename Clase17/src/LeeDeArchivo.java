import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeeDeArchivo {

	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("archivo1.txt")));
		) {
			int result;
			while ((result = br.read()) != -1) {
				System.out.print((char) result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
