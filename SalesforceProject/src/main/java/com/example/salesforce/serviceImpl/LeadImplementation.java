package com.example.salesforce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.salesforce.entity.Lead;
import com.example.salesforce.exception.EmailAlreadyExistException;
import com.example.salesforce.repository.LeadRepository;
import com.example.salesforce.service.LeadService;

@Service
public class LeadImplementation implements  LeadService {
	
	@Autowired
	private LeadRepository leadRepository;

	@Override
	public String createLead(Lead lead) {
		if (leadRepository.findByEmail(lead.getEmail()) != null) {
			throw new EmailAlreadyExistException("The email is already registered", 409);
		}
		Lead lea =new Lead();
		lea.setName(lead.getName());
		lea.setDateOfBirth(lead.getDateOfBirth());
		lea.setGender(lead.getGender());
		lea.setEmail(lead.getEmail());
		lea.setPhoneNumber(lead.getPhoneNumber());
		leadRepository.save(lea);
		return "Lead Created Successfully" ;
	}

	@Override
	public List<Lead> getLead() {
		List<Lead> leads= leadRepository.findAll();
		for(Lead led:leads) {
		led.getName();
		led.getDateOfBirth();
		led.getGender();
		led.getEmail();
		led.getPhoneNumber();
	
		}
		return leads;
	}

	
	

}
