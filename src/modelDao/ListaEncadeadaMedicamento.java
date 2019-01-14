package modelDao;

import modelBeans.CelulaMedicamento;
import modelBeans.Medicamento;

public class ListaEncadeadaMedicamento {

    private CelulaMedicamento primeira;
    private CelulaMedicamento ultima;
    private int total;

    public ListaEncadeadaMedicamento() {
        this.total = 0;
    }
    
    public void adicionaComeco (Medicamento elemento) {
        if (this.total == 0) {
            CelulaMedicamento nova = new CelulaMedicamento(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            CelulaMedicamento nova =  new CelulaMedicamento(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.total++;
    }
    
    public void adiciona (Medicamento elemento) {
        if (this.total==0) {
            this.adicionaComeco(elemento);
        } else {
            CelulaMedicamento nova = new CelulaMedicamento(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.total++;
        }
    }
    
    public boolean posicaoOcupada (int posicao) {
        return posicao >= 0 && posicao < this.total;
    }
    
    public CelulaMedicamento pegaCelula (int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe.");
        }
        CelulaMedicamento atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }
    
    public void adiciona (int posicao, Medicamento elemento) {
        if (posicao == 0) {
            this.adicionaComeco(elemento);
        } else if (posicao == this.total){
            this.adiciona(elemento);
        } else {
            CelulaMedicamento anterior = this.pegaCelula(posicao-1);
            CelulaMedicamento proxima = anterior.getProxima();
            CelulaMedicamento nova = new CelulaMedicamento(anterior.getProxima(), elemento);
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
            CelulaMedicamento penultima = this.ultima.getAnterior();
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
            CelulaMedicamento anterior = this.pegaCelula(posicao - 1);
            CelulaMedicamento atual = anterior.getProxima();
            CelulaMedicamento proxima =  atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.total--;
        }
    }
    
    public int tamanho () {
        return this.total;
    }
    
    public Medicamento pega (int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }
    
    public boolean contem (int codigo) {
        CelulaMedicamento atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getCodigo()==codigo) {
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }
    
    public CelulaMedicamento buscaNome (String nome) {
        if (this.total == 0) {
            return null;
        }
        CelulaMedicamento atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getNome().equals(nome)) {
                return atual;
            }
            atual = atual.getProxima();
        }
        return null;
    }
    
    public CelulaMedicamento buscaCodigo (int codigo) {
        if (this.total == 0) {
            return null;
        }
        CelulaMedicamento atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getCodigo()==codigo) {
                return atual;
            }
            atual = atual.getProxima();
        }
        return null;
    }
    
    public void removeCodigo (int codigo) {
        if (buscaCodigo(codigo) == this.primeira) {
            this.removeComeco();
        } else if (buscaCodigo(codigo) == this.ultima) {
            this.removeFim();
        } else {
            CelulaMedicamento anterior = this.buscaCodigo(codigo);
            CelulaMedicamento atual = anterior.getProxima();
            CelulaMedicamento proxima =  atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.total--;
        }
    }
}
