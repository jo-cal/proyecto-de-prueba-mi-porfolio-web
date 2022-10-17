import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { HabilidadesDurasYBlandas } from '../models/habilidades';

@Injectable({
  providedIn: 'root'
})
export class HabilidadesService {
  private apiServerUrl=environment.apiBaseUrl;
  constructor(private http: HttpClient) { }

getHabilidadesDurasYBlandasss() { return this.http.get(`${this.apiServerUrl}/api/habilidadesdurasyblandas/all`); }

getHabilidadesDurasYBlandas(id:string | number| undefined):Observable<HabilidadesDurasYBlandas>{return this.http.get<HabilidadesDurasYBlandas>(`${this.apiServerUrl}/api/habilidadesdurasyblandas/${id}`); }

saveHabilidadesDurasYBlandas( habilidadesdurasyblandas: HabilidadesDurasYBlandas )  {return this.http.post(`${this.apiServerUrl}/api/habilidadesdurasyblandas/add`, habilidadesdurasyblandas);}

updateHabilidadesDurasYBlandas( id:(string | number | undefined) , updateHabilidadesDurasYBlandas : HabilidadesDurasYBlandas ): Observable<HabilidadesDurasYBlandas>  {
  return this.http.put(`${this.apiServerUrl}/api/habilidadesdurasyblandas/update/${id}`, updateHabilidadesDurasYBlandas); }

deleteHabilidadesDurasYBlandas(id: string|number|undefined )  {return this.http.delete(`${this.apiServerUrl}/api/habilidadesdurasyblandas/delete/${id}`); }  }


