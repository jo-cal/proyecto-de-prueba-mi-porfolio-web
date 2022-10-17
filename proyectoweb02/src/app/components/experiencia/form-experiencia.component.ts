import { Component, HostBinding, OnInit } from '@angular/core';
import { ActivatedRoute , Router } from '@angular/router';
import { Experiencia } from 'src/app/models/experiencia';
import { ExperienciaService } from 'src/app/servicios/experiencia.service';

@Component({
  selector: 'app-form-experiencia',
  templateUrl: './form-experiencia.component.html',
  styleUrls: ['./form-experiencia.component.css']
})
export class FormExperienciaComponent implements OnInit {
  @HostBinding('class') classes = "row";

  experiencia: Experiencia ={
    idExp: 0,
    tituloExp:'',
    descripcionExp:'',
    imagenExp:''
  };
  edit: boolean = false;
  constructor(private experienciaService: ExperienciaService, private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
   const params = this.activatedRoute.snapshot.params;
   if (params["id"]) {
    this.experienciaService.getExperiencia(params["id"]).subscribe({
      next: res => {
        console.log(res);
        this.experiencia= res;
        this.edit=true;
      },
      error: err => {console.error(err)},
    });
   }
  }


  saveNewExperiencia() {
    delete this.experiencia.idExp;

    this.experienciaService.saveExperiencia(this.experiencia).
    subscribe({
      next: res => {
        console.log(res);
        this.router.navigate(['']);
      },
       error: err => {console.log(err)},
  });
  }

  updateExperiencia() {
    this.experienciaService.updateExperiencia(this.experiencia.idExp, this.experiencia)
    .subscribe({
      next: res => {
         console.log(res);
         this.router.navigate(['']);
       },
       error: err => {console.log(err)},
 });
 }
}




