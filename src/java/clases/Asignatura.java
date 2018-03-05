package clases;

import java.io.Serializable;

public class Asignatura implements Serializable{
    private String id_asignatura;
    private String nombre_asignatura;
    private String cuatrimestre_asignatura;
    private String descripcion_asignatura;

    public String getDescripcion_asignatura() {
        return descripcion_asignatura;
    }

    public void setDescripcion_asignatura(String descripcion_asignatura) {
        this.descripcion_asignatura = descripcion_asignatura;
    }

    public String getId_asignatura() {
        return id_asignatura;
    }

    public Asignatura(String id_asignatura, String nombre_asignatura, String cuatrimestre_asignatura, String descripcion_asignatura) {
        this.id_asignatura = id_asignatura;
        this.nombre_asignatura = nombre_asignatura;
        this.cuatrimestre_asignatura = cuatrimestre_asignatura;
        this.descripcion_asignatura = descripcion_asignatura;
    }

    public void setId_asignatura(String id_asignatura) {
        this.id_asignatura = id_asignatura;
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

    public Asignatura(String id_asignatura, String nombre_asignatura, String cuatrimestre_asignatura) {
        this.id_asignatura = id_asignatura;
        this.nombre_asignatura = nombre_asignatura;
        this.cuatrimestre_asignatura = cuatrimestre_asignatura;
    }

    public Asignatura() {
    }
    
}
