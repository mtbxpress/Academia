package action;

import email.Email;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.*;
import conexion.ConexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import manejoBD.Log;
import org.apache.struts2.interceptor.SessionAware;

@Validation()
public class RecuperarPassword extends ActionSupport implements SessionAware{

    private String emailRP;
    private Map<String, Object> sesion;

    public RecuperarPassword() {
        //   this.emailRP = emailRP; 
    }

    public String getEmailRP() {
        return emailRP;
    }
     @Override
    public void setSession(Map<String, Object> map) {
        sesion = map;
    }

    public Map<String, Object> getSession() {
        return sesion;
    }
    @RequiredStringValidator(message = "El email del alumno es obligatorio.")    
    @EmailValidator(message="La dirección de e-mail no es válida.")    
    public void setEmailRP(String emailRP) {
        this.emailRP = emailRP;
    }

    @Override
    public String execute() throws Exception {
            Connection con = null;     
            con = ConexionMysql.getConexion();
            Statement s = con.createStatement();
            String pass = "";
        try {
            String sql = "SELECT * FROM usuarios WHERE email_usuario = '"+this.emailRP+"'";
     //       System.out.println("passsssssssssssssssssssssssss"+sql);
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                pass = rs.getString("password");
     //           System.out.println(rs.getString("password"));
                
            }

            if(pass !="" && pass!=null){ 
                sesion.put("recuperarPass", "correcto");
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//new SimpleDateFormat("dd/MM/yyyy");
                String fecha = sdf.format(new Date());                
                Log log = new Log();
                log.modificar_log("Envio pass >> Se ha enviado un correo para recordar la contraseña a "+this.emailRP+"\t"+fecha); 
                
                Email correo = new Email();
                correo.setTo(this.emailRP);
                correo.setBody("Desde Academia JJDELROM le enviamos este correo recordando su contraseña.\n Su contraseña es: "+pass);
                correo.execute();                
            }
            else { sesion.put("recuperarPass", "incorrecto"); }
        }
        catch(Exception e){            
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
             return "success";
        }        
       
        //    return this.registrar_alumno();
    }
}
