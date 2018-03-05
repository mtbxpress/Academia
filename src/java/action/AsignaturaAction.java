package action;

import clases.Asignatura;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import manejoBD.GestionarAsignatura;
import org.apache.struts2.interceptor.SessionAware;

public class AsignaturaAction extends ActionSupport /*implements SessionAware*/{
    
    private String identificador;
    private String nombre;
    private String cuatrimestre;
    private String descripcion;
    
    private Asignatura obj_asignatura;
    
    public String registrar_asignatura(){
            //1 admin, 2 profesor, 3 alumno
        this.obj_asignatura = new Asignatura(identificador,nombre,cuatrimestre,descripcion);
        String res = "";
        try{
            GestionarAsignatura gesAsig = new GestionarAsignatura();            
            res = gesAsig.registrarAsignatura(this.obj_asignatura);
         //   return "registroCorrecto";
        }
        catch(Exception e){
            e.printStackTrace();
           // return "registroFallido";
        }
 //       System.out.println("############"+res);
        if(res.equals("registroCorrecto")) { /*sesion.put("registro", "correcto");*/ }
        return res; // puede ser registroCorrecto, registroFallido o         
    }    
    public String execute() throws Exception{
        return "success";
    //    return this.registrar_alumno();
    }  
    public Asignatura getObj_asignatura() {
        return obj_asignatura;
    }

    public void setObj_asignatura(Asignatura obj_asignatura) {
        this.obj_asignatura = obj_asignatura;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
    
}
