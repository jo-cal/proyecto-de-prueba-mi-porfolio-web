/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolioweb.porfolio.repository;

import com.porfolioweb.porfolio.models.ExperienciaProfesional;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaProfesionalRepo extends JpaRepository<ExperienciaProfesional,Long> {
    //public Optional<ExperienciaProfesional>findByTituloExp(String tituloExp);
    //public boolean existaByTituloExp (String tituloExp);
    
}
