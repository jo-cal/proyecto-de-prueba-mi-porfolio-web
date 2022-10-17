import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { FormEducacionComponent } from './components/educacion/form-educacion.component';
import { FormExperienciaComponent } from './components/experiencia/form-experiencia.component';
import { FormProyectoComponent } from './components/proyecto/form-proyecto.component';
import { FormAcercaDeComponent } from './components/acerca-de/form-acerca-de.component';
import { FormHabilidadesDurasBlandasComponent } from './components/habilidades-duras-blandas/form-habilidades-duras-blandas.component';
import { FormBannerComponent } from './components/banner/form-banner.component';

const routes: Routes = [
  {path:'', component: HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'nuevoace', component: FormAcercaDeComponent},
  {path:'editace/:id', component: FormAcercaDeComponent},
  {path:'nuevaexp', component: FormExperienciaComponent},
  {path:'editexp/:id', component: FormExperienciaComponent},
  {path:'nuevaedu' , component: FormEducacionComponent},
  {path:'editedu/:id' , component: FormEducacionComponent},
  {path:'nuevopro' , component: FormProyectoComponent},
  {path:'editpro/:id' , component: FormProyectoComponent},
  {path:'nuevahabi' , component: FormHabilidadesDurasBlandasComponent},
  {path:'edithabi/:id' , component: FormHabilidadesDurasBlandasComponent},
  {path:'nuevobanner' , component: FormBannerComponent},
  {path:'editbanner/:id' , component: FormBannerComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
