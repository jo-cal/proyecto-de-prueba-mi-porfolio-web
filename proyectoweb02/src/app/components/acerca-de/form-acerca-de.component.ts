import { Component, HostBinding, OnInit } from '@angular/core';
import { ActivatedRoute, Router} from '@angular/router';
import { Usuario } from 'src/app/models/usuario';
import { UsuarioService } from 'src/app/servicios/usuario.service';

@Component({
  selector: 'app-form-acerca-de',
  templateUrl: './form-acerca-de.component.html',
  styleUrls: ['./form-acerca-de.component.css']
})
export class FormAcercaDeComponent implements OnInit {
  @HostBinding('class') classes = "row";

  usuario: Usuario  = {
    idUser: 0,
    nombreUser:'',
    apellidoUser:'',
    tituloUser:'',
    descripcionUser:'',
    imagenUser:''
  };
  edit: boolean = false;


  constructor(private usuarioService: UsuarioService, private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    const params = this.activatedRoute.snapshot.params;
   if (params["id"]) {
    this.usuarioService.getUsuario(params["id"]).subscribe({
      next: res => {
        console.log(res);
        this.usuario = res;
        this.edit=true;
      },
      error: err => {console.error(err)},
    });
   }
  }

  saveNewUsuario() {
    delete this.usuario.idUser;

    this.usuarioService.saveUsuario(this.usuario).
    subscribe({
      next: res => {
        console.log(res);
        this.router.navigate(['']);
      },
       error: err => {console.log(err)},
  });
  }


  updateUsuario() {
    this.usuarioService.updateUsuario(this.usuario.idUser, this.usuario)
    .subscribe({
      next: res => {
         console.log(res);
         this.router.navigate(['']);
       },
       error: err => {console.log(err)},
 });
 }



}
