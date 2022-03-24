
package hospital;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre, apellidos;
    private NIF nif;

    public Persona(String nombre, String apellidos, NIF nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }
    
    public void renovarNIF(LocalDate fechaSolicitud){
        
    }
    
}
