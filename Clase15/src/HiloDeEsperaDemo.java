
public class HiloDeEsperaDemo {

	public static void main(String[] args) {
		System.out.println("Hola");
		HiloDeEspera hde = new HiloDeEspera();
		hde.start();
		try {
			hde.join(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (hde.isAlive()) {
			hde.interrupt();
		}
		System.out.println("Chau");
	}
}
