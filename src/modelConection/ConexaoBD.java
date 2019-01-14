package modelConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {

    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postegresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5433/projetoed2";
    private String usuario = "postgres";
    private String senha = "2Soua123";
    public Connection con;
    
    public void conectar () {
        try {
            System.setProperty("jdbc.Drivers", driver);
            con=DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados: "+ex.getMessage());
        }
    }
    
    public void executasql (String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na execução do SQL: "+ex.getMessage());
        }
    }
    
    public void desconectar () {
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Conexão encerrada.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encerrar conexão: "+ex.getMessage());
        }
    }
}
