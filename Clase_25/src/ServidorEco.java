import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class ServidorEco {

	public static void main(String[] args) {
		try (ServerSocket ss = new ServerSocket(5555)) {
			System.out.println("Servidor creado!");
			
			Socket s = ss.accept();
			InputStream is = s.getInputStream();
			OutputStream out = s.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
			String linea;
			while ((linea = br.readLine()) != null) {
				if ("SALIR".equalsIgnoreCase(linea)) {
					break;
				}
				bw.write(linea);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
