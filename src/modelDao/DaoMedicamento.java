package modelDao;

import modelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelBeans.Medicamento;

public class DaoMedicamento {

    ConexaoBD conex = new ConexaoBD();
    Medicamento mod = new Medicamento();
    
    public void excluirTabela () {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("drop table medicamentos");
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
            PreparedStatement pst = conex.con.prepareStatement("CREATE TABLE public.medicamentos\n" +
                                                                "(\n" +
                                                                "    codigo integer NOT NULL,\n" +
                                                                "    nome character varying(50) NOT NULL,\n" +
                                                                "    fabricante character varying(50) NOT NULL,\n" +
                                                                "    verificador character varying(50) NOT NULL,\n" +
                                                                "    acao character varying(50) NOT NULL,\n" +
                                                                "    tipo character varying(50) NOT NULL,\n" +
                                                                "    qnt integer NOT NULL,\n" +
                                                                "    preco double precision NOT NULL,\n" +
                                                                "    PRIMARY KEY (codigo)\n" +
                                                                ")\n" +
                                                                "WITH (\n" +
                                                                "    OIDS = FALSE\n" +
                                                                ");\n" +
                                                                "\n" +
                                                                "ALTER TABLE public.medicamentos\n" +
                                                                "    OWNER to postgres;");
            pst.execute();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Falha ao criar tabela: "+ex.getMessage());
        }        
        conex.desconectar();
    }
    
    public void salvar (Medicamento mod) {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicamentos(nome,fabricante,verificador,acao,tipo,qnt,codigo,preco) values(?,?,?,?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getFabricante());
            pst.setString(3, mod.getVerificador());
            pst.setString(4, mod.getAcao());
            pst.setString(5, mod.getTipo());
            pst.setInt(6, mod.getQnt());
            pst.setInt(7, mod.getCodigo());
            pst.setDouble(8, mod.getPreco());
            pst.execute();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Falha ao inserir dados: "+ex.getMessage());
        }
        
        conex.desconectar();
    }
    
}
