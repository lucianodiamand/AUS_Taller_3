import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

	public static void main(String[] args) {
		try (
			ServerSocket ss = new ServerSocket(5555);
			Socket s = ss.accept();
		) {
			System.out.println("Se conecto un cliente al puerto " + ss.getLocalPort());
			Scanner in = new Scanner(s.getInputStream());
			PrintWriter out = new PrintWriter(s.getOutputStream(), true);
			while (in.hasNextLine()) {
				String linea = in.nextLine();
				System.out.println("Server: " + linea);
				out.println(linea);
				if ("quit".equals(linea)) {
					System.out.println("Server: saliendo!");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
