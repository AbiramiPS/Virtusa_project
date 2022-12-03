import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BookEventService } from '../book-event/book-event.service';

@Component({
  selector: 'app-view-events',
  templateUrl: './view-events.component.html',
  styleUrls: ['./view-events.component.css']
})
export class ViewEventsComponent {
  eventDetails :any = null 

  constructor(private bookEventService: BookEventService){
    this.getEventsDetails();

  }  
  register(registerForm: NgForm){
    this.bookEventService.registerEvent(registerForm.value).subscribe(
      (resp) => {
        console.log(resp);
        registerForm.reset();
        this.getEventsDetails();
      },
      (err) => {
        console.log(err);
      }
    );
  }
  getEventsDetails(){
    this.bookEventService.getEvents().subscribe(
      (resp) => {
        console.log(resp);
       this.eventDetails =resp;
            },
      (err) => {
        console.log(err);
      }
    );
  }
  deleteEvent(event: { id: any; }){
    this.bookEventService.deleteEvent(event.id).subscribe(
      (resp) => {
        console.log(resp);
        this.getEventsDetails();
      },
      (err) => {
        console.log(err);
      }
    );
  }

}
