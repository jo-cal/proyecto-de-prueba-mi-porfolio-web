import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Educacion } from 'src/app/models/educacion';
import { EducacionService } from 'src/app/servicios/educacion.service';
import { TokenService } from 'src/app/servicios/token.service';
@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {
  isLogged = false;


  educaciones: any = [];
  constructor( private educacionService: EducacionService,   private router: Router,
    private activatedRoute: ActivatedRoute, private tokenService: TokenService   ) { }

  ngOnInit() {
    this.getEducaciones();

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


  getEducaciones() {
    this.educacionService.getEducaciones().subscribe(
      {
      next: res => {
        this.educaciones=res;
      },
        error: err => {
          console.error(err);
        },
    });
  }
  deleteEducacion(idEdu:string) {
    this.educacionService.deleteEducacion( idEdu ).subscribe(
      {
        next: res => {
          console.log(res);
          this.getEducaciones();
        },
          error: err => {
            console.log(err);
          },
      });
    }
    editEducacion(idEdu:string) {
      console.log(idEdu);
      this.getEducaciones();
    }
  }




