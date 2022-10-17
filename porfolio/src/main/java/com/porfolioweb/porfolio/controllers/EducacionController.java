
package com.porfolioweb.porfolio.controllers;//
import com.porfolioweb.porfolio.models.Educacion;//
import com.porfolioweb.porfolio.service.EducacionService;//
import com.porfolioweb.porfolio.service.iEducacionService;
import java.util.List;//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;//
import org.springframework.http.ResponseEntity;//
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/educacion")
@CrossOrigin(origins= "http://localhost:4200")
public class EducacionController {
    
    
    @Autowired
    private iEducacionService educacionService;
    
    //private final EducacionService educacionService;
    
    //public EducacionController(EducacionService educacionService) {this.educacionService = educacionService;}
    
    @GetMapping("/all") //para traer
    public List<Educacion> getEducacion() {return educacionService.getEducacion();}
    //public ResponseEntity<List<Educacion>> addEducacion(){List<Educacion> educaciones  = educacionService.buscarEducaciones();return new ResponseEntity<>(educaciones, HttpStatus.OK);}
    
     @GetMapping("/{id}")
     public ResponseEntity <Educacion> addEducacion(@PathVariable("id") Long id){Educacion educacion  = educacionService.buscarEducaciones(id);return new ResponseEntity<>(educacion, HttpStatus.OK);}

    
     //@PutMapping("/update") //para editar
     //public ResponseEntity<Educacion>editEducacion(@RequestBody Educacion educacion){
        //Educacion updateEducacion =educacionService.editEducacion(educacion);
        //return new ResponseEntity<>(updateEducacion,HttpStatus.OK);}
        
    @PutMapping("/update/{id}")
    public Educacion updateEducacion (@PathVariable long id,@RequestBody Educacion educacionDetails) {
    Educacion updateEducacion  = educacionService.findEducacion(id);
    updateEducacion.setTituloEdu(educacionDetails.getTituloEdu());
    updateEducacion.setDescripcionEdu(educacionDetails.getDescripcionEdu());
    updateEducacion.setImagenEdu(educacionDetails.getImagenEdu());
    educacionService.saveEducacion(updateEducacion);return updateEducacion;}

    
    
    @PostMapping("/add") //para añadir
    //public ResponseEntity<Educacion>addEducacion(@RequestBody Educacion educacion){Educacion nuevaEducacion=educacionService.addEducacion(educacion);return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);}
   public void saveEducacion(@RequestBody Educacion  educacion ){educacionService.saveEducacion(educacion);}

    

    @DeleteMapping("/delete/{id}") //para borrar
    public ResponseEntity<?> deleteEducacion(@PathVariable("id") Long id){educacionService.deleteEducacion(id);return new ResponseEntity<>(HttpStatus.OK);}         
    
    
}
