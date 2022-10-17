
package com.porfolioweb.porfolio.repository;

import com.porfolioweb.porfolio.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia,Long>  {
    
}

