
package Danielarroyo.base;

import java.util.Date;
import java.util.List;


public class Congresista {
    //relacion (1 a N)
    private List<Autor> autorias;
    //Atributos
    protected String congresistaId;
    protected String nombre;
    protected String primerApellido;
    protected String institucionAfiliada;
    protected String email;
    protected String telefono;
    protected String movil;
    protected Date fechaRegistro;
    protected boolean esMiembroComite;
    protected boolean esOrganizador;
    //constructor
    public Congresista(String congresistaId, String nombre, String primerApellido, 
                      String institucionAfiliada, String email, String telefono, 
                      String movil, Date fechaRegistro, boolean esMiembroComite, 
                      boolean esOrganizador) {
        this.congresistaId = congresistaId;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.institucionAfiliada = institucionAfiliada;
        this.email = email;
        this.telefono = telefono;
        this.movil = movil;
        this.fechaRegistro = fechaRegistro;
        this.esMiembroComite = esMiembroComite;
        this.esOrganizador = esOrganizador;
    }
    
    
}
    

