import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from 'src/models/user';
import { Observable } from 'rxjs';

@Injectable()
export class UserService {
  private findUrl: string;
  private saveUrl: string;

  constructor(private http: HttpClient)
  {
    this.findUrl = "http://localhost:14430/user/all"
    this.saveUrl = "http://localhost:14430/user/save";
  }

  public findAll(): Observable<User[]>
  {
    return this.http.get<User[]>(this.findUrl);
  }

  public save(user: User)
  {
    return this.http.post<User>(this.saveUrl, user);
  }
}
