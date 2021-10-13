
public class HiloDespertador extends Thread {

	@Override
	public void run() {
		while (true) {
			try {
				int sleep = (400 + (int)(Math.random() * 200));
				Thread.sleep(sleep);
				if (sleep <= 515 && sleep >= 485) {
					System.out.println("Listo, no duermo más!");
					break;
				}
			} catch (InterruptedException e) {
//				e.printStackTrace();
			}
		}
	}
	
}
