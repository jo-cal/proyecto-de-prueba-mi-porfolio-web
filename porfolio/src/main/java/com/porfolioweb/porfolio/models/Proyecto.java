
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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    private Long idPro;
    @Basic
    private String tituloPro;
    private String descripcionPro;
    private String imagenPro;

    public Proyecto() {
    }

    public Proyecto(Long idPro, String tituloPro, String descripcionPro, String imagenPro) {
        this.idPro = idPro;
        this.tituloPro = tituloPro;
        this.descripcionPro = descripcionPro;
        this.imagenPro = imagenPro;
    }
    
    

    
}
