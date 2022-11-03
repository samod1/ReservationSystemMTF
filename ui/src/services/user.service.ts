import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from 'src/models/user';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({providedIn: 'root'})
export class UserService {
  private allUsersUrl = "http://localhost:14430/user"
  private saveUrl: string;

  /*Konstruktor */
  constructor(private httpClient: HttpClient){}

  getUsers(): Observable<User[]>{
    return this.httpClient.get<User[]>(`${this.allUsersUrl}`);
  }


}
