
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.HacercaDe;
import com.porfolioweb.porfolio.repository.HacercaDeRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HacercaDeService {
    private final HacercaDeRepo hacercadeRepo;
    
    @Autowired
    public HacercaDeService(HacercaDeRepo hacercadeRepo){
        this.hacercadeRepo =  hacercadeRepo;
    }
    public HacercaDe addHacercaDe (HacercaDe hacercade){
        return  hacercadeRepo.save(hacercade);
    }
    
  
    public List<HacercaDe> buscarHacercaDe(){
    return hacercadeRepo.findAll();
    }
    
    public HacercaDe editHacercaDe(HacercaDe hacercade){
    return hacercadeRepo.save(hacercade);
    }
    
    public void deleteHacercaDe(Long id){
        hacercadeRepo.deleteById(id);
    }
}
