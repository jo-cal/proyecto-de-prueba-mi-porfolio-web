
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.Proyectos;
import com.porfolioweb.porfolio.repository.ProyectosRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService implements iProyectosService {
    
    
    @Autowired
    public ProyectosRepo proyectosRepo;
    
    @Override
    public List<Proyectos> getProyectos() { List<Proyectos> listaProyectos  = proyectosRepo.findAll();return listaProyectos ;}
                         
    @Override
    public void saveProyectos (Proyectos proyectos ) {proyectosRepo.save(proyectos);}     
                             
    @Override
    public void deleteProyectos (Long id) {proyectosRepo.deleteById(id);}
                           
    @Override
    public Proyectos findProyectos (Long id) {Proyectos proyectos  = proyectosRepo.findById(id).orElse(null);return proyectos ; }
    
    @Override 
    public Proyectos  buscarProyectos(Long id) {return proyectosRepo.findById(id). orElse(null);}
                                           
    
    
    
    //private final ProyectosRepo proyectosRepo;
    
    //@Autowired
   // public ProyectosService(ProyectosRepo proyectosRepo){this.proyectosRepo = proyectosRepo;}
    //public Proyectos addProyectos (Proyectos proyectos){return proyectosRepo.save( proyectos);}
    
  
    //public List<Proyectos> buscarProyectos(){return  proyectosRepo.findAll();}
    
    //public Proyectos editProyectos (Proyectos proyectos ){return proyectosRepo.save(proyectos);}
    
    //public void deleteProyectos(Long id){proyectosRepo.deleteById(id);}
    
}
