import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorMultiple {

	public static void main(String[] args) {
		try (ServerSocket ss = new ServerSocket(4444)) {
			while (true) {
				Socket s = ss.accept();
				new MiCliente(s).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static class MiCliente extends Thread {

		private Socket s;
		public MiCliente(Socket s) {
			this.s = s;
		}
		
		public void run() {
			while (true) {
				try {
					InputStream is = s.getInputStream();
					OutputStream out = s.getOutputStream();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + " estoy haciendo algo");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	};
}
