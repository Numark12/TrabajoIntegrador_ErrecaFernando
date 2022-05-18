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
import { NgCircleProgressModule } from 'ng-circle-progress';
import { SkillsComponent } from './components/skills/skills.component';
import { JobBComponent } from './components/exp/job-b/job-b.component';
import { JobCComponent } from './components/exp/job-c/job-c.component';
import { HttpClientModule} from '@angular/common/http';

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
    JobAComponent,
    SkillsComponent,
    JobBComponent,
    JobCComponent
  ], 
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
