import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/services/user.service';
import { User} from "../../../models/user";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  users: User[];
  clickMessage = '';
  constructor(private  UserService: UserService) { }

  ngOnInit() {

   this.UserService.findAll().subscribe(data => { this.users = data;})
  }

  onClickMe(event?: MouseEvent)
  {
    const evtMsg = event ? 'Event target is' + (event.target as HTMLElement).className : '';
    alert('Click me' + evtMsg);
  }
}
