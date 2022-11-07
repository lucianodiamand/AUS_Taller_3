import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EchoClient {

	public static void main(String[] args) {
		try (DatagramSocket ds = new DatagramSocket()) {
			byte[] buff = new byte[256];
			DatagramPacket dp = new DatagramPacket("Hola Mundo!".getBytes(), "Hola Mundo!".length(),
					InetAddress.getLocalHost(), 6666);
			ds.send(dp);
			dp = new DatagramPacket(buff, buff.length);
			System.out.println(ds.getLocalPort());
			ds.receive(dp);
			System.out.println(new String(dp.getData()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
