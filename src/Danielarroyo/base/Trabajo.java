
package Danielarroyo.base;

import java.util.Date;
import java.util.List;


public class Trabajo {
    //relacion (1 a N)
    private List<Autor> autores;
    //atributos
    private String trabajoId;
    private String titulo;
    private String resumen;
    private Date fechaEnvio;
    private String estado;
    private String palabrasClave;
    //constructor
    public Trabajo(String trabajoId, String titulo, String resumen, 
                  Date fechaEnvio, String estado, String palabrasClave) {
        this.trabajoId = trabajoId;
        this.titulo = titulo;
        this.resumen = resumen;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.palabrasClave = palabrasClave;
    }
    
    
}
    

