import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;

public class ServerUDP {

  public static void main(String []args) throws IOException {
    DatagramSocket ds = new DatagramSocket(5555);
    byte [] buffer = new byte[255];
    DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
    ds.receive(dp);
    String respuesta = new String(dp.getData(), 0, dp.getLength());
    System.out.println(respuesta);
  }

}
