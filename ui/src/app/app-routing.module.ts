import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

import { DashboardComponent } from "./components/dashboard/dashboard.component";
import { RezervacieComponent } from "./components/rezervacie/rezervacie.component";
import { CreateReservationComponent } from "./components/rezervacie/create-reservation/create-reservation.component";
import { BuildingComponent} from "./components/building/building.component";
import { UserComponent } from "./components/user/user.component";
import { SettingsComponent } from "./components/settings/settings.component";


const routes: Routes = [
    {path: 'dashboard-component', component: DashboardComponent},
    {path: 'rezervacie-component', component: RezervacieComponent},
    {path: 'create-reservation-component', component: CreateReservationComponent},
    {path: 'building-component', component: BuildingComponent},
    {path: 'user-component', component: UserComponent},
    {path: 'settings-component', component: SettingsComponent},
    {path: 'create-reservation-component', component: CreateReservationComponent}
];
@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports: [RouterModule]
})



export class AppRoutingModule {}
