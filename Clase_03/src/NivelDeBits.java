
public class NivelDeBits {

	public static void main(String[] args) {
		int i = 0xA8; // 00000...00010101010 (32bits)
		// &
		int r = i & 0x08; // 000...00001000 (32bits)
		if (r == 8) {
			System.out.println("El bit esta en 1");
		}
		if (r == 0) {
			System.out.println("El bit esta en 0");
		}
		
		r = i | 0x0F;
		r = r & 0x0F;
		if (r == 0x0F) {
			System.out.println("bits en 1111");
		} else {
			System.out.println("NO es bits en 1111");
		}
		// 1111
		r = r << 2; // 111100
		System.out.println(r); // 30
		
		r = r >> 2; // Corrimiento a la derecha
		// manteniendo el bit de signo
		System.out.println(r); // 15
		
		r = r >>> 1; // Corrimiento a la derecha 
		// ingresando ceros a la izquierda
		
	}
	
}
