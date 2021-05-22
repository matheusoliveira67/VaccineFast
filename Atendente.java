import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Atendente {
    private String nome;
    private String senha;
    private int id;
    
    
    public Atendente (){   
    }
            
    public Atendente (String nome, String senha, int id){
        this.nome = nome;
        this.senha = senha;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void listar() throws SQLException {
        String sql = "SELECT * FROM tb_administrador";
        ConecctionFactory factory = new ConecctionFactory();
        try (Connection d = factory.ADM()) {
            PreparedStatement pst = d.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                String s = String.format("Id: %d\nNome: %s\n", id, nome, senha);
                JOptionPane.showMessageDialog(null, s);

            }
        }
    }
}
