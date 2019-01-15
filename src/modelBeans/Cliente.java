package modelBeans;

public class Cliente {

    public Cliente() {
        this.compras = new Integer[100];
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private Integer[] compras; 
    private String nome;
    private long cpf;
    private String endereco;
    private long telefone;
    private int idade;

    
    public Integer[] getCompras() {
        return compras;
    }

    public void setCompras(Integer[] compras) {
        this.compras = compras;
    }
    
}
