import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { RezervacieComponent } from './components/rezervacie/rezervacie.component';
import { AppRoutingModule } from './app-routing.module';
import { CreateReservationComponent } from './components/rezervacie/create-reservation/create-reservation.component';
import {UserService} from "../services/user.service";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import { BuildingComponent } from './components/building/building.component';
import { UserComponent } from './components/user/user.component';


import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatMenuModule } from '@angular/material/menu';
import { MatSidenavModule } from '@angular/material/sidenav';
import { NavModule, HeaderModule, AvatarModule, DropdownModule, ButtonModule, SidebarModule} from '@coreui/angular';
import { SettingsComponent } from './components/settings/settings.component';
import { UserDetailComponent } from './components/user/user-detail/user-detail.component';



@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    RezervacieComponent,
    CreateReservationComponent,
    BuildingComponent,
    UserComponent,
    SettingsComponent,
    UserDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatMenuModule,
    NavModule,
    HeaderModule,
    AvatarModule,
    DropdownModule,
    ButtonModule,
    SidebarModule
  
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
