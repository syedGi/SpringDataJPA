package com.springdatajpa.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Course extends BaseEntity{

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
	
	private String title;
	private String description;
	
	@ManyToMany
	@JoinTable( name="course_author",
			joinColumns = {@JoinColumn(name="course_id")},
			inverseJoinColumns = {@JoinColumn(name="author_id")}			
	)
	private List<Author> authors;
	
	
	private List<Section> sections;
}
