
package com.porfolioweb.porfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ProyectoProfesional {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPro;
    private String tituloPro;
    private String descripcionPro;
    private String imagenPro;

    public ProyectoProfesional() {
    }

    public ProyectoProfesional(Long idPro, String tituloPro, String descripcionPro, String imagenPro) {
       this.idPro = idPro;
       this.tituloPro = tituloPro;
       this.descripcionPro = descripcionPro;
        this.imagenPro = imagenPro;
    }
    
}
