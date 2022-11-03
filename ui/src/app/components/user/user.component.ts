import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/services/user.service';
import { User } from 'src/models/user';
import { environment } from 'src/environments/environment';
import { Data } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  users: User[];
  clickMessage = '';
  constructor(private  UserService: UserService) { }

  ngOnInit(): void {
    this.UserService.getUsers().subscribe((data: User []) =>
    {
      this.users = data;
    });
  }
}



