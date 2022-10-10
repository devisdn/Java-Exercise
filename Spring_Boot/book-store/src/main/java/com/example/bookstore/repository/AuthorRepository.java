package com.example.bookstore.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
/*   List<Author> findByAuthorFirstName(String authorFirstName);
  List<Author> findByAuthorLastName(String authorLastName);
  List<Author> findByGender(String gender);
  List<Author> findByCountry(String country);
  List<Author> findByRating(String rating); */
}