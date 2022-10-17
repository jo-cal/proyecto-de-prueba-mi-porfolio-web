
package com.porfolioweb.porfolio.controllers;

import com.porfolioweb.porfolio.models.Proyectos;
import com.porfolioweb.porfolio.service.ProyectosService;
import com.porfolioweb.porfolio.models.Proyectos;
import com.porfolioweb.porfolio.service.iProyectosService;
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
@RequestMapping("/proyectoS")
@CrossOrigin(origins= "http://localhost:4200")  
public class ProyectosController {
    
    
    @Autowired
private iProyectosService proyectosService;

@GetMapping ("/all")
 public List<Proyectos> getProyectos() {return proyectosService.getProyectos();}
 
@GetMapping("/{id}")
public ResponseEntity <Proyectos> addProyectos(@PathVariable("id") Long id){Proyectos proyectos  = proyectosService.buscarProyectos(id);return new ResponseEntity<>(proyectos , HttpStatus.OK);}

@PostMapping ("/add")
public void saveProyectos(@RequestBody Proyectos proyectos  ){proyectosService.saveProyectos(proyectos);}


@PutMapping ("/update/{id}")
public Proyectos  updateProyectos (@PathVariable long id,@RequestBody Proyectos proyectosDetails) {
Proyectos updateProyectos  = proyectosService.findProyectos(id);
updateProyectos.setTituloPro(proyectosDetails.getTituloPro());
updateProyectos.setDescripcionPro(proyectosDetails.getDescripcionPro());
updateProyectos.setImagenPro(proyectosDetails.getImagenPro());
proyectosService.saveProyectos(updateProyectos);return updateProyectos;}


@DeleteMapping ("/delete/{id}")
public ResponseEntity<?> deleteProyectos (@PathVariable("id") Long id){ proyectosService.deleteProyectos(id); return new ResponseEntity<>(HttpStatus.OK); }         

}

    



        
    
    
    
    
    

    //private final ProyectosService proyectosService;
//public ProyectosController(ProyectosService proyectosService) {this.proyectosService = proyectosService; }

    
//@GetMapping("/all") 
//public ResponseEntity<List<Proyectos>> addProyectos(){List<Proyectos> proyectos  = proyectosService.buscarProyectos();return new ResponseEntity<>(proyectos, HttpStatus.OK);    }

//@PutMapping("/update") 
//public ResponseEntity<Proyectos>editProyectos(@RequestBody Proyectos proyectos ){ Proyectos updateProyectos = proyectosService.editProyectos(proyectos);return new ResponseEntity<>(updateProyectos,HttpStatus.OK); }

//@PostMapping("/add") 
//public ResponseEntity<Proyectos>addProyectos(@RequestBody Proyectos proyectos ){ Proyectos nuevaProyectos = proyectosService.addProyectos ( proyectos );return new ResponseEntity<>(nuevaProyectos,HttpStatus.CREATED);  }

//@DeleteMapping("/delete/{id}") 
//public ResponseEntity<?> deleteProyectos(@PathVariable("id") Long id){ proyectosService.deleteProyectos(id);return new ResponseEntity<>(HttpStatus.OK);  }         






//}
