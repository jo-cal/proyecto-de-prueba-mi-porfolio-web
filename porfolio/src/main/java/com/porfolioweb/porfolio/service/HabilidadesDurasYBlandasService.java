
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.HabilidadesDurasYBlandas;
import com.porfolioweb.porfolio.repository.HabilidadesDurasYBlandasRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HabilidadesDurasYBlandasService implements iHabilidadesDurasYBlandasService   {
    
    @Autowired
public HabilidadesDurasYBlandasRepo habilidadesdurasyblandasRepo;
@Override
public List<HabilidadesDurasYBlandas> getHabilidadesDurasYBlandas() { List<HabilidadesDurasYBlandas> listaHabilidadesDurasYBlandas =  habilidadesdurasyblandasRepo.findAll();return listaHabilidadesDurasYBlandas ;}

@Override
public void saveHabilidadesDurasYBlandas (HabilidadesDurasYBlandas  habilidadesdurasyblandas  ) {habilidadesdurasyblandasRepo.save( habilidadesdurasyblandas);}     
@Override
public void deleteHabilidadesDurasYBlandas (Long id) {habilidadesdurasyblandasRepo.deleteById(id);}
@Override
public HabilidadesDurasYBlandas findHabilidadesDurasYBlandas  (Long id) {HabilidadesDurasYBlandas habilidadesdurasyblandas  = habilidadesdurasyblandasRepo.findById(id).orElse(null);return habilidadesdurasyblandas ; }
@Override 
public HabilidadesDurasYBlandas  buscarHabilidadesDurasYBlandas(Long id) {return habilidadesdurasyblandasRepo.findById(id). orElse(null);}

    
    
//private final HabilidadesDurasYBlandasRepo habilidadesdurasyblandasRepo;
    
    //@Autowired
    //public HabilidadesDurasYBlandasService(HabilidadesDurasYBlandasRepo habilidadesdurasyblandasRepo){this.habilidadesdurasyblandasRepo = habilidadesdurasyblandasRepo;}
    
    //public HabilidadesDurasYBlandas addHabilidadesDurasYBlandas(HabilidadesDurasYBlandas habilidadesdurasyblandas){return habilidadesdurasyblandasRepo.save(habilidadesdurasyblandas);}
    
    //public List<HabilidadesDurasYBlandas> buscarHabilidadesDurasYBlandas(){return habilidadesdurasyblandasRepo.findAll();}
    
    //public HabilidadesDurasYBlandas editHabilidadesDurasYBlandas(HabilidadesDurasYBlandas habilidadesdurasyblandas){return habilidadesdurasyblandasRepo.save(habilidadesdurasyblandas);}
    
    //public void deleteHabilidadesDurasYBlandas(Long id){habilidadesdurasyblandasRepo.deleteById(id);}
    
}
