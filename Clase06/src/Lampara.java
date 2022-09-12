
public class Lampara {

	private boolean isOn;

	public Lampara() {
		this(false);
	}

	public Lampara(boolean isOn) {
		this.isOn = isOn;
	}
	
	public void on() {
		isOn = true;
	}

	public void off() {
		isOn = false;
	}

	public boolean isPrendida() {
		return isOn;
	}

}
