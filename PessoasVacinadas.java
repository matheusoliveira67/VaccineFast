import java.sql.Connection;
import java.sql.PreparedStatement;

public class PessoasVacinadas {
    private String nome;
    private int idade;
    private boolean profissao;
    private String endereco;
    private String data;
    
    public PessoasVacinadas(String nome, int idade, boolean profissao, String endereco, String data) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.endereco = endereco;
        this.data = data;
    }
    
    PessoasVacinadas (){
        
    }
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isProfissao() {
        return profissao;
    }

    public void setProfissao(boolean profissao) {
        this.profissao = profissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
     public void inserir() {
        String sql = "INSERT INTO tb_administrador (nome, idade, profissao, endereco, datavacinacao) VALUES (?,?,?,?,?)";
        ConecctionFactory factory = new ConecctionFactory();
        try (Connection con = factory.ADM()) {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, this.nome);
            pst.setInt(2, this.idade);
            pst.setBoolean(3, this.profissao);
            pst.setString(4, this.endereco);
            pst.setString(5, this.data);
            pst.execute();
        } catch (Exception ex) {
            System.out.println("NÃ£o conseguimos concectar com o banco!");
            ex.printStackTrace();
        }
    }
}
