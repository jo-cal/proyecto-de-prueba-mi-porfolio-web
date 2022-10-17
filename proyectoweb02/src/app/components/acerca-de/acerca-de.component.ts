import { Component, OnInit } from '@angular/core';
import { ActivatedRoute , Router} from '@angular/router';
import { Usuario } from 'src/app/models/usuario';
import { TokenService } from 'src/app/servicios/token.service';
import { UsuarioService } from 'src/app/servicios/usuario.service';
@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
  isLogged = false;
  usuarios: any = [];

  constructor( private usuarioService: UsuarioService,   private router: Router,
    private activatedRoute: ActivatedRoute ,  private tokenService: TokenService ) {   }


    ngOnInit() {
      this.getUsuarios();

      if (this.tokenService.getToken()) {
        this.isLogged = true;
      } else {
        this.isLogged = false;
      }
    }
    login() {
      this.router.navigate(['/login']);
    }
    onLogOut(): void {
      this.tokenService.logOut();
      window.location.reload();
    }




    getUsuarios() {
      this.usuarioService.getUsuarios().subscribe(
        {
        next: res => {
          this.usuarios=res;
        },
          error: err => {
            console.error(err);
          },
      });
    }



  deleteUsuario(idUser:string) {
    this.usuarioService.deleteUsuario( idUser ).subscribe(
      {
        next: res => {
          console.log(res);
          this.getUsuarios();
        },
          error: err => {
            console.log(err);
          },
      });
    }

    editUsuario(idUser:string) {
      console.log(idUser);
      this.getUsuarios();
    }



}
