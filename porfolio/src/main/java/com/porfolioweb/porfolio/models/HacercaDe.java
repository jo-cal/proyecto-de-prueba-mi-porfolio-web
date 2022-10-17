
package com.porfolioweb.porfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HacercaDe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHace;
    private String nombreHace;
    private String apellidoHace;
    private String perfiHace;
    private String tituloHace;
    private String descripciónHace;
    private String imagenHace;

    public HacercaDe() {
    }

    public HacercaDe(Long idHace, String nombreHace, String apellidoHace, String perfiHace, String tituloHace, String descripciónHace, String imagenHace) {
        this.idHace = idHace;
        this.nombreHace = nombreHace;
        this.apellidoHace = apellidoHace;
        this.perfiHace = perfiHace;
        this.tituloHace = tituloHace;
        this.descripciónHace = descripciónHace;
        this.imagenHace = imagenHace;
    }



   
  
    
    
    
}
