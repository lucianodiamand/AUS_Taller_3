import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class EchoServer {

	public static void main(String[] args) {
		try (DatagramSocket ds = new DatagramSocket(6666)) {
			byte[] buff = new byte[256];
			DatagramPacket packet = new DatagramPacket(buff, buff.length);
			ds.receive(packet);
			packet = new DatagramPacket(packet.getData(), packet.getData().length, packet.getAddress(),
					packet.getPort());
			ds.send(packet);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
