
package com.porfolioweb.porfolio.repository;

import com.porfolioweb.porfolio.models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepo extends JpaRepository<Educacion,Long> {
    
}
