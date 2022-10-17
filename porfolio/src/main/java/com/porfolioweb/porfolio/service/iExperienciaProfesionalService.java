
package com.porfolioweb.porfolio.service;
import com.porfolioweb.porfolio.models.ExperienciaProfesional;
import java.util.List;


public interface iExperienciaProfesionalService {
    
    public List<ExperienciaProfesional> getExperienciaProfesional ();
   
    public void saveExperienciaProfesional (ExperienciaProfesional experienciaprofesional );

     public void deleteExperienciaProfesional (Long id);

    public ExperienciaProfesional buscarExperienciasProfesionales (Long id);
    
    public ExperienciaProfesional findExperienciaProfesional  (Long id);
    
}
