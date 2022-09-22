import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

import { CreateReservationComponent } from "./create-reservation/create-reservation.component";



const routes: Routes = [
    
    {path: 'create-reservation-component', component: CreateReservationComponent}
];
@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports: [RouterModule]
})



export class RezervacieRoutingModule {}