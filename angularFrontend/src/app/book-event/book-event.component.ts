import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BookEventService } from './book-event.service'
@Component({
  selector: 'app-book-event',
  templateUrl: './book-event.component.html',
  styleUrls: ['./book-event.component.css']
})
export class BookEventComponent {
  title = 'frontendAngular';

  eventDetails= [];

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
        //  this.eventDetails = resp;
      },
      (err) => {
        console.log(err);
      }
    );
  }
}
