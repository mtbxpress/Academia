package manejoBD;
//import java.io;

import com.opensymphony.xwork2.*;
import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.naming.*;
import javax.sql.DataSource;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class PoolAction extends ActionSupport implements SessionAware {

    private String usuario;
    private String contrasena;
    private DataSource dataSource;
    private Connection conn;
    private Map<String, Object> sesion;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        sesion = map;
    }

    public Map<String, Object> getSession() {
        return sesion;
    }

    @Override
    public String execute() throws Exception {
        boolean acceso = false;
        int id_rol = 0; String nombre_usuario = "";
        Context ctx = new InitialContext();
        if (ctx == null) {
            throw new Exception("Error en context");
        }
        /*File miDir = new File (".");
        System.out.println ("Directorio actual: " + miDir.getCanonicalPath());
        */
        dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/academia");
        conn = dataSource.getConnection();
        Statement s = conn.createStatement();
        String query = "select * from usuarios where id_usuario='" + usuario + "' and password='" + contrasena + "'";

        ResultSet rs = s.executeQuery(query);
        if (rs.next()) {
            id_rol = rs.getInt("fk_id_rol");
            nombre_usuario = rs.getString("nombre_usuario");
            acceso = true;
            System.out.println("id_rol:"+nombre_usuario);
        }
        rs.close();
        s.close();
        conn.close();

        if (acceso) {          
            sesion.put("id_usuario", usuario);
            sesion.put("contrasena", contrasena);
            sesion.put("id_rol", id_rol); 
            sesion.put("nombre_usuario",nombre_usuario);
            //sesion.put("registro", "");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//new SimpleDateFormat("dd/MM/yyyy");
            String fecha = sdf.format(new java.util.Date());                
            Log log = new Log();
            log.modificar_log("Loggin >> El usuario "+nombre_usuario+" ("+usuario+") se ha logado "+fecha);             

            return SUCCESS;
        } else {
            usuario = "";
            contrasena = "";
            return INPUT;
        }
    }
}
