import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { SocialComponent } from './components/social/social.component';
import { MainComponent } from './components/main/main.component';
import { BannerComponent } from './components/banner/banner.component';
import { ProfileComponent } from './components/profile/profile.component';
import { AboutComponent } from './components/about/about.component';
import { ExpMainComponent } from './components/exp/exp-main/exp-main.component';
import { JobAComponent } from './components/exp/job-a/job-a.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SocialComponent,
    MainComponent,
    BannerComponent,
    ProfileComponent,
    AboutComponent,
    ExpMainComponent,
    JobAComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
