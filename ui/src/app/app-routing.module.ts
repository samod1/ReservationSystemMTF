import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

import { DashboardComponent } from "./components/dashboard/dashboard.component";
import { RezervacieComponent } from "./components/rezervacie/rezervacie.component";
import { CreateReservationComponent } from "./components/rezervacie/create-reservation/create-reservation.component";



const routes: Routes = [
    {path: 'dashboard-component', component: DashboardComponent},
    {path: 'rezervacie-component', component: RezervacieComponent},
    {path: 'create-reservation-component', component: CreateReservationComponent}
];
@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports: [RouterModule]
})



export class AppRoutingModule {}