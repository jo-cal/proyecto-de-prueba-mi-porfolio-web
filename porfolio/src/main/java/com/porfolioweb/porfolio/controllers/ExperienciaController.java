
package com.porfolioweb.porfolio.controllers;

import com.porfolioweb.porfolio.models.Experiencia;
import com.porfolioweb.porfolio.service.iExperienciaService;
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
@RequestMapping("/api/experiencias")
@CrossOrigin(origins= "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
private iExperienciaService experienciaService;

@GetMapping ("/all")
 public List<Experiencia> getExperiencia() {return experienciaService.getExperiencia();}
 
@GetMapping("/{id}")
public ResponseEntity <Experiencia> addExperiencia(@PathVariable("id") Long id){Experiencia experiencia  = experienciaService.buscarExperiencias(id);return new ResponseEntity<>(experiencia , HttpStatus.OK);}

@PostMapping ("/add")
public void saveExperiencia(@RequestBody Experiencia experiencia  ){experienciaService.saveExperiencia(experiencia);}
//public ResponseEntity<Educacion>addEducacion(@RequestBody Educacion educacion){Educacion nuevaEducacion=educacionService.addEducacion(educacion);return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);}
    

@PutMapping ("/update/{id}")
public Experiencia  updateExperiencia (@PathVariable long id,@RequestBody Experiencia experienciaDetails) {
Experiencia updateExperiencia  = experienciaService.findExperiencia(id);
updateExperiencia.setTituloExp(experienciaDetails.getTituloExp());
updateExperiencia.setDescripcionExp(experienciaDetails.getDescripcionExp());
updateExperiencia.setImagenExp(experienciaDetails.getImagenExp());
experienciaService.saveExperiencia(updateExperiencia);return updateExperiencia;}


@DeleteMapping ("/delete/{id}")
public ResponseEntity<?> deleteExperiencia (@PathVariable("id") Long id){ experienciaService.deleteExperiencia(id); return new ResponseEntity<>(HttpStatus.OK); }         

}

    

