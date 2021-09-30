
public class BasuraTest {

	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			Basura b = new Basura();
			b.setS("Hola");
			b.setI(i);
		}
	}
}
