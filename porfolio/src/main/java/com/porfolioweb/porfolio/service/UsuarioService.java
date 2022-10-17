
package com.porfolioweb.porfolio.service;

import com.porfolioweb.porfolio.exception.UserNotFoundException;
import com.porfolioweb.porfolio.models.Educacion;
import com.porfolioweb.porfolio.models.Usuario;
import com.porfolioweb.porfolio.repository.EducacionRepo;
import com.porfolioweb.porfolio.repository.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService implements iUsuarioService  {
    
    @Autowired
    public UsuarioRepo usuarioRepo;
    
    @Override
    public List<Usuario> getUsuario() { List<Usuario> listaUsuario   = usuarioRepo.findAll();return listaUsuario ;}
                         
    @Override
    public void saveUsuario  (Usuario usuario  ) {usuarioRepo.save(usuario);}     
                             
    @Override
    public void deleteUsuario (Long id) {usuarioRepo.deleteById(id);}
                           
    @Override
    public Usuario findUsuario (Long id) {Usuario usuario   = usuarioRepo.findById(id).orElse(null);return usuario ; }
    @Override 
    public Usuario buscarUsuarios (Long id) {return usuarioRepo.findById(id). orElse(null);}


    
    
    
    
    //private final UsuarioRepo usuarioRepo;
    
    //@Autowired
    //public UsuarioService(UsuarioRepo usuarioRepo){this.usuarioRepo = usuarioRepo;}
    
    
    //public Usuario addUsuario(Usuario usuario){return usuarioRepo.save(usuario);}
    
    
    //public List<Usuario> buscarUsuario(){return usuarioRepo.findAll();}
    
    
    //public Usuario editUsuario(Usuario usuario){return usuarioRepo.save(usuario);}
    
    
    //public void deleteUsuario(Long id){usuarioRepo.deleteById(id);}
    
    
    //public Usuario buscarUsuarioPorId(Long id){
         //return usuarioRepo.findById(id).orElseThrow(() ->new UserNotFoundException("User doesnt exist in system"));   
    //}
    
    
}
