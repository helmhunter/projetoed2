package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelBeans.Usuario;
import modelConection.ConexaoBD;

public class DaoUsuario {

    ConexaoBD conex = new ConexaoBD();
    Usuario mod = new Usuario();
    
    public void excluir (Usuario aux) {
        conex.conectar();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where id=?");
            pst.setInt(1, aux.getId());
            pst.execute();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Falha ao criar tabela: "+ex.getMessage());
        }
        
        conex.desconectar();
    }
    
    public void alterar (Usuario aux) {
        conex.conectar();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuarios set usuario=?, senha=?, tipo=? where id=?");
            pst.setString(2, aux.getUsuario());
            pst.setString(3, aux.getSenha());
            pst.setString(4, aux.getTipo());
            pst.setInt(1,aux.getId());
            pst.execute();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Falha ao criar tabela: "+ex.getMessage());
        }
        
        conex.desconectar();
    }
    
    public void criarTabela () {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("CREATE TABLE public.usuarios\n" +
                                                                "(\n" +
                                                                "    id serial NOT NULL,\n" +
                                                                "    usuario character varying(50) NOT NULL,\n" +
                                                                "    senha character varying(50) NOT NULL,\n" +
                                                                "    tipo character varying(50) NOT NULL,\n" +
                                                                "    PRIMARY KEY (id)\n" +
                                                                ")\n" +
                                                                "WITH (\n" +
                                                                "    OIDS = FALSE\n" +
                                                                ");\n" +
                                                                "\n" +
                                                                "ALTER TABLE public.usuarios\n" +
                                                                "    OWNER to postgres;");
            pst.execute();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Falha ao criar tabela: "+ex.getMessage());
        }        
        conex.desconectar();
    }
    
    public void salvar (Usuario mod) {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicamentos(usuario,senha,tip) values(?,?,?)");
            pst.setString(1,mod.getUsuario());
            pst.setString(2,mod.getSenha());
            pst.setString(3, mod.getTipo());
            pst.execute();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Falha ao inserir dados: "+ex.getMessage());
        }
        
        conex.desconectar();
    }
    
}
