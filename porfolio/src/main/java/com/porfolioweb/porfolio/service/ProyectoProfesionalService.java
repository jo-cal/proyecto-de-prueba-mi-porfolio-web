
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.ProyectoProfesional;
import com.porfolioweb.porfolio.repository.ProyectoProfesionalRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectoProfesionalService implements iProyectoProfesionalService   {
    
    @Autowired
    public ProyectoProfesionalRepo proyectoprofesionalRepo;
    
    @Override
    public List<ProyectoProfesional> getProyectoProfesional() { List<ProyectoProfesional> listaProyectoProfesional  = proyectoprofesionalRepo.findAll();return listaProyectoProfesional ;}
          
            
    
    @Override
    public void saveProyectoProfesional (ProyectoProfesional proyectoprofesional ) {proyectoprofesionalRepo.save(proyectoprofesional);}     
                
      

    @Override
    public void deleteProyectoProfesional (Long id) {proyectoprofesionalRepo.deleteById(id);}
    
      
                           
    @Override
    public ProyectoProfesional findProyectoProfesional (Long id) {ProyectoProfesional proyectoprofesional  = proyectoprofesionalRepo.findById(id).orElse(null);return proyectoprofesional ; }
    
    @Override 
    public ProyectoProfesional  buscarProyectosProfesionales(Long id) {return proyectoprofesionalRepo.findById(id). orElse(null);}
                                           
    
    
    
    
}
