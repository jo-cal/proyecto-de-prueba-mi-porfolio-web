
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.Educacion;
import java.util.List;


public interface iEducacionService {
    
    public List<Educacion> getEducacion ();
   
    public void saveEducacion (Educacion educacion );

     public void deleteEducacion (Long id);

    public Educacion buscarEducaciones (Long id);
    
    public Educacion findEducacion  (Long id);
    
      

    
}
