import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		try (DatagramSocket ds = new DatagramSocket(8888)) {
			System.out.println("Servidor iniciado");
			byte[] buffer = new byte[256];
			DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);
			ds.receive(paquete);
			String message = new String(paquete.getData());
			DatagramSocket ds2 = new DatagramSocket();
			paquete = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getLocalHost(), 4444);
			ds2.send(paquete);
			System.out.println("Enviado");
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
