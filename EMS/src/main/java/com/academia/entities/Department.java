package com.academia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Department {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer departmentId;
	private String departmentName;
    private String description;
    
}
