import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Educacion } from '../models/educacion';

@Injectable({providedIn: 'root'})

export class EducacionService {
  private apiServerUrl=environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

//los métodos:para traer la lista de Educacion

getEducaciones() { return this.http.get(`${this.apiServerUrl}/api/educacion/all`); }

getEducacion(id:string | number| undefined):Observable<Educacion>{return this.http.get<Educacion>(`${this.apiServerUrl}/api/educacion/${id}`); }

saveEducacion( educacion: Educacion )  {return this.http.post(`${this.apiServerUrl}/api/educacion/add`, educacion);}

updateEducacion( id:(string | number | undefined) , updateEducacion: Educacion ): Observable<Educacion>  {
    return this.http.put(`${this.apiServerUrl}/api/educacion/update/${id}`, updateEducacion); }

deleteEducacion(id: string|number|undefined )  {return this.http.delete(`${this.apiServerUrl}/api/educacion/delete/${id}`); }

}
