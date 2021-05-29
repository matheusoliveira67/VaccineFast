import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Administrador {
     private int id;
    private String nome;
    private String senha;
    private String cargo;
    
    
    public Administrador (){
         
    }
    
    
    public Administrador (String nome, String senha, String cargo){
     this.nome=nome;
     this.senha=senha;  
     this.cargo = cargo;
    }
    
    public Administrador (int id, String nome, String senha, String cargo) {
        this(nome,senha, cargo);
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
   
    
}
