package modelBeans;

public class NoMedicamento {

    private NoMedicamento proxima;
    private NoMedicamento anterior;
    private Medicamento elemento;
    
    public NoMedicamento (NoMedicamento proxima, Medicamento elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public NoMedicamento (Medicamento elemento) {
        this.elemento = elemento;
    }
    
    public void setProxima (NoMedicamento proxima) {
        this.proxima = proxima;
    }
    
    public NoMedicamento getProxima () {
        return proxima;
    }
    
    public void setAnterior (NoMedicamento anterior) {
        this.anterior =  anterior;
    }
    
    public NoMedicamento getAnterior () {
        return anterior;
    }
    
    public Medicamento getElemento () {
        return elemento;
    }
}
