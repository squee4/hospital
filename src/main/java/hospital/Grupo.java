
package hospital;

public enum Grupo {
    C(0.175), D(0.18), E(0.185);
    
    private double irpf;

    private Grupo(double irpf) {
        this.irpf = irpf;
    }
    
}
