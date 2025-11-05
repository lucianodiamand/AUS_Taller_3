import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Broadcast {

  public static void main(String [ ] args ) {
    try (DatagramSocket ds = new DatagramSocket()) {
    ds.setBroadcast(true);
    String mensaje = "Hola desde broadcast";
    DatagramPacket dp = new DatagramPacket(mensaje.getBytes(),
        mensaje.length(), InetAddress.getByName("255.255.255.255"),
        5555);
    ds.send(dp);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
