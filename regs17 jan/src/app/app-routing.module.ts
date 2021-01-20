import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthGaurdService } from './auth-gaurd.service';
import { LoginComponent } from './login/login.component';
import { LoginsuccessComponent } from './loginsuccess/loginsuccess.component';
import { LogoutComponent } from './logout/logout.component';
import { PreviewpageComponent } from './previewpage/previewpage.component';
import { RegistrationComponent } from './registration/registration.component';
import { SubmitsuccessComponent } from './submitsuccess/submitsuccess.component';


const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'loginsuccess', component: LoginsuccessComponent, canActivate: [AuthGaurdService] },
  { path: 'registration', component: RegistrationComponent },
  { path: 'login', component: LoginComponent },
  { path: 'logout', component: LogoutComponent, canActivate: [AuthGaurdService] },
  { path: 'previewpage', component: PreviewpageComponent, canActivate: [AuthGaurdService] },
  { path: 'submitsuccess', component: SubmitsuccessComponent, canActivate: [AuthGaurdService] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
