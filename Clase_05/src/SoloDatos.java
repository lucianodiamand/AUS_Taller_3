
public class SoloDatos {

	// Campos (atributos): estado
	// nivel de acceso | <static> | tipo | identificador; 
	// private                      int    edad         ;
	
	// Metodos: comportamiento
	// nivel de acceso | <static> | tipo de retorno | identificador | (tipo iden1, tipo iden2, ..) { }
	// public                       int               obtieneEdad     () { 
	//     return edad; 
    // } 
	
	// int, double, boolean, char, String
	private int i;
	
	private static int j; 

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static int getJ() {
		return j;
	}
	
	public static void setJ(int nj) {
		j = nj;
	}
}
