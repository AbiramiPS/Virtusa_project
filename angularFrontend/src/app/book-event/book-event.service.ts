import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookEventService {

  constructor(private http: HttpClient) { }

  API='http://localhost:3030';
  public registerEvent(eventData: any){
    return this.http.post(this.API+ '/registerEvent', eventData);
  }

  public getEvents(){
    return this.http.get(this.API + '/getEvents');
  }

  public deleteEvent(id: any){
    return this.http.delete(this.API + '/deleteEvent?id=' +id)
  }

  public updateEvent(bookevent: any){
    return this.http.put(this.API + '/updateEvent', bookevent);
  }
}
 