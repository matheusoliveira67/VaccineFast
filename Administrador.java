import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class Administrador {
    private int id;
    private String nome;
    private String senha;
    
    public Administrador (){
         
    }
    
    public Administrador (String nome, String senha){
     this.nome=nome;
     this.senha=senha;  
    }
    
    public Administrador (int id, String nome, String senha) {
        this(nome,senha);
        this.id =id;   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    
     public void inserir() {
        String sql = "INSERT INTO tb_administrador (nome, senha, id) VALUES (?,?,?)";
        ConecctionFactory factory = new ConecctionFactory();
        try (Connection con = factory.ADM()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, this.nome);
            pst.setString(2, this.senha);
            pst.setInt(3, this.id);
            pst.execute();
        } catch (Exception ex) {
            System.out.println("Não conseguimos concectar com o banco!");
            ex.printStackTrace();
        }
    }

    public void atualizar() {
        String sql = "UPDATE tb_administrador SET nome = ?, senha = ?, id = ?";
        ConecctionFactory factory = new ConecctionFactory();
        try (Connection c = factory.ADM()) {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, this.nome);
            pst.setString(2, this.senha);
            pst.setInt(3, id);
            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void apagar() {
        String sql = "DELETE FROM tb_administrador WHERE codigo = ?";
        ConecctionFactory factory = new ConecctionFactory ();
        try (Connection c = factory.ADM()) {
           PreparedStatement pst = c.prepareStatement(sql);
           pst.setInt(1, id);
           pst.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void listar () {
        String sql = "SELECT * FROM tb_administrador";
        ConecctionFactory factory = new ConecctionFactory ();
        try(Connection c = factory.ADM()) {
           PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
              int id = rs.getInt("id");
              String nome = rs.getString("nome");
              String senha = rs.getString("senha");
              String s = String.format("Id: %d\nNome: %s\n", id, nome, senha);
                JOptionPane.showMessageDialog(null, s);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
