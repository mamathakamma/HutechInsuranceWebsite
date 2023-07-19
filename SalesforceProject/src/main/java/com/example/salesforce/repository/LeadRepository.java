package com.example.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.salesforce.entity.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Integer> {

	Lead findByEmail(String email);


	
}
