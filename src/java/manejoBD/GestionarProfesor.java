package manejoBD;
import java.sql.Connection;
import conexion.ConexionMysql;
//import com.mysql.jdbc.PreparedStatement;
import java.sql.PreparedStatement;
import clases.Profesor;
        
//import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
public class GestionarProfesor {
    
    public String RegistrarProfesor(Profesor profesor) throws SQLException{
        
        Connection con = null;
        PreparedStatement pstm = null;
        int res = 0;
        try{
            con = ConexionMysql.getConexion();
            String sql = "INSERT INTO profesor VALUES(?,?,?,?,?,?,?,?)";
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//new SimpleDateFormat("dd/MM/yyyy");
            String fecha_registro = sdf.format(new Date());

            pstm = con.prepareStatement(sql);
            pstm.setString(1, profesor.getId_profesor());
            pstm.setString(2, profesor.getNombre_profesor());
            pstm.setString(3, profesor.getApellido1_profesor());
            pstm.setString(4, profesor.getApellido2_profesor());
            pstm.setBoolean(5, profesor.getMatriculado_profesor());//profesor.getMatriculado_profesor()                                
            pstm.setString(6, fecha_registro);
            pstm.setDate(7, null);
            pstm.setString(8, profesor.getEmail_profesor());
            res = pstm.executeUpdate();
            
            long unixTime = System.currentTimeMillis() / 1000L;
            
        //    Date currentDate = new Date();
       //     currentDate.getTime() / 1000;

//System.out.println("#######################"+unixTime);
      //      Statement statement = con.createStatement();
      //      String sq = "INSERT INTO profesor VALUES('11','11','11','11','11','11','11','11')";
      //      statement.executeUpdate(sq);   
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(pstm != null){
                    pstm.close();
                }
                if(con != null){
                    con.close();
                }                
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
            if(res > 0){ return "registroCorrecto"; }
            else{        return "registroFallido";  }
    }
}
