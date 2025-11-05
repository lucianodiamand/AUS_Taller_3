import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {

  public static void main (String [] args) throws IOException {
    DatagramSocket ds = new DatagramSocket();
    String mensaje = "Hola";
    DatagramPacket dp = new DatagramPacket(mensaje.getBytes(),
        mensaje.length(), InetAddress.getByName("127.0.0.1"), 5555);

    ds.send(dp);
  }
}
