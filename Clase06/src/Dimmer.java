
public class Dimmer extends Lampara {

	private int intensidad;

	public Dimmer() {
		super();
	}

	public Dimmer(boolean isOn) {
		super(isOn);
	}

	@Override
	public void on() {
		super.on();
		intensidad++;
	}

	public void inc() {
		if (intensidad == 0) {
		  super.on();
		}
		intensidad++;
	}

	public void dec() {
		intensidad--;
	}

	public int getIntensidad() {
		return intensidad;
	}

}
