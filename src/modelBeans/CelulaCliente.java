package modelBeans;

public class CelulaCliente {

    private CelulaCliente proxima;
    private CelulaCliente anterior;
    private Cliente elemento;
    
    public CelulaCliente (CelulaCliente proxima, Cliente elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public CelulaCliente (Cliente elemento) {
        this.elemento = elemento;
    }
    
    public void setProxima (CelulaCliente proxima) {
        this.proxima = proxima;
    }
    
    public CelulaCliente getProxima () {
        return proxima;
    }
    
    public void setAnterior (CelulaCliente anterior) {
        this.anterior =  anterior;
    }
    
    public CelulaCliente getAnterior () {
        return anterior;
    }
    
    public Cliente getElemento () {
        return elemento;
    }
}
