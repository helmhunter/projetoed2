package modelBeans;

public class CelulaMedicamento {

    private CelulaMedicamento proxima;
    private CelulaMedicamento anterior;
    private Medicamento elemento;
    
    public CelulaMedicamento (CelulaMedicamento proxima, Medicamento elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public CelulaMedicamento (Medicamento elemento) {
        this.elemento = elemento;
    }
    
    public void setProxima (CelulaMedicamento proxima) {
        this.proxima = proxima;
    }
    
    public CelulaMedicamento getProxima () {
        return proxima;
    }
    
    public void setAnterior (CelulaMedicamento anterior) {
        this.anterior =  anterior;
    }
    
    public CelulaMedicamento getAnterior () {
        return anterior;
    }
    
    public Medicamento getElemento () {
        return elemento;
    }
}
