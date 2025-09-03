
public class Punto {

  private int x;
  private int y;

  public Punto(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Punto() {
    x = (int) (Math.random() * 11);
    y = (int) (Math.random() * 11);
  }

  public double distancia (Punto p) {
    return Math.sqrt(
        Math.pow(x - p.x, 2)
        +
        Math.pow(y - p.y, 2)
        );
  }
}
