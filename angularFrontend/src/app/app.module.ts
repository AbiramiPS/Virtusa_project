import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule, routingComponents} from './app-routing.module';
import { AppComponent } from './app.component';
import { BookEventComponent } from './book-event/book-event.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ViewEventsComponent } from './view-events/view-events.component';
import { UserComponent } from './user/user.component';


@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    UserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule, 
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
