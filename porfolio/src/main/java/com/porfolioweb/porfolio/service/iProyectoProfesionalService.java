
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.ProyectoProfesional;
import java.util.List;


public interface iProyectoProfesionalService {
    public List<ProyectoProfesional> getProyectoProfesional ();
   
    public void saveProyectoProfesional (ProyectoProfesional proyectoprofesional );

     public void deleteProyectoProfesional (Long id);

    public ProyectoProfesional buscarProyectosProfesionales (Long id);
    
    public ProyectoProfesional findProyectoProfesional  (Long id);
    
}
