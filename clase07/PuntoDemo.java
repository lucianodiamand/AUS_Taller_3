
public class PuntoDemo {

  public static void main(String [] args) {
    Punto p1 = new Punto();
    Punto p2 = new Punto(4, 6);

    System.out.println(p1.distancia(p2));
    System.out.println(p1.x);
  }
}
