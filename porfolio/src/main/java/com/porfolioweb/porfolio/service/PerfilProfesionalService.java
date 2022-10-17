
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.PerfilProfesional;
import com.porfolioweb.porfolio.repository.PerfilProfesionalRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PerfilProfesionalService {
    private final PerfilProfesionalRepo perfilprofesionalRepo;
    
    @Autowired
    public PerfilProfesionalService(PerfilProfesionalRepo perfilprofesionalRepo){
        this.perfilprofesionalRepo = perfilprofesionalRepo;
    }
    public PerfilProfesional addPerfilProfesional(PerfilProfesional perfilprofesional){
        return perfilprofesionalRepo.save(perfilprofesional);
    }
    
  
    public List<PerfilProfesional> buscarPerfilProfesional(){
    return perfilprofesionalRepo.findAll();
    }
    
    public PerfilProfesional editPerfilProfesional(PerfilProfesional perfilprofesional){
    return perfilprofesionalRepo.save(perfilprofesional);
    }
    
    public void deletePerfilProfesional(Long id){
        perfilprofesionalRepo.deleteById(id);
    }
    
}
