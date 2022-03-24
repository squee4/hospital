
package hospital;

public class Paciente extends Persona {
    private String numeroHistoria;

    public Paciente(String numeroHistoria, String nombre, String apellidos, NIF nif) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }
    
    public void tomarMedicina(String medicina){
        
    }
}
