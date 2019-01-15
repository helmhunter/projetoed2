package modelBeans;

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

    private long data;
    private int codigo;
    private long cpf;
    private int registroMS;

    /**
     * @return the data
     */
    public long getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(long data) {
        this.data = data;
    }
    
}
