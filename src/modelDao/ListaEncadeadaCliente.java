package modelDao;

import modelBeans.NoCliente;
import modelBeans.Cliente;

public class ListaEncadeadaCliente {

    private NoCliente primeira;
    private NoCliente ultima;
    private int total;

    public ListaEncadeadaCliente() {
        this.total = 0;
    }
    
    public void adicionaComeco (Cliente elemento) {
        if (this.total == 0) {
            NoCliente nova = new NoCliente(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            NoCliente nova =  new NoCliente(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.total++;
    }
    
    public void adiciona (Cliente elemento) {
        if (this.total==0) {
            this.adicionaComeco(elemento);
        } else {
            NoCliente nova = new NoCliente(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.total++;
        }
    }
    
    public boolean posicaoOcupada (int posicao) {
        return posicao >= 0 && posicao < this.total;
    }
    
    public NoCliente pegaCelula (int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe.");
        }
        NoCliente atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }
    
    public void adiciona (int posicao, Cliente elemento) {
        if (posicao == 0) {
            this.adicionaComeco(elemento);
        } else if (posicao == this.total){
            this.adiciona(elemento);
        } else {
            NoCliente anterior = this.pegaCelula(posicao-1);
            NoCliente proxima = anterior.getProxima();
            NoCliente nova = new NoCliente(anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.total++;
        }
    }
    
    public void  removeComeco () {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException ("Posicão não existe.");
        }
        this.primeira = this.primeira.getProxima();
        this.total--;
        if (this.total == 0){
            this.ultima = null;
        }
    }
    
    public void removeFim () {
        if (!this.posicaoOcupada(this.total - 1)) {
            throw new IllegalArgumentException("Posição não existe.");
        }
        if (this.total == 1) {
            this.removeComeco();
        } else {
            NoCliente penultima = this.ultima.getAnterior();
            penultima.setProxima(null);
            this.ultima = penultima;
            this.total--;
        }
    }
    
    public void remove (int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não Existe.");
        }
        if (posicao == 0) {
            this.removeComeco();
        } else if (posicao == this.total - 1) {
            this.removeFim();
        } else  {
            NoCliente anterior = this.pegaCelula(posicao - 1);
            NoCliente atual = anterior.getProxima();
            NoCliente proxima =  atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.total--;
        }
    }
    
    public int tamanho () {
        return this.total;
    }
    
    public Cliente pega (int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }
    
    public boolean contem (int cpf) {
        NoCliente atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getCpf()==cpf) {
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }
    
    public NoCliente buscaNome (String nome) {
        if (this.total == 0) {
            return null;
        }
        NoCliente atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getNome().equals(nome)) {
                return atual;
            }
            atual = atual.getProxima();
        }
        return null;
    }
    
    public NoCliente buscaCpf (long cpf) {
        if (this.total == 0) {
            return null;
        }
        NoCliente atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getCpf()==cpf) {
                return atual;
            }
            atual = atual.getProxima();
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
            NoCliente atual = anterior.getProxima();
            NoCliente proxima =  atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.total--;
        }
    }
}
