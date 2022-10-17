
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.Experiencia;
import com.porfolioweb.porfolio.repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ExperienciaService implements iExperienciaService  {
    
    
    @Autowired
    public ExperienciaRepo experienciaRepo;
    
    @Override
    public List<Experiencia> getExperiencia() { List<Experiencia> listaExperiencia  = experienciaRepo.findAll();return listaExperiencia ;}
                         
    @Override
    public void saveExperiencia (Experiencia experiencia ) {experienciaRepo.save(experiencia);}     
                             
    @Override
    public void deleteExperiencia (Long id) {experienciaRepo.deleteById(id);}
                           
    @Override
    public Experiencia findExperiencia (Long id) {Experiencia experiencia  = experienciaRepo.findById(id).orElse(null);return experiencia ; }
    
    @Override 
    public Experiencia  buscarExperiencias(Long id) {return experienciaRepo.findById(id). orElse(null);}
                                                       
       
}
