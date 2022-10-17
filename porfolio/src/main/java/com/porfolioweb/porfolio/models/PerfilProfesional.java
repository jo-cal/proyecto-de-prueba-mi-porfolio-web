
package com.porfolioweb.porfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class PerfilProfesional {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPer;
    private String tituloPer;
    private String descripciónPer;
    private String imagenPer;

    public PerfilProfesional() {
    }

    public PerfilProfesional(Long idPer, String tituloPer, String descripciónPer, String imagenPer) {
        this.idPer = idPer;
        this.tituloPer = tituloPer;
        this.descripciónPer = descripciónPer;
        this.imagenPer = imagenPer;
    }
    
    
    
}
