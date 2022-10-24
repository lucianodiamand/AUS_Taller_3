
public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Antes");
		Hilo01Thread t1 = new Hilo01Thread();
	    t1.start();
	    Hilo02Runnable r2 = new Hilo02Runnable();
	    Thread t2 = new Thread(r2);
	    t2.start();
	    System.out.println("Despues");
	}
}
