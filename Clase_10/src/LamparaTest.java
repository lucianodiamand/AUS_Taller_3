
public class LamparaTest {

	public static void main(String[] args) {
		Lampara l1 = new Lampara();
		l1.on();
		l1.off();
		System.out.println(l1.isPrendida());
		
		Lampara l2 = new Lampara();
		System.out.println(l2.isPrendida());
	}
}
