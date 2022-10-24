import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicadosDemo {

	public static void main(String[] args) {
		Persona p1 = new Persona(12345678, "Luciano", "Diamand");
		Persona p2 = new Persona(11223344, "Martin", "Caradagian");
		Persona p3 = new Persona(88776655, "Paloma", "Martinez");
		Persona p4 = new Persona(51515151, "Viky", "Poi");
		Persona p5 = new Persona(12345678, "Luciano", "Diamand");

		Set<Persona> personas = new HashSet<>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);

		for (Persona persona : personas) {
			System.out.println(persona);
		}

		boolean personasIguales = p1.equals(p5);
		System.out.println(personasIguales);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p5.hashCode());

		List<Persona> personasLista = new ArrayList<>(personas);

		for (Persona persona : personasLista) {
			System.out.println(persona);
		}

		Collections.sort(personasLista);

		System.out.println("---------------------------------------------");
		for (Persona persona : personasLista) {
			System.out.println(persona);
		}

		Collections.sort(personasLista, new PersonaComparator());
		
		System.out.println("---------------------------------------------");
		for (Persona persona : personasLista) {
			System.out.println(persona);
		}

//		String a = "Hola";q
//		String b = new String("Hola");
//		boolean sonIguales = a == b;
//		boolean sonIgualesPorContenido = a.equals(b);
//		System.out.println(sonIguales);
//		System.out.println(sonIgualesPorContenido);
	}

}
