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

	public static int getOrder(Color color) {
		if (color.equals(Color.RED)) {
			return 0;
		}
		if (color.equals(Color.GREEN)) {
			return 1;
		}
		if (color.equals(Color.BLUE)) {
			return 2;
		}
		if (color.equals(Color.YELLOW)) {
			return 3;
		}
		// throw new IllegalArgumentException("Color " + color + " no encontrado");
		return -1;
	}

}
