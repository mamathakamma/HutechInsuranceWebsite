package com.example.salesforce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.salesforce.entity.Lead;

@Service
public interface LeadService {

 	public String createLead(Lead lead);
 	
 	
 	public List<Lead> getLead();
}
