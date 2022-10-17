
package com.porfolioweb.porfolio.repository;

import com.porfolioweb.porfolio.models.ProyectoProfesional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoProfesionalRepo extends JpaRepository<ProyectoProfesional,Long> {
    
}
