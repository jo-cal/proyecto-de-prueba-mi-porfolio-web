
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.Educacion;
import com.porfolioweb.porfolio.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional  //sirve para la implementacion de los métodos y la union con el controlador
public class EducacionService  implements iEducacionService  {
    //private final EducacionRepo educacionRepo;
    
    //@Autowired
    //public EducacionService(EducacionRepo educacionRepo){this.educacionRepo = educacionRepo;}
    
    //public Educacion addEducacion(Educacion educacion){return educacionRepo.save(educacion);}
    
    //public List<Educacion> buscarEducaciones(){return educacionRepo.findAll();}
    
    //public Educacion editEducacion(Educacion educacion){return educacionRepo.save(educacion);}
    
    //public void deleteEducacion(Long id){educacionRepo.deleteById(id);}
    
    //public void saveEducacion(Educacion educacion ) {educacionRepo.save(educacion);}
    
    
    //public Educacion findEducacion(Long id) {Educacion educacion  = educacionRepo.findById(id).orElse(null);return educacion; }

    //public Educacion buscarEducacion(Long id) {return educacionRepo.findById(id). orElse(null);}

    @Autowired
    public EducacionRepo educacionRepo;
    
    @Override
    public List<Educacion> getEducacion() { List<Educacion> listaEducacion  = educacionRepo.findAll();return listaEducacion ;}
                         
    @Override
    public void saveEducacion (Educacion educacion ) {educacionRepo.save(educacion);}     
                             
    @Override
    public void deleteEducacion (Long id) {educacionRepo.deleteById(id);}
                           
    @Override
    public Educacion findEducacion (Long id) {Educacion educacion  = educacionRepo.findById(id).orElse(null);return educacion ; }
    @Override 
    public Educacion  buscarEducaciones(Long id) {return educacionRepo.findById(id). orElse(null);}


    
    
}
