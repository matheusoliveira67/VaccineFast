import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {

    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_vacina";
    private static String usuario = "root";
    private static String senha = "matheus030103";

    public static Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + db, // endereço url 
                    usuario,
                    senha
            );

            return c;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }


    }

