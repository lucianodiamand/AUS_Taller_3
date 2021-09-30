
public class PilaTest {

	public static void main(String[] args) {
		Pila<String> p = new Pila<>();
		p.push("Hola");
		p.push("Chau");
		p.push("Pepe");
		p.push("Sopa");
		
		System.out.println(p.pop());
		System.out.println(p.pop());
		System.out.println(p.pop());
		System.out.println(p.pop());

		Pila<Integer> p2 = new Pila<>();
//		p2.push("Hola");
		p2.push(Integer.valueOf(3));
		
		PilaNoRepetidos<String> pilano = new PilaNoRepetidos<>();
		pilano.push("Hola1");
		pilano.push("Chau1");
		pilano.push("Hola1");
		pilano.push("Chau1");
		pilano.push("Hola1");
		
		System.out.println(pilano.pop());
		System.out.println(pilano.pop());
		System.out.println(pilano.pop());
		System.out.println(pilano.pop());
	}
}
