package clases;

//import static com.opensymphony.xwork2.Action.SUCCESS;
//import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;
import java.util.Date;
public class Profesor implements Serializable{

    private String id_profesor;
    private String nombre_profesor;
    private String apellido1_profesor;
    private String apellido2_profesor;
    private boolean matriculado_profesor;
    private Date fecha_alta_profesor;
    private Date fecha_baja_profesor;
    private String email_profesor;

    //Constructor vacio
    public Profesor(){ super(); }    
    
    public Profesor(String id_profesor, String nombre_profesor, String apellido1_profesor, String apellido2_profesor, boolean matriculado_profesor, String email_profesor) {
        super();
        this.id_profesor = id_profesor;
        this.nombre_profesor = nombre_profesor;
        this.apellido1_profesor = apellido1_profesor;
        this.apellido2_profesor = apellido2_profesor;
        this.matriculado_profesor = matriculado_profesor;
        this.fecha_alta_profesor = new Date();
        this.fecha_baja_profesor = null;
        this.email_profesor = email_profesor;
    }
    
    // Getters y Setters
    public String getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(String id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public String getApellido1_profesor() {
        return apellido1_profesor;
    }

    public void setApellido1_profesor(String apellido1_profesor) {
        this.apellido1_profesor = apellido1_profesor;
    }

    public String getApellido2_profesor() {
        return apellido2_profesor;
    }

    public void setApellido2_profesor(String apellido2_profesor) {
        this.apellido2_profesor = apellido2_profesor;
    }

    public boolean getMatriculado_profesor() {
        return matriculado_profesor;
    }

    public void setMatriculado_profesor(boolean matriculado_profesor) {
        this.matriculado_profesor = matriculado_profesor;
    }

    public Date getFecha_alta_profesor() {
        return fecha_alta_profesor;
    }

    public void setFecha_alta_profesor(Date fecha_alta_profesor) {
        this.fecha_alta_profesor = fecha_alta_profesor;
    }

    public Date getFecha_baja_profesor() {
        return fecha_baja_profesor;
    }

    public void setFecha_baja_profesor(Date fecha_baja_profesor) {
        this.fecha_baja_profesor = fecha_baja_profesor;
    }

    public String getEmail_profesor() {
        return email_profesor;
    }

    public void setEmail_profesor(String email_profesor) {
        this.email_profesor = email_profesor;
    }
            

    
}

    

    
