package modelBeans;

public class NoCliente extends No {

//    private NoCliente proxima;
//    private NoCliente anterior;
    private Cliente elemento;
    
    public NoCliente (NoCliente proxima, Cliente elemento) {
        super();
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public NoCliente (Cliente elemento) {
        super();
        this.elemento = elemento;
    }
    
    public Cliente getElemento () {
        return elemento;
    }
}
