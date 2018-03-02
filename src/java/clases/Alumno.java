package clases;

//import static com.opensymphony.xwork2.Action.SUCCESS;
//import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;
import java.util.Date;

public class Alumno implements Serializable{

    private String id_alumno;
    private String nombre_alumno;
    private String apellido1_alumno;
    private String apellido2_alumno;
    private boolean matriculado_alumno;
    private Date fecha_alta_alumno;
    private Date fecha_baja_alumno;
    private String email_alumno;

    //Constructor vacio
    public Alumno(){ super(); }    
    
    public Alumno(String id_alumno, String nombre_alumno, String apellido1_alumno, String apellido2_alumno, boolean matriculado_alumno, String email_alumno) {
        super();
        this.id_alumno = id_alumno;
        this.nombre_alumno = nombre_alumno;
        this.apellido1_alumno = apellido1_alumno;
        this.apellido2_alumno = apellido2_alumno;
        this.matriculado_alumno = matriculado_alumno;
        this.fecha_alta_alumno = new Date();
        this.fecha_baja_alumno = null;
        this.email_alumno = email_alumno;
    }
    
    // Getters y Setters

    public String getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public String getApellido1_alumno() {
        return apellido1_alumno;
    }

    public void setApellido1_alumno(String apellido1_alumno) {
        this.apellido1_alumno = apellido1_alumno;
    }

    public String getApellido2_alumno() {
        return apellido2_alumno;
    }

    public void setApellido2_alumno(String apellido2_alumno) {
        this.apellido2_alumno = apellido2_alumno;
    }

    public boolean getMatriculado_alumno() {
        return matriculado_alumno;
    }

    public void setMatriculado_alumno(boolean matriculado_alumno) {
        this.matriculado_alumno = matriculado_alumno;
    }

    public Date getFecha_alta_alumno() {
        return fecha_alta_alumno;
    }

    public void setFecha_alta_alumno(Date fecha_alta_alumno) {
        this.fecha_alta_alumno = fecha_alta_alumno;
    }

    public Date getFecha_baja_alumno() {
        return fecha_baja_alumno;
    }

    public void setFecha_baja_alumno(Date fecha_baja_alumno) {
        this.fecha_baja_alumno = fecha_baja_alumno;
    }

    public String getEmail_alumno() {
        return email_alumno;
    }

    public void setEmail_alumno(String email_alumno) {
        this.email_alumno = email_alumno;
    }

            

    
}

    

    
