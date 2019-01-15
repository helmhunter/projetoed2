package modelBeans;

public class NoVenda {

    public NoVenda getProxima() {
        return proxima;
    }

    public void setProxima(NoVenda proxima) {
        this.proxima = proxima;
    }

    public NoVenda getAnterior() {
        return anterior;
    }

    public void setAnterior(NoVenda anterior) {
        this.anterior = anterior;
    }

    public Venda getElemento() {
        return elemento;
    }

    public void setElemento(Venda elemento) {
        this.elemento = elemento;
    }
    
    public NoVenda (NoVenda proxima, Venda elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public NoVenda (Venda elemento) {
        this.elemento = elemento;
    }
    
    private NoVenda proxima;
    private NoVenda anterior;
    private Venda elemento;
    
}
