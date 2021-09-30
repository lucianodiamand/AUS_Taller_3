
public class MiHilo2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i > -1000; i--) {
			System.out.println(i);
			if (i == -500) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
