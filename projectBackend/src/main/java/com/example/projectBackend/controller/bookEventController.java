package com.example.projectBackend.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.projectBackend.service.bookEventService;
import com.example.projectBackend.model.bookEvent;

@RestController
@CrossOrigin(allowedHeaders= "*",origins ="*")
public class bookEventController {
	
	@Autowired
	private bookEventService bookeventService;
	@PostMapping("/registerEvent")
	public bookEvent registerEvent(@RequestBody bookEvent bookevent) {
		return bookeventService.registerEvent(bookevent);
		
	}
	@GetMapping("/getEvents")
	public List<bookEvent> getEvents(){
		return bookeventService.getEvents();
		
	}
	@DeleteMapping("/deleteEvent")
	public void deleteEvent(@RequestParam Integer id) {
		bookeventService.deleteEvent(id);
	}
	@PutMapping("/updateEvent")
	public bookEvent updateEvent(@RequestBody bookEvent bookevent) {
	return bookeventService.updateEvent(bookevent);
		
	}
	
}
