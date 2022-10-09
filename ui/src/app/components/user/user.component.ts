import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/services/user.service';
import { User } from 'src/models/user';

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
    this.UserService.findAll().subscribe(data => { this.users = data;})
  }

  onClickMe(event?: MouseEvent)
  {
    const evtMsg = event ? 'Event target is' + (event.target as HTMLElement).className : '';
    alert('Click me' + evtMsg);
  }
}



