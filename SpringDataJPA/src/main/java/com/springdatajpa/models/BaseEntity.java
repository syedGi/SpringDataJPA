package com.springdatajpa.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

	@Id
	@GeneratedValue
	private Integer id;
	
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
	
	private String createdBy;
	private String updatedBy;
}
