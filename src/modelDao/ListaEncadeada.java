/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelDao;

import modelBeans.No;

/**
 * 
 * @author Rafael Gonçalves <rafa.engci at gmail.com>
 */
public class ListaEncadeada {
    
    protected No primeira;
    protected No ultima;
    private int total;

    public ListaEncadeada(int total) {
        this.total = total;
    }
    
    public boolean posicaoOcupada (int posicao) {
        return posicao >= 0 && posicao < this.getTotal();
    }
    
    public int tamanho () {
        return this.getTotal();
    }
    
    public void  removeComeco () {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException ("Posicão não existe.");
        }
        this.primeira = this.primeira.getProxima();
        this.setTotal(getTotal()-1);
        if (this.getTotal() == 0){
            this.ultima = null;
        }
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}