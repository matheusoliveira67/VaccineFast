
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AtendenteDAO {

    /*
    CLASSE QUE MANIPULA OBJETOS (CRUD) DO JAVA E REGISTROS MYSQL DO TIPO 'USUARIO'.
     */

    public boolean existe(Atendente atendente) throws Execption {

        String sql = "SELECT * FROM tb_atendente WHERE nome = ? "
                + "AND senha = ?";

        try {
           // conexao = new ConexaoDB ();
            Connection conn = ConexaoDB.obtemConexao();

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, atendente.getNome());
            pst.setString(2, atendente.getSenha());

            // executando o comando 'select'
            // e recebendo o retorno
            ResultSet resultado = pst.executeQuery();

            if (resultado.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    private static class Execption extends Exception {

        public Execption() {
        }
    }

   
}
