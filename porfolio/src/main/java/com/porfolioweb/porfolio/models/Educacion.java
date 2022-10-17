
package com.porfolioweb.porfolio.models;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    private Long idEdu;
    @Basic
    private String tituloEdu;
    private int fechaEdu;
    private String descripcionEdu;
    private String imagenEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, int fechaEdu, String descripcionEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descripcionEdu = descripcionEdu;
        this.imagenEdu = imagenEdu;
    }
      
}
