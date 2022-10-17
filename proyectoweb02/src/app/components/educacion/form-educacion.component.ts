import { Component, HostBinding, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Educacion } from 'src/app/models/educacion';
import { EducacionService } from 'src/app/servicios/educacion.service';

@Component({
  selector: 'app-form-educacion',
  templateUrl: './form-educacion.component.html',
  styleUrls: ['./form-educacion.component.css']
})
export class FormEducacionComponent implements OnInit {
  @HostBinding('class') classes = "row";


  educacion: Educacion ={
    idEdu: 0,
    tituloEdu:'',
    descripcionEdu:'',
    imagenEdu:''
  };
  edit: boolean = false;
  constructor(private educacionService: EducacionService, private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
   const params = this.activatedRoute.snapshot.params;
   if (params["id"]) {
    this.educacionService.getEducacion(params["id"]).subscribe({
      next: res => {
        console.log(res);
        this.educacion= res;
        this.edit=true;
      },
      error: err => {console.error(err)},
    });
   }
  }


  saveNewEducacion() {
    delete this.educacion.idEdu;

    this.educacionService.saveEducacion(this.educacion).
    subscribe({
      next: res => {
        console.log(res);
        this.router.navigate(['']);
      },
       error: err => {console.log(err)},
  });
  }

  updateEducacion() {
    this.educacionService.updateEducacion(this.educacion.idEdu, this.educacion)
    .subscribe({
      next: res => {
         console.log(res);
         this.router.navigate(['']);
       },
       error: err => {console.log(err)},
 });
 }
}




