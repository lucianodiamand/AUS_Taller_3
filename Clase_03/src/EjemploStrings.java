
public class EjemploStrings {

	public static void main(String[] args) {
		String s = "    Hola  \t   \n";
		String s2 = s.trim();
		System.out.println(s2.length());
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hola");
		sb.append("  ");
		sb.append("Chau");
		
		System.out.println(sb.toString());
	}
}
