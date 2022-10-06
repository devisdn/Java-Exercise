package com.example.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
  List<Author> findByAuthorFirstNameContaining(String authorFirstName);
  List<Author> findByAuthorLastNameContaining(String authorLastName);
  List<Author> findByGender(String gender);
  List<Author> findByCountryContaining(String country);
  List<Author> findByRating(String rating);
}