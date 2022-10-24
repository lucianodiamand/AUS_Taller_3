import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribeObjetos {

	// Serializacion
	public static void main(String[] args) {
		try (
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		) {
			Persona p = new Persona("Luciano", "Diamand");
			oos.writeObject(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
