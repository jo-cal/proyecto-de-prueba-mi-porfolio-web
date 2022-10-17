import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Banner } from '../models/banner';

@Injectable({
  providedIn: 'root'
})
export class BannerService {
  private apiServerUrl=environment.apiBaseUrl;
  constructor(private http: HttpClient) { }

getBanners() { return this.http.get(`${this.apiServerUrl}/api/banner/all`); }

getBanner(id:string | number| undefined):Observable<Banner>{return this.http.get<Banner>(`${this.apiServerUrl}/api/banner/${id}`); }

saveBanner( banner: Banner )  {return this.http.post(`${this.apiServerUrl}/api/banner/add`, banner);}

updateBanner( id:(string | number | undefined) , updateBanner: Banner ): Observable<Banner>  {
return this.http.put(`${this.apiServerUrl}/api/banner/update/${id}`, updateBanner); }

deleteBanner(id: string|number|undefined )  {return this.http.delete(`${this.apiServerUrl}/api/banner/delete/${id}`); }  }



