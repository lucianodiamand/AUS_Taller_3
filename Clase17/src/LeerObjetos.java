import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LeerObjetos {

	// Serializacion
	public static void main(String[] args) {
		try (
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		) {
			Persona p = (Persona) ois.readObject();
			System.out.println(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
