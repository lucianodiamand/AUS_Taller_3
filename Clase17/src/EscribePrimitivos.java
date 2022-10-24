import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribePrimitivos {

	public static void main(String[] args) {
		try (
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("archivo3.bin"));
		) {
			dos.writeBoolean(false);
			dos.writeDouble(1.2);
			dos.writeLong(1000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
