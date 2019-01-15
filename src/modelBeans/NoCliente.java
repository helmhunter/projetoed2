package modelBeans;

public class NoCliente {

    private NoCliente proxima;
    private NoCliente anterior;
    private Cliente elemento;
    
    public NoCliente (NoCliente proxima, Cliente elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public NoCliente (Cliente elemento) {
        this.elemento = elemento;
    }
    
    public void setProxima (NoCliente proxima) {
        this.proxima = proxima;
    }
    
    public NoCliente getProxima () {
        return proxima;
    }
    
    public void setAnterior (NoCliente anterior) {
        this.anterior =  anterior;
    }
    
    public NoCliente getAnterior () {
        return anterior;
    }
    
    public Cliente getElemento () {
        return elemento;
    }
}
