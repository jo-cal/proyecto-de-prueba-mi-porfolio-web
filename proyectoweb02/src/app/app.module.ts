import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'; //nos sirve para hacer la comunicación entre fron y el back
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoArgentinaProgramaComponent } from './components/logo-argentina-programa/logo-argentina-programa.component';
import { BannerComponent } from './components/banner/banner.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HabilidadesDurasBlandasComponent } from './components/habilidades-duras-blandas/habilidades-duras-blandas.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { FormEducacionComponent } from './components/educacion/form-educacion.component';
import { FormExperienciaComponent } from './components/experiencia/form-experiencia.component';
import { FormHabilidadesDurasBlandasComponent } from './components/habilidades-duras-blandas/form-habilidades-duras-blandas.component';
import { FormAcercaDeComponent } from './components/acerca-de/form-acerca-de.component';
import { ProyectoComponent } from './components/proyecto/proyecto.component';
import { FormProyectoComponent } from './components/proyecto/form-proyecto.component';
import { FormBannerComponent } from './components/banner/form-banner.component';





@NgModule({
  declarations: [
    AppComponent,
    AcercaDeComponent,
    HeaderComponent,
    LogoArgentinaProgramaComponent,
    BannerComponent,
    ExperienciaComponent,
    EducacionComponent,
    HabilidadesDurasBlandasComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    FormEducacionComponent,
    FormExperienciaComponent,
    FormHabilidadesDurasBlandasComponent,
    FormAcercaDeComponent,
    ProyectoComponent,
    FormProyectoComponent,
    FormBannerComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgCircleProgressModule.forRoot({})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
