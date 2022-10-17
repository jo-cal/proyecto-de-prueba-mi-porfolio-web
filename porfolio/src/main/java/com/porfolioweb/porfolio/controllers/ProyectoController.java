
package com.porfolioweb.porfolio.controllers;

import com.porfolioweb.porfolio.models.Proyecto;
import com.porfolioweb.porfolio.service.iProyectoService;
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
@RequestMapping("/proyectoss")
@CrossOrigin(origins= "http://localhost:4200")
public class ProyectoController {
    
@Autowired
private iProyectoService proyectoService;

@GetMapping ("/all")
 public List<Proyecto> getProyecto() {return proyectoService.getProyecto();}

@GetMapping("/{id}")
public ResponseEntity <Proyecto> addProyecto(@PathVariable("id") Long id){Proyecto proyecto  = proyectoService.buscarProyectos(id);return new ResponseEntity<>(proyecto , HttpStatus.OK);}

@PostMapping ("/add")
public void saveProyecto(@RequestBody Proyecto proyecto ){proyectoService.saveProyecto(proyecto);}
//public ResponseEntity<Educacion>addEducacion(@RequestBody Educacion educacion){Educacion nuevaEducacion=educacionService.addEducacion(educacion);return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);}

    
@PutMapping ("/update/{id}")
public Proyecto  updateProyecto (@PathVariable long id,@RequestBody Proyecto proyectoDetails) {
Proyecto updateProyecto  = proyectoService.findProyecto(id);
updateProyecto.setTituloPro(proyectoDetails.getTituloPro());
updateProyecto.setDescripcionPro(proyectoDetails.getDescripcionPro());
updateProyecto.setImagenPro(proyectoDetails.getImagenPro());
proyectoService.saveProyecto(updateProyecto);return updateProyecto;}


@DeleteMapping ("/delete/{id}")
public ResponseEntity<?> deleteProyecto (@PathVariable("id") Long id){ proyectoService.deleteProyecto(id); return new ResponseEntity<>(HttpStatus.OK); }         

    
}
