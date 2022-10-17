import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TokenService } from 'src/app/servicios/token.service';

@Component({
  selector: 'app-logo-argentina-programa',
  templateUrl: './logo-argentina-programa.component.html',
  styleUrls: ['./logo-argentina-programa.component.css']
})
export class LogoArgentinaProgramaComponent implements OnInit {

  isLogged= false;

  constructor( private router:Router,private tokenService: TokenService  ) { }

  ngOnInit(): void {

    if(this.tokenService.getToken()){
      this.isLogged=true;
    }else{
      this.isLogged=false;
    }
  }
  login(){
    this.router.navigate(['/login'])
  }
  onLogOut():void{
    this.tokenService.logOut();
    window.location.reload();
  }

  }


