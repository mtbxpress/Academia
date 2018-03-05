package action;

//import static com.opensymphony.xwork2.Action.SUCCESS;
//import java.sql.Date;
import com.opensymphony.xwork2.ActionSupport;
import clases.Usuario;
import manejoBD.GestionarUsuario;


import com.opensymphony.xwork2.validator.annotations.*;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator ;
import java.io.PrintWriter;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;



/*
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
*/
//import com.opensymphony.xwork2.validator.annotations.



 @Validation() //IMPORTANTE
public class UsuarioAction extends ActionSupport implements SessionAware{

    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private boolean matriculado;
    private String email;
    
    private Map<String, Object> sesion;

    private Usuario obj_usuario;

    @Override
    public String execute() throws Exception{
        return "success";
    //    return this.registrar_alumno();
    }    
    public String registrar_alumno(){
            //1 admin, 2 profesor, 3 alumno
        this.obj_usuario = new Usuario(dni,3,nombre,apellido1,apellido2,email,matriculado);
        String res = "";
        try{
            GestionarUsuario gesUser = new GestionarUsuario();            
            res = gesUser.RegistrarUsuario(this.obj_usuario);
         //   return "registroCorrecto";
        }
        catch(Exception e){
            e.printStackTrace();
           // return "registroFallido";
        }
 //       System.out.println("############"+res);
        if(res.equals("registroCorrecto")) { sesion.put("registro", "correcto"); }
        return res; // puede ser registroCorrecto, registroFallido o         
    }
    public String registrar_profesor(){
            //1 admin, 2 profesor, 3 alumno
        this.obj_usuario = new Usuario(dni,2,nombre,apellido1,apellido2,email,matriculado);
        String res = "";
        try{
            GestionarUsuario gesUser = new GestionarUsuario();            
            res = gesUser.RegistrarUsuario(this.obj_usuario);
         //   return "registroCorrecto";
        }
        catch(Exception e){
            e.printStackTrace();
           // return "registroFallido";
        }
        return res; // puede ser registroCorrecto, registroFallido o         
    } 
    public String registrar_admin(){
            //1 admin, 2 profesor, 3 alumno
        this.obj_usuario = new Usuario(dni,1,nombre,apellido1,apellido2,email,matriculado);
        String res = "";
        try{
            GestionarUsuario gesUser = new GestionarUsuario();            
            res = gesUser.RegistrarUsuario(this.obj_usuario);
         //   return "registroCorrecto";
        }
        catch(Exception e){
            e.printStackTrace();
           // return "registroFallido";
        }
        return res; // puede ser registroCorrecto, registroFallido o         
    }     

    //  ----------  Getters y Setters   ----------  
    public Usuario getObj_usuario() {
        return obj_usuario;
    }

    public void setObj_usuario(Usuario obj_usuario) {
        this.obj_usuario = obj_usuario;
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

    public boolean isMatriculado_usuario() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
    
    public String getEmail() {
        return email;
    }
    @RequiredStringValidator(message = "El email del alumno es obligatorio.")    
    @EmailValidator(message="La dirección de e-mail no es válida.")
    public void setEmail(String email) {
        this.email = email;
    }         

     @Override
    public void setSession(Map<String, Object> map) {
        sesion = map;
    }

    public Map<String, Object> getSession() {
        return sesion;
    }
    
}

    

    
