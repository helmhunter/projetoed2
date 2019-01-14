package modelDao;

import modelBeans.NoMedicamento;
import modelBeans.Medicamento;

public class ListaEncadeadaMedicamento {

    private NoMedicamento primeira;
    private NoMedicamento ultima;
    private int total;

    public ListaEncadeadaMedicamento() {
        this.total = 0;
    }
    
    public void adicionaComeco (Medicamento elemento) {
        if (this.total == 0) {
            NoMedicamento nova = new NoMedicamento(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            NoMedicamento nova =  new NoMedicamento(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.total++;
    }
    
    public void adiciona (Medicamento elemento) {
        if (this.total==0) {
            this.adicionaComeco(elemento);
        } else {
            NoMedicamento nova = new NoMedicamento(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.total++;
        }
    }
    
    public boolean posicaoOcupada (int posicao) {
        return posicao >= 0 && posicao < this.total;
    }
    
    public NoMedicamento pegaCelula (int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe.");
        }
        NoMedicamento atual = primeira;
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
            NoMedicamento anterior = this.pegaCelula(posicao-1);
            NoMedicamento proxima = anterior.getProxima();
            NoMedicamento nova = new NoMedicamento(anterior.getProxima(), elemento);
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
            NoMedicamento penultima = this.ultima.getAnterior();
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
            NoMedicamento anterior = this.pegaCelula(posicao - 1);
            NoMedicamento atual = anterior.getProxima();
            NoMedicamento proxima =  atual.getProxima();
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
        NoMedicamento atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getRegistroMS()==codigo) {
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }
    
    public NoMedicamento buscaNome (String nome) {
        if (this.total == 0) {
            return null;
        }
        NoMedicamento atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getNome().equals(nome)) {
                return atual;
            }
            atual = atual.getProxima();
        }
        return null;
    }
    
    public NoMedicamento buscaCodigo (int codigo) {
        if (this.total == 0) {
            return null;
        }
        NoMedicamento atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().getRegistroMS()==codigo) {
                return atual;
            }
            atual = atual.getProxima();
        }
        return null;
    }
    
    public void removeRegistroMS (int codigo) {
        if (buscaCodigo(codigo) == this.primeira) {
            this.removeComeco();
        } else if (buscaCodigo(codigo) == this.ultima) {
            this.removeFim();
        } else {
            NoMedicamento anterior = this.buscaCodigo(codigo);
            NoMedicamento atual = anterior.getProxima();
            NoMedicamento proxima =  atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.total--;
        }
    }
}
