import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from 'src/models/user';
import { Observable } from 'rxjs';

@Injectable()
export class UserService {
  private usersUrl: string;

  constructor(private http: HttpClient)
  {
    this.usersUrl = "http://localhost:14430/user/all"
  }

  public findAll(): Observable<User[]>
  {
    return this.http.get<User[]>(this.usersUrl);
  }



}
