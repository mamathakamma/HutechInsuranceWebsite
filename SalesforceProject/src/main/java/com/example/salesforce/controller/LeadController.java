package com.example.salesforce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.salesforce.entity.Lead;
import com.example.salesforce.service.LeadService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1")
public class LeadController {

	@Autowired
	private LeadService  leadService;
	
	@PostMapping("/leadgeneration")
	public String createLead(@RequestBody Lead lead)
	{
		
		return leadService.createLead(lead);
		
	}
	
	@GetMapping("/getLeads")
 	public List<Lead> getLead() {
		
 		return leadService.getLead();
	}
	
}

	
