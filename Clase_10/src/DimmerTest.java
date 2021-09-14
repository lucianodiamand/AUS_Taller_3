
public class DimmerTest {

	public static void main(String[] args) {
		Dimmer d1 = new Dimmer();
		System.out.println(d1.getIntensidad());
		d1.inc();
		d1.inc();
		System.out.println(d1.getIntensidad());
		d1.dec();
		System.out.println(d1.getIntensidad());
		
		Dimmer d2 = new Dimmer();
		d2.inc();
		System.out.println(d2.isPrendida());
		
		Dimmer d3 = new Dimmer();
		d3.on();
		System.out.println(d3.getIntensidad());
	}
}
