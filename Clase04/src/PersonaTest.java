
public class PersonaTest {

	public static void main(String[] args) {
		Persona p1 = new Persona("Luciano", "Diamand");
		Persona p2 = new Persona("Carlos", "Perez");
		
		Persona.setValor(5);
		System.out.println(p1.getNombre());
		System.out.println(p2.getNombre());
		System.out.println("valor: " + Persona.getValor());
		
		System.out.println(Persona.getValor());

	}

}
