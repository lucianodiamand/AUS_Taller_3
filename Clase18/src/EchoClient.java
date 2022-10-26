import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {
		try (Socket s = new Socket("localhost", 5555)) {
			Scanner in = new Scanner(s.getInputStream());
			PrintWriter out = new PrintWriter(s.getOutputStream(), true);
			Scanner teclado = new Scanner(System.in);
			while (teclado.hasNextLine()) {
				String lineaPorTeclado = teclado.nextLine();
				System.out.println("Cliente: -> " + lineaPorTeclado);
				out.println(lineaPorTeclado);
				if (in.hasNextLine()) {
					System.out.println(in.nextLine());
				}
				if ("quit".equals(lineaPorTeclado)) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
