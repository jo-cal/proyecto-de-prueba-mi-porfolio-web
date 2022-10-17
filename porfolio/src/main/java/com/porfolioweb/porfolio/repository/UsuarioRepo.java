
package com.porfolioweb.porfolio.repository;

import com.porfolioweb.porfolio.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
    
}
