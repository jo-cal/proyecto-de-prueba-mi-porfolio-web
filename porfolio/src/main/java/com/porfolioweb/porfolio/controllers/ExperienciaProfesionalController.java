package com.porfolioweb.porfolio.controllers;

import com.porfolioweb.porfolio.models.ExperienciaProfesional;
import com.porfolioweb.porfolio.service.ExperienciaProfesionalService;
import com.porfolioweb.porfolio.service.iExperienciaProfesionalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/api/experiencia")
@CrossOrigin(origins= "http://localhost:4200")

public class ExperienciaProfesionalController {
    
    @Autowired
private iExperienciaProfesionalService experienciaprofesionalService;

@GetMapping ("/all")
 public List<ExperienciaProfesional> getExperienciaProfesional() {return experienciaprofesionalService.getExperienciaProfesional();}
 
@GetMapping("/{id}")
public ResponseEntity <ExperienciaProfesional> addExperienciaProfesional(@PathVariable("id") Long id){ExperienciaProfesional experienciaprofesional  = experienciaprofesionalService.buscarExperienciasProfesionales(id);return new ResponseEntity<>(experienciaprofesional , HttpStatus.OK);}

@PostMapping ("/add")
public void saveExperienciaProfesional(@RequestBody ExperienciaProfesional experienciaprofesional  ){experienciaprofesionalService.saveExperienciaProfesional(experienciaprofesional);}
//public ResponseEntity<Educacion>addEducacion(@RequestBody Educacion educacion){Educacion nuevaEducacion=educacionService.addEducacion(educacion);return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);}
    

@PutMapping ("/update/{id}")
public ExperienciaProfesional  updateExperienciaProfesional (@PathVariable long id,@RequestBody ExperienciaProfesional experienciaprofesionalDetails) {
ExperienciaProfesional updateExperienciaProfesional  = experienciaprofesionalService.findExperienciaProfesional(id);
updateExperienciaProfesional.setTituloExp(experienciaprofesionalDetails.getTituloExp());
updateExperienciaProfesional.setDescripcionExp(experienciaprofesionalDetails.getDescripcionExp());
updateExperienciaProfesional.setImagenExp(experienciaprofesionalDetails.getImagenExp());
experienciaprofesionalService.saveExperienciaProfesional(updateExperienciaProfesional);return updateExperienciaProfesional;}


@DeleteMapping ("/delete/{id}")
public ResponseEntity<?> deleteExperienciaProfesional (@PathVariable("id") Long id){ experienciaprofesionalService.deleteExperienciaProfesional(id); return new ResponseEntity<>(HttpStatus.OK); }         

}

    



        
    //private final ExperienciaProfesionalService experienciaprofesionalService;
    
    //public ExperienciaProfesionalController(ExperienciaProfesionalService experienciaprofesionalService) {
      //this.experienciaprofesionalService = experienciaprofesionalService; }

    //@GetMapping("/all") 
    //public ResponseEntity<List<ExperienciaProfesional>> addExperienciaProfesional(){
        //List<ExperienciaProfesional> experienciaprofesional  = experienciaprofesionalService.buscarExperienciaProfesional();
    //return new ResponseEntity<>(experienciaprofesional, HttpStatus.OK);
    //}
    
    //@PutMapping("/update") 
     //public ResponseEntity<ExperienciaProfesional>editExperienciaProfesional(@RequestBody ExperienciaProfesional experienciaprofesional ){
        //ExperienciaProfesional updateExperienciaProfesional =experienciaprofesionalService.editExperienciaProfesional(experienciaprofesional);
        //return new ResponseEntity<>(updateExperienciaProfesional,HttpStatus.OK);
    //}

     //@PostMapping("/add") 
    //public ResponseEntity<ExperienciaProfesional>addExperienciaProfesional(@RequestBody ExperienciaProfesional experienciaprofesional){
        //ExperienciaProfesional nuevaExperienciaProfesional= experienciaprofesionalService.addExperienciaProfesional(experienciaprofesional);
        //return new ResponseEntity<>(nuevaExperienciaProfesional,HttpStatus.CREATED);
    //}
    
    //@DeleteMapping("/delete/{id}") 
    //public ResponseEntity<?> deleteExperienciaProfesional(@PathVariable("id") Long id){
        //experienciaprofesionalService.deleteExperienciaProfesional(id);
        //return new ResponseEntity<>(HttpStatus.OK);
    //}         
//}




