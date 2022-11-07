import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Broadcast {

	public static void main(String[] args) {
		try (DatagramSocket ds = new DatagramSocket()) {
			ds.setBroadcast(true);
			DatagramPacket packet = new DatagramPacket("Hola a todos".getBytes(), "Hola a todos".length(),
					InetAddress.getByName("192.168.0.255"), 7777);
			ds.send(packet);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
