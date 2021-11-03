import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {

	public static void main(String[] args) {
		try (DatagramSocket ds = new DatagramSocket()) {
			String message = "Hola";
			DatagramPacket dp = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getLocalHost(),
					8888);
			ds.send(dp);
			DatagramSocket ds2 = new DatagramSocket(4444);
			byte[] buffer = new byte[256];
			dp = new DatagramPacket(buffer, buffer.length);
			ds2.receive(dp);
			String m = new String(dp.getData());
			System.out.println(m);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
