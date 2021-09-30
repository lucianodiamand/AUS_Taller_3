
public class Basura {

	private String s;
	
	private int i;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	protected void finalize() {
		System.out.println("Adios mundo cruel!!!!! (dice: " + i + ")");
	}

}
