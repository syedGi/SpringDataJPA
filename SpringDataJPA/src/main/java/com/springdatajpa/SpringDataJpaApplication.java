package com.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springdatajpa.models.Author;
import com.springdatajpa.repository.AuthorRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
	
//	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository) {
		return args->{
			var author = Author.builder()
						.firstName("Mohamed")
						.lastName("Ameen")
						.age(34)
						.email("mdameen089@gmail.com")
						.build();
			repository.save(author);
		};
	}

}
