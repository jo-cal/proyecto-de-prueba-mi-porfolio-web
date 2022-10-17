
package com.porfolioweb.porfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HabilidadesDurasYBlandas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHabi;
    private String tituloHabi;
    private String imagenHabi;
    private int porcentajeHabi;
    private String porcientoHabi;

    public HabilidadesDurasYBlandas() {
    }

    public HabilidadesDurasYBlandas(Long idHabi, String tituloHabi, String imagenHabi, int porcentajeHabi, String porcientoHabi) {
        this.idHabi = idHabi;
        this.tituloHabi = tituloHabi;
        this.imagenHabi = imagenHabi;
        this.porcentajeHabi = porcentajeHabi;
        this.porcientoHabi = porcientoHabi;
    }


    
    
    
}
