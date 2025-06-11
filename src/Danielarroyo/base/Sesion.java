
package Danielarroyo.base;

import java.util.Date;


public class Sesion {
    //atributos
    private String sesionId;
    private String nombreSesion;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private String estado;
    //contructor
    public Sesion(String sesionId, String nombreSesion, Date fechaHoraInicio, 
                 Date fechaHoraFin, String estado) {
        this.sesionId = sesionId;
        this.nombreSesion = nombreSesion;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.estado = estado;
    }
    
}