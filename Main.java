
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws SQLException {
        PessoasVacinadas teste = new PessoasVacinadas();
        teste.setNome("Armando");
        teste.setData("07/08/09");
        teste.setEndereco("Rua da ponte");
        teste.setIdade(19);
        teste.setProfissao(true);
        teste.inserir();

    }
}
