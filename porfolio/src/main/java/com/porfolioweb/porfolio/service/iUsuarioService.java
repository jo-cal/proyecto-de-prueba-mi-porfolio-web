
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.models.Usuario;
import java.util.List;


public interface iUsuarioService {
    
    public List<Usuario> getUsuario ();
   
    public void saveUsuario (Usuario usuario );

     public void deleteUsuario (Long id);

    public Usuario buscarUsuarios  (Long id);
    
    public Usuario findUsuario  (Long id);
    
    
}
