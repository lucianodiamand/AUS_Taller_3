import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteEco {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in);
				Socket s = new Socket("localhost", 5555)) {
			InputStream is = s.getInputStream();
			OutputStream out = s.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
			while (teclado.hasNextLine()) {
				String linea = teclado.nextLine();
				bw.write(linea);
				bw.newLine();
				bw.flush();
				if ("SALIR".equalsIgnoreCase(linea)) {
					break;
				}
				
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
