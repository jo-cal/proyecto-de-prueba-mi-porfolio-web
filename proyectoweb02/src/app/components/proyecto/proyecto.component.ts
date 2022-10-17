import { Component, OnInit } from '@angular/core';
import { ActivatedRoute , Router} from '@angular/router';
import { ProyectoService } from 'src/app/servicios/proyecto.service';
import { TokenService } from 'src/app/servicios/token.service';

@Component({
  selector: 'app-proyecto',
  templateUrl: './proyecto.component.html',
  styleUrls: ['./proyecto.component.css']
})
export class ProyectoComponent implements OnInit {
  isLogged = false;
  proyectos: any = [];
  constructor( private proyectoService: ProyectoService, private router: Router,  private activatedRoute: ActivatedRoute   , private tokenService: TokenService  ) { }

  ngOnInit() {
    this.getProyectos();

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



  getProyectos() {
    this.proyectoService.getProyectos().subscribe(
      {
      next: res => {
        this.proyectos=res;
      },
        error: err => {
          console.error(err);
        },
    });
  }
  deleteProyecto(idPro:string) {
    this.proyectoService.deleteProyecto( idPro ).subscribe(
      {
        next: res => {
          console.log(res);
          this.getProyectos();
        },
          error: err => {
            console.log(err);
          },
      });
    }
    editProyecto(idPro:string|number|undefined) {
      console.log(idPro);
      this.getProyectos();
    }
  }







 /* proyectos : any = [];
  constructor( private proyectoService: ProyectoService,   private router: Router,
    private activatedRoute: ActivatedRoute   ) { }

  ngOnInit() {
    this.getProyectos();
  }
  getProyectos() {
    this.proyectoService.getProyectos().subscribe(
      {
      next: res => {
        this.proyectos=res;
      },
        error: err => {
          console.error(err);
        },
    });
  }

  deleteProyecto(idPro:string) {
    this.proyectoService.deleteProyecto( idPro ).subscribe(
      {
        next: res => {
          console.log(res);
          this.getProyectos();
        },
          error: err => {
            console.log(err);
          },
      });
    }
    editProyecto(idPro:string) {
      console.log(idPro);
      this.getProyectos();
    }
  }*/



