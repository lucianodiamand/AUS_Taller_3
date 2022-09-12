
public class Color {

	// Type enum def
	public static final Color GRIS = new Color(127);
	public static final Color NEGRO = new Color(0);
	public static final Color BLANCO = new Color(255);
	
	private int rgb;
	
	private Color(int rgb) {
		this.rgb = rgb;
	}

	public int getRGB() {
		return rgb;
	}

}
