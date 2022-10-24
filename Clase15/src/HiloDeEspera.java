
public class HiloDeEspera extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			char aleatorio = (char)((int) (Math.random() * 26) + 'A');
			System.out.println(aleatorio);
			try {
			    Thread.sleep((int)(Math.random() * 600) + 200);
			} catch (InterruptedException ex) { 
				System.out.println("Uhhh buenos dias!");
				return;
			}
		}
	}

}
