
package hospital;

import java.time.LocalDate;

public class NIF {
    private long numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF(long numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public void renovar(LocalDate fechaSolicitud){
        
        
    }
    
    private char calcularLetra(){
        char letra = 0;
        return letra;
    }
}
