import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { LoginUsuario } from '../models/login-usuario';
import { NuevoUsuario } from '../models/nuevo-usuario';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private apiServerUrl=environment.apiBaseUrl;


  /*authURL = 'http://localhost:8080/auth';*/


  constructor( private httpClient: HttpClient   ) { }

  public nuevo(nuevoUsuario: NuevoUsuario):Observable<any>{
    return this.httpClient.post<any>(`${this.apiServerUrl}/api/login/nuevo`,nuevoUsuario);
  }
  public login (loginUsuario: LoginUsuario):Observable<any>{
    return this.httpClient.post<any>(`${this.apiServerUrl}/api/login`,loginUsuario);
  }


  /*public nuevo(nuevoUsuario: NuevoUsuario): Observable<any>{return this.httpClient.post<any>(this.authURL + 'nuevo', nuevoUsuario);}

  public login(loginUsuario: LoginUsuario): Observable<JwtDto>{ return this.httpClient.post<JwtDto>(this.authURL+'login',loginUsuario)}*/




}
