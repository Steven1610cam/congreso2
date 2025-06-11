
package Danielarroyo.base;

import java.util.List;


public class ComiteSeleccion {
    //relacion (1 a N)
    private List<MiembroComite> miembros;
    //atributos
    private String comiteId;
    private String nombreComite;
    private String descripcion;
    //constructor
    public ComiteSeleccion(String comiteId, String nombreComite, String descripcion) {
        this.comiteId = comiteId;
        this.nombreComite = nombreComite;
        this.descripcion = descripcion;
    }
    
    
}