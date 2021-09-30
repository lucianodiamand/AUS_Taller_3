
public class HiloTest {

	public static void main(String[] args) {
		MiHilo1 mh1 = new MiHilo1();
		MiHilo2 mh2 = new MiHilo2();
		Thread t1 = new Thread(mh2);
		mh1.start();
		t1.start();
		try {
			mh1.join();
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Fin");
	}

}
