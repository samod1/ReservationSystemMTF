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


@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    RezervacieComponent,
    CreateReservationComponent,
    BuildingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
