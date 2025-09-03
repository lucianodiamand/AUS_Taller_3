
public class StringDemo2 {

  public static void main(String [] args) {
     String a = "";
     long start = System.currentTimeMillis();
     for (int i = 0; i < 100000; i++) {
       a = a + i;
     }
     long end = System.currentTimeMillis();

     System.out.println(end - start);
     long start2 = System.currentTimeMillis();
     StringBuilder sb = new StringBuilder("");
     for (int i = 0; i < 100000; i++) {
       sb.append(i);
     }
     long end2 = System.currentTimeMillis();
     System.out.println(end2 - start2);
     if (a.equals(sb.toString())) {
       System.out.println("OK");
     } else { 
       System.out.println("MAL");
     }
     //System.out.println(sb.toString());

  }
}
