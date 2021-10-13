
public class Main2 {

	public static void main(String[] args) {
		HiloDespertador hd = new HiloDespertador();
		hd.start();
		
		try {
			hd.join(1500);
			hd.interrupt();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Yo tambien termino");
	}

}
