
package hospital;

public class Administrativo extends Empleado{
    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario) {
        super(numeroSeguridadSocial, salario);
        this.grupo = grupo;
    }
    
    public void registrarDocumento(String nombreDoc){
        
    }
    
    @Override
    public double calcularIRPF(){
        double irpf = 0;
        
        return irpf;
    }
}
