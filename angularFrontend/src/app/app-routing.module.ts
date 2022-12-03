import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserComponent } from './user/user.component';
import { BookEventComponent } from './book-event/book-event.component';

import { ViewEventsComponent } from './view-events/view-events.component';
 const routes: Routes = [
      {path:'user' , component: UserComponent},
      {path:'bookeventpage' , component: BookEventComponent},
      {path:'vieweventspage' , component: ViewEventsComponent}
      
    ];

// const routes: Routes = [{path:"bookeventpage" , component: BookEventComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponents = [ UserComponent, BookEventComponent, ViewEventsComponent]
