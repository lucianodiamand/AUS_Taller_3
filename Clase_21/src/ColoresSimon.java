import java.awt.Color;

public enum ColoresSimon {
	
	ROJO(Color.RED), VERDE(Color.GREEN), AZUL(Color.BLUE), AMARILLO(Color.YELLOW);
	
	private Color color;
	
	private ColoresSimon(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
}
