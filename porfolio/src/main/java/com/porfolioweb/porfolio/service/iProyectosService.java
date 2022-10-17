/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.Proyectos;
import java.util.List;

/**
 *
 * @author Nueva
 */
public interface iProyectosService {
    
    public List<Proyectos> getProyectos ();
   
    public void saveProyectos (Proyectos proyectos );

     public void deleteProyectos (Long id);

    public Proyectos buscarProyectos (Long id);
    
    public Proyectos findProyectos  (Long id);
    
    
}
