import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { perfil } from '../model/perfil.model';

@Injectable({
  providedIn: 'root'
})
export class PerfilService {
  URL="http://localhost:8080/perfil/" ;
  constructor(private http: HttpClient) { }

  public getPerfil(): Observable<perfil>{
//Este perfil/traer, también puede ser "perfil/traer/perfil"

    return this.http.get<perfil>(this.URL+ 'traer/p1');
  }
}
