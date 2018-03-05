package clases;

import java.io.Serializable;

public class Asignatura implements Serializable{
    private String is_asignatura;
    private String nombre_asignatura;
    private String cuatrimestre_asignatura;

    public String getIs_asignatura() {
        return is_asignatura;
    }

    public void setIs_asignatura(String is_asignatura) {
        this.is_asignatura = is_asignatura;
    }

    public String getNombre_asignatura() {
        return nombre_asignatura;
    }

    public void setNombre_asignatura(String nombre_asignatura) {
        this.nombre_asignatura = nombre_asignatura;
    }

    public String getCuatrimestre_asignatura() {
        return cuatrimestre_asignatura;
    }

    public void setCuatrimestre_asignatura(String cuatrimestre_asignatura) {
        this.cuatrimestre_asignatura = cuatrimestre_asignatura;
    }

    public Asignatura(String is_asignatura, String nombre_asignatura, String cuatrimestre_asignatura) {
        this.is_asignatura = is_asignatura;
        this.nombre_asignatura = nombre_asignatura;
        this.cuatrimestre_asignatura = cuatrimestre_asignatura;
    }

    public Asignatura() {
    }
    
}
