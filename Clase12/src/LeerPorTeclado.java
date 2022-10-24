import java.util.Scanner;

public class LeerPorTeclado {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese una frase: ");
		String line = in.nextLine();
		System.out.println(line);
		
		System.out.print("Ingrese algo mas (un numero): ");
		Long num = in.nextLong();
		System.out.println(num);
	}
}
