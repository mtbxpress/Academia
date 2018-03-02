package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {
    public static Connection getConexion() throws SQLException{
        Connection con = null;
        try{
       //     String url = "jdbc:mysql://" + host + ":" + port + "/" + db + "?user=" + user + "&password=" + pass + "&useSSL=false";

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/academia?useSSL=false";
            String usr = "root";
            String pass = "root";
            
            con = DriverManager.getConnection(url, usr, pass);
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR: >> EL driver jdbc no esta instalado.");
        }
        catch(SQLException e){
            System.out.println("ERROR: >> Error de conexción en la BD.");
        }
        return con;
    }
    
}
