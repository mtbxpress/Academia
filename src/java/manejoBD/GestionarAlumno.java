package manejoBD;

import java.sql.Connection;
import conexion.ConexionMysql;
//import com.mysql.jdbc.PreparedStatement;
import java.sql.PreparedStatement;
import clases.Alumno;
        
//import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import GeneradorPassword.GeneradorPassword;
import java.math.BigInteger;

import java.security.MessageDigest;
import email.Email;

public class GestionarAlumno {
    
    public String RegistrarAlumno(Alumno alumno) throws SQLException{
        
        Connection con = null;
        PreparedStatement pstm = null;
        int res = 0;
        try{
            con = ConexionMysql.getConexion();
            String sql = "INSERT INTO alumno VALUES(?,?,?,?,?,?,?,?,MD5(?))";
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//new SimpleDateFormat("dd/MM/yyyy");
            String fecha_registro = sdf.format(new Date());

            pstm = con.prepareStatement(sql);
            pstm.setString(1, alumno.getId_alumno());
            pstm.setString(2, alumno.getNombre_alumno());
            pstm.setString(3, alumno.getApellido1_alumno());
            pstm.setString(4, alumno.getApellido2_alumno());
            pstm.setBoolean(5, alumno.getMatriculado_alumno());//profesor.getMatriculado_profesor()                                
            pstm.setString(6, fecha_registro);
            pstm.setDate(7, null);
            pstm.setString(8, alumno.getEmail_alumno());
                       
            GeneradorPassword gp = new GeneradorPassword();
            String pass = gp.getPassword( GeneradorPassword.MINUSCULAS + GeneradorPassword.MAYUSCULAS + GeneradorPassword.ESPECIALES,10);                        
            pstm.setString(9, pass);
            res = pstm.executeUpdate();            
 //           System.out.println(pass);
/*
        String md5 = null;
        MessageDigest mdd = MessageDigest.getInstance("MD5");
        byte[] digest = mdd.digest();      
        md5 = new BigInteger(1, mdd.digest()).toString(16);
System.out.println("MD5::::: "+md5);*/
        //return md5.equals(orig);

            long unixTime = System.currentTimeMillis() / 1000L;
            
           if(res > 0){ 
                Email correo = new Email();
                correo.setTo(alumno.getEmail_alumno());
                correo.setBody(correo.getBody()+": "+pass );
                correo.execute();
           }
        //    Date currentDate = new Date();
       //     currentDate.getTime() / 1000;

      //      System.out.println("#######################"+unixTime);
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