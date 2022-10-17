import { Component, HostBinding, OnInit } from '@angular/core';
import { ActivatedRoute , Router } from '@angular/router';
import { Banner  } from 'src/app/models/banner';
import { BannerService } from 'src/app/servicios/banner.service';

@Component({
  selector: 'app-form-banner',
  templateUrl: './form-banner.component.html',
  styleUrls: ['./form-banner.component.css']
})
export class FormBannerComponent implements OnInit {
  @HostBinding('class') classes = "row";

  banner: Banner  ={
    idBa:0,
    imagenBa:''
  };
  edit: boolean = false;

  constructor(private bannerService: BannerService, private router: Router,
    private activatedRoute: ActivatedRoute   ) { }

  ngOnInit() {
    const params = this.activatedRoute.snapshot.params;
    if (params["id"]) {
     this.bannerService.getBanner(params["id"]).subscribe({
       next: res => {
         console.log(res);
         this.banner = res;
         this.edit=true;
       },
       error: err => {console.error(err)},
     });
    }
   }

   saveNewBanner() {
    delete this.banner.idBa;

    this.bannerService.saveBanner(this.banner).
    subscribe({
      next: res => {
        console.log(res);
        this.router.navigate(['']);
      },
       error: err => {console.log(err)},
  });
  }

  updateBanner() {
    this.bannerService.updateBanner(this.banner.idBa, this.banner)
    .subscribe({
      next: res => {
         console.log(res);
         this.router.navigate(['']);
       },
       error: err => {console.log(err)},
 });
 }
}



