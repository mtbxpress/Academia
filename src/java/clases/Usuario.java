package clases;
//import static com.opensymphony.xwork2.Action.SUCCESS;
//import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable{

    private String  id_usuario;
    private int     fk_id_rol;
    private String  nombre_usuario;
    private String  apellido1_usuario;
    private String  apellido2_usuario;
    private Date    fecha_alta_usuario;
    private Date    fecha_baja_usuario;
    private String  email_usuario;
    private String  password = "";
    private boolean matriculado_usuario;

    //Constructor vacio
    public Usuario(){ super(); }      

    public Usuario(String id_usuario, int fk_id_rol, String nombre_usuario, String apellido1_usuario, String apellido2_usuario, String email_usuario, boolean matriculado_usuario) {
        this.id_usuario = id_usuario;
        this.fk_id_rol = fk_id_rol;
        this.nombre_usuario = nombre_usuario;
        this.apellido1_usuario = apellido1_usuario;
        this.apellido2_usuario = apellido2_usuario;
        this.fecha_alta_usuario = new Date();
        this.fecha_baja_usuario = null;
        this.email_usuario = email_usuario;
        this.matriculado_usuario = matriculado_usuario;
    }

    // Getters y Setters

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getFk_id_rol() {
        return fk_id_rol;
    }

    public void setFk_id_rol(int fk_id_rol) {
        this.fk_id_rol = fk_id_rol;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido1_usuario() {
        return apellido1_usuario;
    }

    public void setApellido1_usuario(String apellido1_usuario) {
        this.apellido1_usuario = apellido1_usuario;
    }

    public String getApellido2_usuario() {
        return apellido2_usuario;
    }

    public void setApellido2_usuario(String apellido2_usuario) {
        this.apellido2_usuario = apellido2_usuario;
    }

    public Date getFecha_alta_usuario() {
        return fecha_alta_usuario;
    }

    public void setFecha_alta_usuario(Date fecha_alta_usuario) {
        this.fecha_alta_usuario = fecha_alta_usuario;
    }

    public Date getFecha_baja_usuario() {
        return fecha_baja_usuario;
    }

    public void setFecha_baja_usuario(Date fecha_baja_usuario) {
        this.fecha_baja_usuario = fecha_baja_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isMatriculado_usuario() {
        return matriculado_usuario;
    }

    public void setMatriculado_usuario(boolean matriculado_usuario) {
        this.matriculado_usuario = matriculado_usuario;
    }

            

    
}

    

    
