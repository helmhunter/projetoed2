/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelBeans;

/**
 * 
 * @author Rafael Gonçalves <rafa.engci at gmail.com>
 */
public class No {
    
    protected No proxima;
    protected No anterior;
    
     public void setProxima (No proxima) {
        this.proxima = proxima;
    }
    
    public No getProxima () {
        return this.proxima;
    }
    
    public void setAnterior (No anterior) {
        this.anterior =  anterior;
    }
    
    public No getAnterior () {
        return this.anterior;
    }

}
