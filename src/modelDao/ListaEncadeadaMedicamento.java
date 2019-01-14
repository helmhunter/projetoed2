package modelDao;

import modelBeans.NoMedicamento;
import modelBeans.Medicamento;

public class ListaEncadeadaMedicamento extends ListaEncadeada{

//    private NoMedicamento primeira;
//    private NoMedicamento ultima;
//    private int total;

    public ListaEncadeadaMedicamento() {
        super(0);
    }
    
    public void adicionaComeco (Medicamento elemento) {
        if (this.getTotal() == 0) {
            NoMedicamento nova = new NoMedicamento(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            NoMedicamento nova =  new NoMedicamento((NoMedicamento) this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.setTotal(getTotal()+1);
    }
    
    public void adiciona (Medicamento elemento) {
        if (this.getTotal()==0) {
            this.adicionaComeco(elemento);
        } else {
            NoMedicamento nova = new NoMedicamento(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.setTotal(getTotal()+1);
        }
    }
    
    public NoMedicamento pegaNo (int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe.");
        }
        NoMedicamento atual = (NoMedicamento) primeira;
        for (int i = 0; i < posicao; i++) {
            atual = (NoMedicamento) atual.getProxima();
        }
        return atual;
    }
    
    public void adiciona (int posicao, Medicamento elemento) {
        if (posicao == 0) {
            this.adicionaComeco(elemento);
        } else if (posicao == this.getTotal()){
            this.adiciona(elemento);
        } else {
            NoMedicamento anterior = this.pegaNo(posicao-1);
            NoMedicamento proxima = (NoMedicamento) anterior.getProxima();
            NoMedicamento nova = new NoMedicamento((NoMedicamento) anterior.getProxima(), elemento);
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
            NoMedicamento penultima = (NoMedicamento) this.ultima.getAnterior();
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
            NoMedicamento anterior = this.pegaNo(posicao - 1);
            NoMedicamento atual = (NoMedicamento) anterior.getProxima();
            NoMedicamento proxima =  (NoMedicamento) atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.setTotal(getTotal()-1);
        }
    }
    
    public Medicamento pega (int posicao) {
        return this.pegaNo(posicao).getElemento();
    }
    
    public boolean contem (int codigo) {
        NoMedicamento atual = (NoMedicamento) this.primeira;
        while (atual != null) {
            if (atual.getElemento().getRegistroMS()==codigo) {
                return true;
            }
            atual = (NoMedicamento) atual.getProxima();
        }
        return false;
    }
    
    public NoMedicamento buscaNome (String nome) {
        if (this.getTotal() == 0) {
            return null;
        }
        NoMedicamento atual = (NoMedicamento) this.primeira;
        while (atual != null) {
            if (atual.getElemento().getNome().equals(nome)) {
                return atual;
            }
            atual = (NoMedicamento) atual.getProxima();
        }
        return null;
    }
    
    public NoMedicamento buscaCodigo (int codigo) {
        if (this.getTotal() == 0) {
            return null;
        }
        NoMedicamento atual = (NoMedicamento) this.primeira;
        while (atual != null) {
            if (atual.getElemento().getRegistroMS()==codigo) {
                return atual;
            }
            atual = (NoMedicamento) atual.getProxima();
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
            NoMedicamento atual = (NoMedicamento) anterior.getProxima();
            NoMedicamento proxima =  (NoMedicamento) atual.getProxima();
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            this.setTotal(getTotal()-1);
        }
    }
}
