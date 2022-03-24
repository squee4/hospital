
package hospital;

public class Medico extends Empleado{
    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario) {
        super(numeroSeguridadSocial, salario);
        this.especialidad = especialidad;
    }
    
    public void tratar(Paciente paciente, String medicina){
        
    }
    
    @Override
    public double calcularIRPF(){
        double irpf = 0;
        
        return irpf;
    }
}
