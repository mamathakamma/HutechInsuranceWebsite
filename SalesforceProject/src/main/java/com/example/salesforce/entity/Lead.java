package com.example.salesforce.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "lead")
@AllArgsConstructor
@NoArgsConstructor
public class Lead {
 
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
	    private String name;
	    private LocalDate dateOfBirth;
	    private String phoneNumber;
	    private Boolean gender;
	    private String email;
	
}
