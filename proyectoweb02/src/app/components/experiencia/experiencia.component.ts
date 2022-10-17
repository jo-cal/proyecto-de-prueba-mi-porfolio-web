import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router} from '@angular/router';
import { Experiencia } from 'src/app/models/experiencia';
import { ExperienciaService } from 'src/app/servicios/experiencia.service';
import { TokenService } from 'src/app/servicios/token.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {
  isLogged = false;


  experiencias: any = [];
  constructor( private experienciaService: ExperienciaService,   private router: Router,
    private activatedRoute: ActivatedRoute ,  private tokenService: TokenService ) { }

  ngOnInit() {
    this.getExperiencias();

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



  getExperiencias() {
    this.experienciaService.getExperiencias().subscribe(
      {
      next: res => {
        this.experiencias=res;
      },
        error: err => {
          console.error(err);
        },
    });
  }
  deleteExperiencia(idExp:string) {
    this.experienciaService.deleteExperiencia( idExp ).subscribe(
      {
        next: res => {
          console.log(res);
          this.getExperiencias();
        },
          error: err => {
            console.log(err);
          },
      });
    }
    editExperiencia(idExp:string) {
      console.log(idExp);
      this.getExperiencias();
    }
  }











