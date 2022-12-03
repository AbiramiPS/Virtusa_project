package com.example.projectBackend.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//import org.hibernate.annotations.GeneratorType;

@Entity

public class bookEvent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String venue;
	private String applicantName;
	private String applicantAddress;
	private Integer applicantMobileno;
	private String applicantEmail;
	private String venueAddress;
	private String date;
	private String time;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getVenue() {
		return venue;
	}


	public void setVenue(String venue) {
		this.venue = venue;
	}


	public String getApplicantName() {
		return applicantName;
	}


	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}


	public String getApplicantAddress() {
		return applicantAddress;
	}


	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}


	public Integer getApplicantMobileno() {
		return applicantMobileno;
	}


	public void setApplicantMobileno(Integer applicantMobileno) {
		this.applicantMobileno = applicantMobileno;
	}


	public String getApplicantEmail() {
		return applicantEmail;
	}


	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}


	public String getVenueAddress() {
		return venueAddress;
	}


	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public Integer getTeamMembers() {
		return teamMembers;
	}


	public void setTeamMembers(Integer teamMembers) {
		this.teamMembers = teamMembers;
	}


	private Integer teamMembers ;
}
