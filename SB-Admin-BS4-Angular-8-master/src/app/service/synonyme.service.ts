import { Injectable } from '@angular/core';
import{synonyme} from '../models/synonyme';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SynonymeService {
  domaine : string = "http://localhost:8080";
 
  
  constructor(private http : HttpClient) { }
  getsynonyme(): Observable<synonyme[]>{

    return this.http.get<synonyme[]>(`${this.domaine}/api/syn`)
   
  }
  getsyn(i : number): Observable<synonyme[]>{

    return this.http.get<synonyme[]>(`${this.domaine}/api/syn`)
   
  }
  addsynonyme(newsynonyme: synonyme){
   return this.http.post<synonyme>(`${this.domaine}/api/synonyme`, newsynonyme)

  }
  deletesynonyme(id){
    return this.http.delete<synonyme>(`${this.domaine}/api/synonyme/${id}`)

  }
  updatesynonyme(newsynonyme : synonyme){

    return this.http.put(`${this.domaine}/api/synonyme/${newsynonyme._id}`, newsynonyme)
  
  }
}

