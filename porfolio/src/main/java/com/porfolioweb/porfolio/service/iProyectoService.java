
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.Proyecto;
import java.util.List;


public interface iProyectoService {
    public List<Proyecto> getProyecto();
    
    public void saveProyecto (Proyecto proyecto );

    public void deleteProyecto (Long id);

    public Proyecto buscarProyectos(Long id);
    
    public Proyecto  findProyecto  (Long id);

    
}

   

     
