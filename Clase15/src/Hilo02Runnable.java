
public class Hilo02Runnable implements Runnable {

	@Override
	public void run() {
		for (int i = 999; i >= 0; i--) {
			System.out.println("\t" + i);
		}
	}

}
