import { Component, HostBinding, OnInit } from '@angular/core';
import { ActivatedRoute , Router} from '@angular/router';
import { HabilidadesDurasYBlandas } from 'src/app/models/habilidades';
import { HabilidadesService } from 'src/app/servicios/habilidades.service';

@Component({
  selector: 'app-form-habilidades-duras-blandas',
  templateUrl: './form-habilidades-duras-blandas.component.html',
  styleUrls: ['./form-habilidades-duras-blandas.component.css']
})
export class FormHabilidadesDurasBlandasComponent implements OnInit {
  @HostBinding('class') classes = "row";

  habilidadesdurasyblandas : HabilidadesDurasYBlandas ={
    idHabi: 0,
    tituloHabi:'',
    porcentajeHabi:'',
    imagenHabi:'',
    porcientoHabi:'',
  };
  edit: boolean = false;


  constructor(private habilidadesService: HabilidadesService, private router: Router,
    private activatedRoute: ActivatedRoute ) { }

    ngOnInit() {
      const params = this.activatedRoute.snapshot.params;
      if (params["id"]) {
       this.habilidadesService.getHabilidadesDurasYBlandas(params["id"]).subscribe({
         next: res => {
           console.log(res);
           this.habilidadesdurasyblandas= res;
           this.edit=true;
         },
         error: err => {console.error(err)},
       });
      }
     }

     saveNewHabilidadesDurasYBlandas() {
      delete this.habilidadesdurasyblandas.idHabi;

      this.habilidadesService.saveHabilidadesDurasYBlandas(this.habilidadesdurasyblandas).
      subscribe({
        next: res => {
          console.log(res);
          this.router.navigate(['']);
        },
         error: err => {console.log(err)},
    });
    }

    updateHabilidadesDurasYBlandas() {
      this.habilidadesService.updateHabilidadesDurasYBlandas(this.habilidadesdurasyblandas.idHabi , this.habilidadesdurasyblandas)
      .subscribe({
        next: res => {
           console.log(res);
           this.router.navigate(['']);
         },
         error: err => {console.log(err)},
   });
   }


  }




