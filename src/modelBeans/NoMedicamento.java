package modelBeans;

public class NoMedicamento extends No {

//    private NoMedicamento proxima;
//    private NoMedicamento anterior;
    private Medicamento elemento;
    
    public NoMedicamento (NoMedicamento proxima, Medicamento elemento) {
        super();
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public NoMedicamento (Medicamento elemento) {
        super();
        this.elemento = elemento;
    }
    
    public Medicamento getElemento () {
        return elemento;
    }
}
