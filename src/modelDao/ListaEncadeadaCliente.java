package modelDao;

import modelBeans.NoCliente;
import modelBeans.Cliente;

public class ListaEncadeadaCliente extends ListaEncadeada {

//    private NoCliente primeira;
//    private NoCliente ultima;
//    private int total;

    public ListaEncadeadaCliente() {
        super(0);
    }
    
    public void adicionaComeco (Cliente elemento) {
        if (this.getTotal() == 0) {
            NoCliente nova = new NoCliente(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            NoCliente nova =  new NoCliente((NoCliente) this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.setTotal(getTotal()+1);
    }
    
    public void adiciona (Cliente elemento) {
        if (this.getTotal()==0) {
            this.adicionaComeco(elemento);
        } else {
            NoCliente nova = new NoCliente(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.setTotal(getTotal()+1);
        }
    }
    
    public NoCliente pegaNo (int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe.");
        }
        NoCliente atual = (NoCliente) primeira;
        for (int i = 0; i < posicao; i++) {
            atual = (NoCliente) atual.getProxima();
        }
        return atual;
    }
    
    public void adiciona (int posicao, Cliente elemento) {
        if (posicao == 0) {
            this.adicionaComeco(elemento);
        } else if (posicao == this.getTotal()){
            this.adiciona(elemento);
        } else {
            NoCliente anterior = this.pegaNo(posicao-1);
            NoCliente proxima = (NoCliente) anterior.getProxima();
            NoCliente nova = new NoCliente((NoCliente) anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.setTotal(getTotal()+1);
        }
    }
    
    public void removeFim () {
        if (!this.posicaoOcupada(this.getTotal() - 1)) {
            throw new IllegalArgumentException("Posição não existe.");
        }
        if (this.getTotal() == 1) {
            this.removeComeco();
        } else {
            NoCliente penultima = (NoCliente) this.ultima.getAnterior();
            penultima.setProxima(null);
            this.ultima = penultima;
            this.setTotal(getTotal()-1);
        }
    }
    
    public void remove (int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não Existe.");
        }
        if (posicao == 0) {
            this.removeComeco();
        } else if (posicao == this.getTotal() - 1) {
            this.removeFim();
        } else  {
            NoCliente anterior = this.pegaNo(posicao - 1);
            NoCliente atual = (NoCliente) anterior.getProxima();
            NoCliente proxima =  (NoCliente) atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.setTotal(getTotal()-1);
        }
    }
    
    public Cliente pega (int posicao) {
        return this.pegaNo(posicao).getElemento();
    }
    
    public boolean contem (int cpf) {
        NoCliente atual = (NoCliente) this.primeira;
        while (atual != null) {
            if (atual.getElemento().getCpf()==cpf) {
                return true;
            }
            atual = (NoCliente) atual.getProxima();
        }
        return false;
    }
    
    public NoCliente buscaNome (String nome) {
        if (this.getTotal() == 0) {
            return null;
        }
        NoCliente atual = (NoCliente) this.primeira;
        while (atual != null) {
            if (atual.getElemento().getNome().equals(nome)) {
                return atual;
            }
            atual = (NoCliente) atual.getProxima();
        }
        return null;
    }
    
    public NoCliente buscaCpf (long cpf) {
        if (this.getTotal() == 0) {
            return null;
        }
        NoCliente atual = (NoCliente) this.primeira;
        while (atual != null) {
            if (atual.getElemento().getCpf()==cpf) {
                return atual;
            }
            atual = (NoCliente) atual.getProxima();
        }
        return null;
    }
    
    public void removeCpf (long cpf) {
        if (buscaCpf(cpf) == this.primeira) {
            this.removeComeco();
        } else if (buscaCpf(cpf) == this.ultima) {
            this.removeFim();
        } else {
            NoCliente anterior = this.buscaCpf(cpf);
            NoCliente atual = (NoCliente) anterior.getProxima();
            NoCliente proxima =  (NoCliente) atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.setTotal(getTotal()-1);
        }
    }
}
