
public class PilaDemo {

	public static void main(String[] args) {
		Pila<String> p1 = new Pila<>(1);
		p1.push("Hola");
		p1.push("Chau");
		p1.push("Pepe");
		p1.push("Hola");
		p1.push("Hola");

		String e1 = p1.pop();
		System.out.println(e1);

		String e2 = p1.pop();
		System.out.println(e2);

		System.out.println(p1.size());

		Pila<Integer> p2 = new Pila<>(1);
		p2.push(Integer.valueOf(1));
		p2.push(Integer.valueOf(2));
		p2.push(Integer.valueOf(3));
	}
}
