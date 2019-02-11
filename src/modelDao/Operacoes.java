package modelDao;

import java.util.LinkedList;
import modelBeans.Cliente;
import modelBeans.Medicamento;
import modelBeans.Venda;

public class Operacoes {
    
    public Medicamento buscaRegistroMS (LinkedList<Medicamento> lista, int registro) {
        for (int i=0;i<lista.size(); i++) {
            if (lista.get(i).getRegistroMS()==registro) {
                return lista.get(i);
            }
        }
        return null;
    }
    
    public Cliente buscaCpf (LinkedList<Cliente> lista, long cpf) {
        for (int i=0;i<lista.size(); i++) {
            if (lista.get(i).getCpf()==cpf) {
                return lista.get(i);
            }
        }
        return null;
    }
    
    public boolean contemVenda (LinkedList<Venda> lista, int codigo) {
        for (int i=0;i<lista.size(); i++) {
            if (lista.get(i).getCodigo()==codigo) {
                return true;
            }
        }
        return false;
    }
    
}
