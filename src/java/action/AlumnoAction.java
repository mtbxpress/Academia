package action;

//import static com.opensymphony.xwork2.Action.SUCCESS;
//import java.sql.Date;
import com.opensymphony.xwork2.ActionSupport;
import clases.Alumno;
import manejoBD.GestionarAlumno;


import com.opensymphony.xwork2.validator.annotations.*;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator ;
//import com.opensymphony.xwork2.validator.annotations.



 @Validation() //IMPORTANTE
public class AlumnoAction extends ActionSupport{

    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private boolean matriculado;
    private String email;

    private Alumno obj_alumno;

    @Override
    public String execute() throws Exception{

        return this.registrar_alumno();
    }    
    public String registrar_alumno(){
        
        this.obj_alumno = new Alumno(dni,nombre,apellido1,apellido2,matriculado,email);
        String res = "";
        try{
            GestionarAlumno gesAlum = new GestionarAlumno();            
            res = gesAlum.RegistrarAlumno(this.obj_alumno);
         //   return "registroCorrecto";
        }
        catch(Exception e){
            e.printStackTrace();
           // return "registroFallido";
        }
        return res; // puede ser registroCorrecto, registroFallido o         
    }
    
   /* public String eliminar_profesor(){
        
        this.obj_profesor = new Profesor(dni,nombre,apellido1,apellido2,matriculado,email);
        String res = "";
        try{
            GestionarProfesor gesProf = new GestionarProfesor();            
            res = gesProf.RegistrarProfesor(this.obj_profesor);
         //   return "registroCorrecto";
        }
        catch(Exception e){
            e.printStackTrace();
           // return "registroFallido";
        }
        return res; // puede ser registroCorrecto, registroFallido o         
    }*/
    //  ----------  Getters y Setters   ----------  
    public Alumno getObj_alumno() {
        return obj_alumno;
    }

    public void setObj_alumnor(Alumno obj_alumno) {
        this.obj_alumno = obj_alumno;
    }
    public String getDni() {
        return dni;
    }
    
    //@RequiredFieldValidator(message = "You must enter a value for data.")
    @RequiredStringValidator(message = "El campo DNI es obligatorio.")
    @StringLengthFieldValidator(minLength="8",maxLength="15", message="El DNI debe contener entre 8 y 15 caracteres")
    public void setDni(String dni) {
        this.dni = dni;
    }
    
 //   @RequiredStringValidator(message = "El nombre del profesor es un campo obligatorio.")
 //   @StringLengthFieldValidator(minLength="4", maxLength="30", message="El nombre debe tener entre 4 y 30 caracteres")
    public String getNombre() {
        return nombre;
    }
    
    @RequiredStringValidator(message = "El nombre del alumno es obligatorio.")
    @StringLengthFieldValidator(minLength="2",maxLength="15", message="El nombre debe contener mentre 2 y 50 caracteres")    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }
    
    @RequiredStringValidator(message = "El primer apellido del alumno es obligatorio.")
    @StringLengthFieldValidator(minLength="2",maxLength="15", message="El primer apellido debe contener entre 2 y 50 caracteres")    
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

  //  @RequiredStringValidator(message = "El segundo apellido del profesor es obligatorio.")
    @StringLengthFieldValidator(minLength="2",maxLength="15", message="El segundo apellido debe contener entre 2 y 50 caracteres")    
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
    
    public String getEmail() {
        return email;
    }
    @EmailValidator(message="La dirección de e-mail no es válida.")
    public void setEmail(String email) {
        this.email = email;
    }

    public Alumno getAlumno() {
        return obj_alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.obj_alumno = alumno;
    }

            

    
}

    

    
