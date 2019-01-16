package modelBeans;

import java.text.SimpleDateFormat;

public class Venda {

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getRegistroMS() {
        return registroMS;
    }

    public void setRegistroMS(int registroMS) {
        this.registroMS = registroMS;
    }

    private String data;
    private int codigo;
    private long cpf;
    private int registroMS;

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
}
