package clase02;


public class PersonaDemo {

	public static void main(String[] args) {
	    System.out.println("Hola Mundo");
	    Persona p1 = new Persona();
        p1.setNombre("Luciano");
        p1.setApellido("Diamand");
        p1.setEdad(50);
        
        Persona p2 = new Persona();
        p2.setNombre("Cintia");
        
        System.out.println(p2.getNombre());
        
	}
}
