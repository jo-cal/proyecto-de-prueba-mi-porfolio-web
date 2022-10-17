
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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long idExp;
    @Basic
    private String tituloExp;
    private String descripcionExp;
    private String imagenExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, String descripcionExp, String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.descripcionExp = descripcionExp;
        this.imagenExp = imagenExp;
    }
    
    
    
}
