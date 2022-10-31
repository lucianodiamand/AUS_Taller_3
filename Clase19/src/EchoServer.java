import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

	public static void main(String[] args) {
		try (ServerSocket ss = new ServerSocket(5555)) {
			do {
				Socket s = ss.accept();

				new Thread(new Runnable() {
					public void run() {
						System.out.println("Se conecto un cliente al puerto " + ss.getLocalPort());
						try {
							try {
								Scanner in = new Scanner(s.getInputStream());
								PrintWriter out = new PrintWriter(s.getOutputStream(), true);
								while (in.hasNextLine()) {
									String linea = in.nextLine();
									out.println(linea);
									if ("quit".equals(linea)) {
										System.out.println("Cliente: saliendo!");
										break;
									}
								}
							} finally {
								s.close();
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}).start();
			} while (true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
