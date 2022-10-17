
package com.porfolioweb.porfolio.controllers;


import com.porfolioweb.porfolio.models.ProyectoProfesional;
import com.porfolioweb.porfolio.service.iProyectoProfesionalService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proyecto")
@CrossOrigin(origins= "http://localhost:4200")
public class ProyectoProfesionalController {
    
@Autowired
private iProyectoProfesionalService proyectoprofesionalService;

@GetMapping ("/all")
 public List<ProyectoProfesional> getProyectoProfesional() {return proyectoprofesionalService.getProyectoProfesional();}
 
@GetMapping("/{id}")
public ResponseEntity <ProyectoProfesional> addProyectoProfesional(@PathVariable("id") Long id){ProyectoProfesional proyectoprofesional  = proyectoprofesionalService.buscarProyectosProfesionales(id);return new ResponseEntity<>(proyectoprofesional , HttpStatus.OK);}


   




@PostMapping ("/add")
public void saveProyectoProfesional(@RequestBody ProyectoProfesional proyectoprofesional  ){proyectoprofesionalService.saveProyectoProfesional(proyectoprofesional);}
//public ResponseEntity<ProyectoProfesional>addProyectoProfesional(@RequestBody ProyectoProfesional proyectoprofesional ){ProyectoProfesional  nuevaProyectoProfesional= proyectoprofesionalService.addProyectoProfesional(proyectoprofesional);return new ResponseEntity<>(nuevaProyectoProfesional,HttpStatus.CREATED);}
   
    
@PutMapping ("/update/{id}")
public ProyectoProfesional  updateProyectoProfesional (@PathVariable long id,@RequestBody ProyectoProfesional proyectoprofesionalDetails) {
ProyectoProfesional updateProyectoProfesional  = proyectoprofesionalService.findProyectoProfesional(id);
updateProyectoProfesional.setTituloPro( proyectoprofesionalDetails.getTituloPro());
updateProyectoProfesional.setDescripcionPro(proyectoprofesionalDetails.getDescripcionPro());
updateProyectoProfesional.setImagenPro(proyectoprofesionalDetails.getImagenPro());
proyectoprofesionalService.saveProyectoProfesional(updateProyectoProfesional);return updateProyectoProfesional;}


    

@DeleteMapping ("/delete/{id}")
public ResponseEntity<?> deleteProyectoProfesional (@PathVariable("id") Long id){ proyectoprofesionalService.deleteProyectoProfesional(id); return new ResponseEntity<>(HttpStatus.OK); }         


    
    
}
