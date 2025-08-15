
public class Persona {

    // Campos
    // modificador acceso | <static> | tipo | identificador;
       private                         int    edad; 
    
    // Metodos
    // modificador acceso | <static> | tipo retorno | identificador (tipo nom1, tipo nom2, ... ) {
       public                          int            obtenerEdad() {
	   return edad; // campo edad
       }

       public                          void           cambiarEdad(int nEdad) {
           edad = nEdad;
       }
}
