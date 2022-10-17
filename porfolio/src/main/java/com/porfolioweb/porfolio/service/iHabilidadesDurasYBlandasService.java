
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.HabilidadesDurasYBlandas;
import java.util.List;

public interface iHabilidadesDurasYBlandasService {
    
    public List<HabilidadesDurasYBlandas> getHabilidadesDurasYBlandas();

public void saveHabilidadesDurasYBlandas (HabilidadesDurasYBlandas habilidadesdurasyblandas  );

public void deleteHabilidadesDurasYBlandas  (Long id);

public HabilidadesDurasYBlandas  buscarHabilidadesDurasYBlandas (Long id);

public HabilidadesDurasYBlandas findHabilidadesDurasYBlandas (Long id);
    

    
}
