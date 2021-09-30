import java.util.HashSet;
import java.util.Set;

public class PruebaSet {

	public static void main(String[] args) {
		Persona p1 = new Persona("Luciano", "Diamand");
		Persona p2 = new Persona("Carlos", "Perez");
		Persona p3 = new Persona("Marina", "Cerruti");
		Persona p4 = new Persona("Carlos", "Perez");
		
		Set<Persona> personas = new HashSet<Persona>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}
}
