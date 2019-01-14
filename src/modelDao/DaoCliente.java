package modelDao;

import modelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelBeans.Cliente;

public class DaoCliente {

    ConexaoBD conex = new ConexaoBD();
    Cliente mod = new Cliente();
    
    public void excluirTabela () {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("drop table clientes");
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Tabela excluida.");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Falha ao excluir tabela: "+ex.getMessage());
        }        
        conex.desconectar();
    }
    
    public void criarTabela () {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("CREATE TABLE public.clientes\n" +
                                                                "   (\n" +
                                                                "   cpf bigint NOT NULL,\n" +
                                                                "   nome character varying(50) NOT NULL,\n" +
                                                                "   endereco character varying(50) NOT NULL,\n" +
                                                                "   telefone bigint NOT NULL,\n" +
                                                                "   idade integer NOT NULL,\n" +
                                                                "   PRIMARY KEY (cpf)\n" +
                                                                ")\n" +
                                                                "WITH (\n" +
                                                                "   OIDS = FALSE\n" +
                                                                ");\n" +
                                                                "\n" +
                                                                "ALTER TABLE public.clientes\n" +
                                                                "   OWNER to postgres;");
            pst.execute();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Falha ao criar tabela: "+ex.getMessage());
        }        
        conex.desconectar();
    }
    
    public void salvar (Cliente mod) {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicamentos(nome,cpf,endereco,telefone,idade) values(?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setLong(2,mod.getCpf());
            pst.setString(3, mod.getEndereco());
            pst.setLong(4, mod.getTelefone());
            pst.setInt(5, mod.getIdade());
            pst.execute();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Falha ao inserir dados: "+ex.getMessage());
        }
        
        conex.desconectar();
    }
    
}
