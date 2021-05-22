
import java.sql.Connection;
import java.sql.DriverManager;

public class ConecctionFactory {

    private String usuario = "root";
    private String senha = "matheus030103";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_vacina";

    public Connection ADM() {
        try {
             Connection c = DriverManager.getConnection("jdbc:mysql://"+host+":"+porta+"/"+bd+
                           "?user="+usuario+"&password="+senha+"&useTimezone=true&serverTimezone=America/Sao_Paulo");

            return c;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
      
        
        }
}
