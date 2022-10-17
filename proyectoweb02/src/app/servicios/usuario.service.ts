import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Usuario } from '../models/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  private apiServerUrl=environment.apiBaseUrl;  //apiBaseUrl: 'http://localhost:8080'

  constructor(private http: HttpClient) { }

getUsuarios() { return this.http.get(`${this.apiServerUrl}/api/usuario/all`); }

getUsuario(id:string | number| undefined):Observable<Usuario>{return this.http.get<Usuario>(`${this.apiServerUrl}/api/usuario/${id}`); }

saveUsuario(usuario: Usuario  )  {return this.http.post(`${this.apiServerUrl}/api/usuario/add`, usuario);}

updateUsuario( id:(string | number | undefined) , updateUsuario : Usuario ): Observable<Usuario>  {
return this.http.put(`${this.apiServerUrl}/api/usuario/update/${id}`, updateUsuario); }

deleteUsuario(id: string|number|undefined )  {return this.http.delete(`${this.apiServerUrl}/api/usuario/delete/${id}`); }  }








