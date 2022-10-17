import { Component,HostBinding,  OnInit } from '@angular/core';
import { ActivatedRoute, Router} from '@angular/router';
import { HabilidadesDurasYBlandas } from 'src/app/models/habilidades';
import { HabilidadesService } from 'src/app/servicios/habilidades.service';
import { TokenService } from 'src/app/servicios/token.service';

@Component({
  selector: 'app-habilidades-duras-blandas',
  templateUrl: './habilidades-duras-blandas.component.html',
  styleUrls: ['./habilidades-duras-blandas.component.css']
})
export class HabilidadesDurasBlandasComponent implements OnInit {
  isLogged = false;
  //@HostBinding('class') classes = "row";

  habilidadesdurasyblandasss: any = [];

  constructor( private habilidadesService: HabilidadesService,   private router: Router,
    private activatedRoute: ActivatedRoute ,  private tokenService: TokenService     ) { }

  ngOnInit() {
    this.getHabilidadesDurasYBlandasss();
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


  getHabilidadesDurasYBlandasss() {
    this.habilidadesService.getHabilidadesDurasYBlandasss().subscribe(
      {
      next: res => {
        this.habilidadesdurasyblandasss =res;
      },
        error: err => {
          console.error(err);
        },
    });
  }

  deleteHabilidadesDurasYBlandas(idHabi:string) {
    this.habilidadesService.deleteHabilidadesDurasYBlandas(idHabi).subscribe(
      {
        next: res => {
          console.log(res);
          this.getHabilidadesDurasYBlandasss();
        },
          error: err => {
            console.log(err);
          },
      });
    }

    editHabilidadesDurasYBlandas(idHabi:string) {
      console.log(idHabi);
      this.getHabilidadesDurasYBlandasss();
    }



}
