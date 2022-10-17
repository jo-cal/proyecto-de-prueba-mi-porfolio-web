
package com.porfolioweb.porfolio.controllers;
import com.porfolioweb.porfolio.models.Usuario;
import com.porfolioweb.porfolio.service.iUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins= "http://localhost:4200")
public class UsuarioController {
     
    @Autowired
    private iUsuarioService usuarioService;
        
    @GetMapping("/all")    
    public List<Usuario> getUsuario() {return usuarioService.getUsuario();}
    
    //@GetMapping("/id/{id}")
    //public ResponseEntity <Usuario> addUsuario(@PathVariable("id") Long id){Usuario usuario = usuarioService.buscarUsuarioPorId(id);return new ResponseEntity<>(usuario, HttpStatus.OK);}
    
    @GetMapping("/{id}")
    public ResponseEntity <Usuario> addUsuario(@PathVariable("id") Long id){Usuario usuario = usuarioService.buscarUsuarios(id);return new ResponseEntity<>(usuario, HttpStatus.OK);}
    
    @PostMapping("/add") //para añadir    
    public void saveUsuario(@RequestBody Usuario usuario  ){usuarioService.saveUsuario(usuario);}

    @DeleteMapping("/delete/{id}") //para borrar
    public ResponseEntity<?> deleteUsuario(@PathVariable("id") Long id){usuarioService.deleteUsuario(id);return new ResponseEntity<>(HttpStatus.OK);}         
    
    
    @PutMapping("/update/{id}")
    public Usuario updateUsuario (@PathVariable long id,@RequestBody Usuario usuarioDetails) {
    Usuario updateUsuario = usuarioService.findUsuario(id);
    updateUsuario.setNombreUser(usuarioDetails.getNombreUser());
    updateUsuario.setApellidoUser(usuarioDetails.getApellidoUser());
    updateUsuario.setTituloUser(usuarioDetails.getTituloUser());
    updateUsuario.setDescripcionUser(usuarioDetails.getDescripcionUser());
    updateUsuario.setImagenUser(usuarioDetails.getImagenUser());
    usuarioService.saveUsuario(updateUsuario);return updateUsuario;}

    
}
