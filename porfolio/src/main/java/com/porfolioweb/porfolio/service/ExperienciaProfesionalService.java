
package com.porfolioweb.porfolio.service;


import com.porfolioweb.porfolio.models.ExperienciaProfesional;

import com.porfolioweb.porfolio.repository.ExperienciaProfesionalRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaProfesionalService implements iExperienciaProfesionalService {
    
    @Autowired
    public ExperienciaProfesionalRepo experienciaprofesionalRepo;
    
    @Override
    public List<ExperienciaProfesional> getExperienciaProfesional() { List<ExperienciaProfesional> listaExperienciaProfesional  = experienciaprofesionalRepo.findAll();return listaExperienciaProfesional ;}
                         
    @Override
    public void saveExperienciaProfesional (ExperienciaProfesional experienciaprofesional ) {experienciaprofesionalRepo.save(experienciaprofesional);}     
                             
    @Override
    public void deleteExperienciaProfesional (Long id) {experienciaprofesionalRepo.deleteById(id);}
                           
    @Override
    public ExperienciaProfesional findExperienciaProfesional (Long id) {ExperienciaProfesional experienciaprofesional  = experienciaprofesionalRepo.findById(id).orElse(null);return experienciaprofesional ; }
    
    @Override 
    public ExperienciaProfesional  buscarExperienciasProfesionales(Long id) {return experienciaprofesionalRepo.findById(id). orElse(null);}
                                           
    
    //private final ExperienciaProfesionalRepo experienciaprofesionalRepo;
    
    //@Autowired
   // public ExperienciaProfesionalService(ExperienciaProfesionalRepo experienciaprofesionalRepo){
        //this.experienciaprofesionalRepo = experienciaprofesionalRepo;
    //}
    //public ExperienciaProfesional addExperienciaProfesional(ExperienciaProfesional experienciaprofesional){
        //return experienciaprofesionalRepo.save(experienciaprofesional);
    //}
    
  
    //public List<ExperienciaProfesional> buscarExperienciaProfesional(){
    //return experienciaprofesionalRepo.findAll();
    //}
    
    //public ExperienciaProfesional editExperienciaProfesional(ExperienciaProfesional experienciaprofesional){
    //return experienciaprofesionalRepo.save(experienciaprofesional);
    //}
    
    //public void deleteExperienciaProfesional(Long id){
        //experienciaprofesionalRepo.deleteById(id);
    //}
    
    
}
