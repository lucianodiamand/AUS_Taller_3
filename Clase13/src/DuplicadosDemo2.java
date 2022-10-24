import java.util.Set;
import java.util.TreeSet;

public class DuplicadosDemo2 {

	public static void main(String[] args) {
		Persona p1 = new Persona(12345678, "Luciano", "Diamand");
		Persona p2 = new Persona(11223344, "Martin", "Caradagian");
		Persona p3 = new Persona(88776655, "Paloma", "Martinez");
		Persona p4 = new Persona(51515151, "Viky", "Poi");
		Persona p5 = new Persona(12345678, "Luciano", "Diamand");

		Set<Persona> personas = new TreeSet<>(new PersonaComparator());
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

}
