
package Danielarroyo.base;

import java.util.Date;


public class Revision {
    //atributos
    private String revisionId;
    private Date fechaRevision;
    private int puntuacion;
    private String comentarios;
    private String decision;
    
    // Constructor
    public Revision(String revisionId, Date fechaRevision, int puntuacion, String comentarios, String decision) {
        this.revisionId = revisionId;
        this.fechaRevision = fechaRevision;
        this.puntuacion = puntuacion;
        this.comentarios = comentarios;
        this.decision = decision;
    }
    
    
}
