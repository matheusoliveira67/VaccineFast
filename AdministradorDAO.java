
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NEW COLOR ®
 */
public class AdministradorDAO {
    public boolean existeAdm (Administrador administrador) throws Execption {

        String sql = "SELECT * FROM tb_administrador WHERE nome = ? "
                + "AND senha = ?" ;

        try {
           // conexao = new ConexaoDB ();
            Connection conn = ConexaoDB.obtemConexao();

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, administrador.getNome());
            pst.setString(2, administrador.getSenha());
            
            

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
