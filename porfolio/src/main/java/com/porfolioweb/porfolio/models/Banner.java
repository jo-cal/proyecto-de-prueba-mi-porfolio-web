
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
public class Banner {
    
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE )
private Long idBa;
@Basic
private String imagenBa;

    public Banner() {
    }

    public Banner(Long idBa, String imagenBa) {
        this.idBa = idBa;
        this.imagenBa = imagenBa;
    }

  
}
