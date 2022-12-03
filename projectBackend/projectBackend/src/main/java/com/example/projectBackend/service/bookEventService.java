package com.example.projectBackend.service;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.projectBackend.model.bookEvent;
import com.example.projectBackend.repository.bookEventRepository;

@Service
public class bookEventService {
	@Autowired
	private bookEventRepository bookeventRepository;
	
	public bookEvent registerEvent(bookEvent bookevent) {
		return bookeventRepository.save(bookevent);
	}
	public List<bookEvent> getEvents(){
		return (List<bookEvent>) bookeventRepository.findAll();
		
	}
	
	public void deleteEvent(Integer id) {
		bookeventRepository.deleteById(id);
	}
	
	public bookEvent updateEvent(bookEvent bookevent){
		Integer id=  bookevent.getId();
		bookEvent eve = bookeventRepository.findById(id).get();
		eve.setVenue(bookevent.getVenue());
		eve.setApplicantName(bookevent.getApplicantName());
		eve.setApplicantAddress(bookevent.getApplicantAddress());
		eve.setApplicantMobileno(bookevent.getApplicantMobileno());
		eve.setApplicantEmail(bookevent.getApplicantEmail());
		eve.setVenueAddress(bookevent.getVenueAddress());
		eve.setDate(bookevent.getDate());
		eve.setTime(bookevent.getTime());
		eve.setTeamMembers(bookevent.getTeamMembers());
		return bookeventRepository.save(eve);
		
	}

 }

