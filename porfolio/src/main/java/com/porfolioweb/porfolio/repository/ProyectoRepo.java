
package com.porfolioweb.porfolio.repository;

import com.porfolioweb.porfolio.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto,Long> {
    
}

