package manejoBD;

import GeneradorPassword.GeneradorPassword;
import clases.Asignatura;
import com.opensymphony.xwork2.ActionContext;
import conexion.ConexionMysql;
import email.Email;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServlet;

public class GestionarAsignatura {


    public String registrarAsignatura(Asignatura asignatura) throws SQLException{

        Connection con = null;
        PreparedStatement pstm = null;
        int res = 0;// int id_rol = 0;
        String fecha_registro = "", id_asignatura = ""; 
        
        try{
       //     String actionName = ActionContext.getContext().getName();           
            con = ConexionMysql.getConexion();
        //    String sql = "INSERT INTO usuarios VALUES(?,?,?,?,?,?,?,?,MD5(?),?)";
            String sql = "INSERT INTO asignatura VALUES(?,?,?,?,?)";
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//new SimpleDateFormat("dd/MM/yyyy");
            fecha_registro = sdf.format(new Date());

            pstm = con.prepareStatement(sql);
            pstm.setString(1, asignatura.getId_asignatura());//  id_usuario = usuario.getId_usuario();
            pstm.setString(2, asignatura.getNombre_asignatura()); id_asignatura = asignatura.getId_asignatura();
            pstm.setString(3, asignatura.getCuatrimestre_asignatura());
            pstm.setString(4, asignatura.getDescripcion_asignatura());
            pstm.setString(5, fecha_registro);
                       

            res = pstm.executeUpdate();            

     //       long unixTime = System.currentTimeMillis() / 1000L;
            System.out.println("RESULTADO insercion BD (GestionarUsuarios): "+res);
           if(res > 0){ 

                String mensaje = "Nueva asignatura >> "+id_asignatura+" >> "+fecha_registro;

                String email_enviado = "";
                try{
                    Log log = new Log();
                    log.modificar_log(mensaje);
                                       
                }catch(Exception e){
                    Log log = new Log();
                    log.modificar_log("ERROR >> No se ha registrado la nueva asignatura");                    
                    e.printStackTrace();
                }

           }
 
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

}
