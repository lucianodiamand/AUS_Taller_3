
public class StringDemo {

  public static void main(String [] args) {
    String s1 = new String("Hola");
    String s2 = new String("Hola");
    String s3 = "Hola";
    System.out.println("Chau");
    s3.toUpperCase();
    String s4 = s3.toUpperCase();
    String s5 = s2 + s4;
    s4 = s5;
    boolean b = s1.equals(s2); // true
    boolean b2 = s1 == s2; // false
    boolean b3 = s2 == s3; // true
    
  }
}
