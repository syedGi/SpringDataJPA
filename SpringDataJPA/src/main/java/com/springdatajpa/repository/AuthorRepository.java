package com.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
