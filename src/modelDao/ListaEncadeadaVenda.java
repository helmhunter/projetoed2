package modelDao;

import modelBeans.NoVenda;
import modelBeans.Venda;

public class ListaEncadeadaVenda {
    private NoVenda primeira;
    private NoVenda ultima;
    private int total;

    public ListaEncadeadaVenda() {
        this.total = 0;
    }
    
    public void adicionaComeco (Venda elemento) {
        if (this.total == 0) {
            NoVenda nova = new NoVenda(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            NoVenda nova =  new NoVenda(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.total++;
    }
    
    public void adiciona (Venda elemento) {
        if (this.total==0) {
            this.adicionaComeco(elemento);
        } else {
            NoVenda nova = new NoVenda(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.total++;
        }
    }
    
    public boolean posicaoOcupada (int posicao) {
        return posicao >= 0 && posicao < this.total;
    }
    
    public NoVenda pegaCelula (int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe.");
        }
        NoVenda atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }
    
    public void adiciona (int posicao, Venda elemento) {
        if (posicao == 0) {
            this.adicionaComeco(elemento);
        } else if (posicao == this.total){
            this.adiciona(elemento);
        } else {
            NoVenda anterior = this.pegaCelula(posicao-1);
            NoVenda proxima = anterior.getProxima();
            NoVenda nova = new NoVenda(anterior.getProxima(), elemento);
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
            NoVenda penultima = this.ultima.getAnterior();
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
            NoVenda anterior = this.pegaCelula(posicao - 1);
            NoVenda atual = anterior.getProxima();
            NoVenda proxima =  atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.total--;
        }
    }
    
    public int tamanho () {
        return this.total;
    }
    
    public Venda pega (int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }
    
    public boolean contem (int codigo) {
        NoVenda atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getRegistroMS()==codigo) {
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }
    
    public NoVenda buscaCpf (long nome) {
        if (this.total == 0) {
            return null;
        }
        NoVenda atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getCpf()==nome) {
                return atual;
            }
            atual = atual.getProxima();
        }
        return null;
    }
    
    public NoVenda buscaRegistroMS (int codigo) {
        if (this.total == 0) {
            return null;
        }
        NoVenda atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getRegistroMS()==codigo) {
                return atual;
            }
            atual = atual.getProxima();
        }
        return null;
    }
    
    public void removeRegistroMS (int codigo) {
        if (buscaRegistroMS(codigo) == this.primeira) {
            this.removeComeco();
        } else if (buscaRegistroMS(codigo) == this.ultima) {
            this.removeFim();
        } else {
            NoVenda anterior = this.buscaRegistroMS(codigo);
            NoVenda atual = anterior.getProxima();
            NoVenda proxima =  atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.total--;
        }
    }
}
