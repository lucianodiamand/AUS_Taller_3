
public class Dimmer extends Lampara {

	private int intensidad;

	private int max;
	
	private int min;

	public Dimmer() {
		this(0, 10, 0);
	}

	public Dimmer(int min, int max, int color) {
		super(color);
		System.out.println("Estoy en dimmer");
		this.min = min;
		this.max = max;
	}

	public int getIntensidad() {
		return intensidad;
	}
	
	public void inc() {
		if (intensidad < max) {
			intensidad++;
			super.on();	
		}
	}

	@Override
	public void on() {
		inc();
	}

	public void dec() {
		intensidad--;
		if (intensidad == 0) {
			off();
		}
	}

}
