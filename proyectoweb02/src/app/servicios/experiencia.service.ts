import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Experiencia } from '../models/experiencia';

@Injectable({
  providedIn: 'root'
})
export class ExperienciaService {

  private apiServerUrl=environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

//los métodos:para traer la lista de Educacion

getExperiencias() { return this.http.get(`${this.apiServerUrl}/api/experiencia/all`); }

getExperiencia(id:string | number| undefined):Observable<Experiencia>{return this.http.get<Experiencia>(`${this.apiServerUrl}/api/experiencia/${id}`); }

saveExperiencia( experiencia: Experiencia )  {return this.http.post(`${this.apiServerUrl}/api/experiencia/add`, experiencia);}

updateExperiencia( id:(string | number | undefined) , updateExperiencia: Experiencia ): Observable<Experiencia>  {
    return this.http.put(`${this.apiServerUrl}/api/experiencia/update/${id}`, updateExperiencia); }

deleteExperiencia(id: string|number|undefined )  {return this.http.delete(`${this.apiServerUrl}/api/experiencia/delete/${id}`); }

}
