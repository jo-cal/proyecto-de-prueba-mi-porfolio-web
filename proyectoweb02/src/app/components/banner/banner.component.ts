import { Component, OnInit } from '@angular/core';
import { ActivatedRoute , Router} from '@angular/router';
import { Banner } from 'src/app/models/banner';
import { BannerService } from 'src/app/servicios/banner.service';
import { TokenService } from 'src/app/servicios/token.service';

@Component({
  selector: 'app-banner',
  templateUrl: './banner.component.html',
  styleUrls: ['./banner.component.css']
})
export class BannerComponent implements OnInit {
  isLogged = false;
  banners: any = [];

  constructor( private bannerService: BannerService,   private router: Router,
    private activatedRoute: ActivatedRoute,  private tokenService: TokenService     ) { }

  ngOnInit(){
    this.getBanners();

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




  getBanners() {
    this.bannerService.getBanners().subscribe(
      {
      next: res => {
        this.banners=res;
      },
        error: err => {
          console.error(err);
        },
    });
  }


  deleteBanner(idBa:string) {
    this.bannerService.deleteBanner( idBa ).subscribe(
      {
        next: res => {
          console.log(res);
          this.getBanners();
        },
          error: err => {
            console.log(err);
          },
      });
    }

    editBanner(idBa:string) {
      console.log(idBa);
      this.getBanners();
    }



}
