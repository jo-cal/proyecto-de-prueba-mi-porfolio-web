
package com.porfolioweb.porfolio.models;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario implements Serializable  {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false ) //la columna que no sea actualizable. No hace falta que esté, porque en este caso hay un solo usuario
    private Long idUser;
    private String nombreUser;
    private String apellidoUser;
    private String tituloUser;
    private String descripcionUser;
    private String imagenUser;

    public Usuario() {
    }

    public Usuario(Long idUser, String nombreUser, String apellidoUser, String tituloUser, String descripciónUser, String imagenUser) {
        this.idUser = idUser;
        this.nombreUser = nombreUser;
        this.apellidoUser = apellidoUser;
        this.tituloUser = tituloUser;
        this.descripcionUser = descripciónUser;
        this.imagenUser = imagenUser;
    }
    
    //para vincular a Usuario con las otras clases:
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPer")
    private List<PerfilProfesional> perfilprofesionalList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia>experienciaList;
    //--private List<ExperienciaProfesional> experienciaprofesionalList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idHabi")
    private List<HabilidadesDurasYBlandas> abilidadesdurasyblandasList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Proyecto>proyectoList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Proyectos> proyectosList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idHace")
    private List<HacercaDe> hacercadeList;
    
    
    
    
}
