package manejoBD;

import java.sql.Connection;
import conexion.ConexionMysql;
//import com.mysql.jdbc.PreparedStatement;
import java.sql.PreparedStatement;
import clases.Usuario;
        
//import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import GeneradorPassword.GeneradorPassword;
import com.opensymphony.xwork2.ActionContext;
import java.math.BigInteger;

import java.security.MessageDigest;
import email.Email;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import manejoBD.Log;

import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
import org.apache.struts2.interceptor.SessionAware;

public class GestionarUsuario extends HttpServlet {  
    
  //  private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private Map<String, String> numUsuarios = new HashMap<String, String>();

    public String RegistrarUsuario(Usuario usuario) throws SQLException{

        Connection con = null;
        PreparedStatement pstm = null;
        int res = 0; int id_rol = 0;
        String fecha_registro = "", id_usuario = ""; 
        
        try{
            String actionName = ActionContext.getContext().getName();           
            con = ConexionMysql.getConexion();
        //    String sql = "INSERT INTO usuarios VALUES(?,?,?,?,?,?,?,?,MD5(?),?)";
            String sql = "INSERT INTO usuarios VALUES(?,?,?,?,?,?,?,?,?,?)";
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//new SimpleDateFormat("dd/MM/yyyy");
            fecha_registro = sdf.format(new Date());

            pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario.getId_usuario());  id_usuario = usuario.getId_usuario();
            pstm.setInt(2, usuario.getFk_id_rol()); id_rol = usuario.getFk_id_rol();
            pstm.setString(3, usuario.getNombre_usuario());
            pstm.setString(4, usuario.getApellido1_usuario());
            pstm.setString(5, usuario.getApellido2_usuario());                             
            pstm.setString(6, fecha_registro);
            pstm.setDate(7, null);
            pstm.setString(8, usuario.getEmail_usuario());
                       
            GeneradorPassword gp = new GeneradorPassword();
            String pass = gp.getPassword( GeneradorPassword.MINUSCULAS + GeneradorPassword.MAYUSCULAS + GeneradorPassword.ESPECIALES,10);                        
            pstm.setString(9, pass);
            pstm.setBoolean(10, usuario.isMatriculado_usuario());//profesor.getMatriculado_profesor()              
            res = pstm.executeUpdate();            

            long unixTime = System.currentTimeMillis() / 1000L;
            System.out.println("RESULTADO insercion BD (GestionarUsuarios): "+res);
           if(res > 0){ 

                String mensaje = "Nuevo usuario >> ";
                switch (id_rol) {
                    case 1:
                        mensaje += "Administrador\t";
                        break;
                    case 2:
                        mensaje += "Profesor\t";
                        break;
                    default:
                        mensaje += "Alumno\t";
                        break;
                }
                String email_enviado = "";
                try{
                    
                    mensaje += id_usuario+"\t"+fecha_registro;
                    Log log = new Log();
                    log.modificar_log(mensaje);

                    Email correo = new Email();
                    correo.setTo(usuario.getEmail_usuario());
                    correo.setBody(correo.getBody()+": "+pass );
                    email_enviado = correo.execute();
                                       
                }catch(Exception e){
                    Log log = new Log();
                    log.modificar_log("ERROR >> No se ha enviado la constraseña a "+usuario.getEmail_usuario());                    
                    if(email_enviado.equals("error")){                   
                        Connection con2 = null;
                        con2 = ConexionMysql.getConexion();
                        sql = "DELETE FROM usuarios WHERE id_usuario = ?"; 
                        PreparedStatement pstm2 = null;
                        pstm2 = con.prepareStatement(sql);
                        pstm2.setString(1, usuario.getId_usuario());
                        res = pstm.executeUpdate();
                        if(res > 0){ System.out.println("NO SE HA PODIDO ELIMINAR EL USUARIO."); }                        
                    }
                    e.printStackTrace();
                }

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
  //  HttpSession session = request.getSession();
//    sesion.put("uname", "ocghsoiuok");
            if(res > 0){ return "registroCorrecto";   }
            else{        return "registroFallido";  }
    }

    public String borrarUsuario(String id_usuario) throws SQLException{
        
        Connection con = null;   int res = 0;  
        con = ConexionMysql.getConexion();       
        String sql = "DELETE FROM usuarios WHERE id_usuario = ? ";
        PreparedStatement pstmt = null;
   
        try{
            pstmt = con.prepareStatement(sql); 
            pstmt.setString(1, id_usuario);
            res = pstmt.executeUpdate();             
        }
        catch(Exception e){            
            e.printStackTrace();
        }
        finally{
            try{
                if(con != null){
                    con.close();
                    pstmt.close();
                }              
            }catch(Exception e2){
                e2.printStackTrace();
            }
             
        } 
        if(res > 0){return "success";}
        else{       return "error";}
    }

    public Map<String, String> consultaUsuarios() throws SQLException{

        Connection con = null; int res = 0;    
        con = ConexionMysql.getConexion();
        Statement s = con.createStatement();
        String sql = "SELECT SUM(CASE WHEN fk_id_rol = 1 THEN 1 ELSE 0 END) admin, "
                           +"SUM(CASE WHEN fk_id_rol = 2 THEN 1 ELSE 0 END) profesor,"
                           +"SUM(CASE WHEN fk_id_rol = 3 THEN 1 ELSE 0 END) alumno,"
                           +"SUM(CASE WHEN fecha_alta_usuario >= '2018-01-01 00:00:00' THEN 1 ELSE 0 END) fecha FROM usuarios";
     //   try{    
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                numUsuarios.put("admin", rs.getString("admin"));
                numUsuarios.put("profesor", rs.getString("profesor"));
                numUsuarios.put("alumno", rs.getString("alumno"));
                numUsuarios.put("fecha", rs.getString("fecha"));
    //            System.out.println("ADMINNNNNNNNNNNNNN:"+rs.getInt("admin")+rs.getInt("profesor")+rs.getInt("alumno")+rs.getInt("fecha"));
    //            System.out.println("Alumno"+numUsuarios.get("alumno"));
            }
  /*      }catch(Exception e){            
            e.printStackTrace();
        }
        finally{
            try{
                if(con != null){
                    con.close();
                }              
            }catch(Exception e2){
                e2.printStackTrace();
            }
             
        }*/ 
 //   System.exit(0);
    return numUsuarios;
 //   return "";
}    
    
    
  
}