
public class HiloTest2 {

	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Fin");
	}

}
