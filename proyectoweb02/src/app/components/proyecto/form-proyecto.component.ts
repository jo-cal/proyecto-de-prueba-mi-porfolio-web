import { Component, HostBinding, OnInit } from '@angular/core';
import { ActivatedRoute , Router} from '@angular/router';
import { Proyecto } from 'src/app/models/proyecto';
import { ProyectoService } from 'src/app/servicios/proyecto.service';

@Component({
  selector: 'app-form-proyecto',
  templateUrl: './form-proyecto.component.html',
  styleUrls: ['./form-proyecto.component.css']
})
export class FormProyectoComponent implements OnInit {
  @HostBinding('class') classes = "row";


  proyecto: Proyecto  ={
    idPro: 0,
    tituloPro:'',
    descripcionPro:'',
    imagenPro:''
  };
  edit: boolean = false;
  constructor(private proyectoService: ProyectoService, private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
   const params = this.activatedRoute.snapshot.params;
   if (params["id"]) {
    this.proyectoService.getProyecto(params["id"]).subscribe({
      next: res => {
        console.log(res);
        this.proyecto= res;
        this.edit=true;
      },
      error: err => {console.error(err)},
    });
   }
  }


  saveNewProyecto() {
    delete this.proyecto.idPro;

    this.proyectoService.saveProyecto(this.proyecto).
    subscribe({
      next: res => {
        console.log(res);
        this.router.navigate(['']);
      },
       error: err => {console.log(err)},
  });
  }

  updateProyecto() {
    this.proyectoService.updateProyecto(this.proyecto.idPro , this.proyecto)
    .subscribe({
      next: res => {
         console.log(res);
         this.router.navigate(['']);
       },
       error: err => {console.log(err)},
 });
 }
}










  /*proyecto: Proyecto  ={
    idPro: 0,
    tituloPro:'',
    descripcionPro:'',
    imagenPro:''
  };
  edit: boolean = false;

  constructor(private proyectoService: ProyectoService, private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
   const params = this.activatedRoute.snapshot.params;
   if (params["id"]) {
    this.proyectoService.getProyecto(params["id"]).subscribe({
      next: res => {
        console.log(res);
        this.proyecto= res;
        this.edit=true;
      },
      error: err => {console.error(err)},
    });
   }
  }


  saveNewProyecto() {
    delete this.proyecto.idPro;

    this.proyectoService.saveProyecto(this.proyecto).
    subscribe({
      next: res => {
        console.log(res);
        this.router.navigate(['']);
      },
       error: err => {console.log(err)},
  });
  }

  updateProyecto() {
    this.proyectoService.updateProyecto(this.proyecto.idPro, this.proyecto)
    .subscribe({
      next: res => {
         console.log(res);
         this.router.navigate(['']);
       },
       error: err => {console.log(err)},
 });
 }
}*/





