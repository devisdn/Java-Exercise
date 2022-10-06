package com.example.bookstore.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.model.Author;
import com.example.bookstore.repository.AuthorRepository;


@RestController
@RequestMapping("/api")
public class AuthorController {
    @Autowired
    AuthorRepository authorRepository;

    @GetMapping("/authors")
    public ResponseEntity<Object> getAllAuthors(){
        try {
            Map<String, Object> result = new HashMap<String, Object>();
            List<Author> authors = authorRepository.findAll();
            HttpStatus status = HttpStatus.NO_CONTENT;
            if (!(authors.isEmpty())) {
              status = HttpStatus.OK;
              result.put("status", "200");
              result.put("message", "Read data success.");
              result.put("data", authors);
              return new ResponseEntity<Object>(result, status);
            }
            return new ResponseEntity<>(status);
          } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }        
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<Object> getAuthorById(@PathVariable(value = "id") Long id){
      try {
        Map<String, Object> result = new HashMap<>();
        Optional<Author> authorData = authorRepository.findById(id);
        HttpStatus status;
  
        if (authorData.isPresent()) {
          status = HttpStatus.OK;
          result.put("status", "200");
          result.put("message", "Read data success.");
          result.put("data", authorData.get());
        } else {
          status = HttpStatus.NOT_FOUND;
          result.put("status", "404");
          result.put("message", "Read data fail, id not found.");
        }
  
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @PostMapping("/authors")
    public ResponseEntity<Object> createAuthor(@RequestBody Author authorParam){
      try {
        Map<String, Object> result = new HashMap<>();
        Author author = authorRepository.save(new Author(
          authorParam.getAuthorFirstName(),
          authorParam.getAuthorLastName(),
          authorParam.getGender(),
          authorParam.getAge(),
          authorParam.getCountry(),
          authorParam.getRating()
        ));
        HttpStatus status = HttpStatus.CREATED;
        result.put("status", "201");
        result.put("message", "Create Data Success!");
        result.put("data", author);
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @PutMapping("/authors/{id}")
    public ResponseEntity<Object> updateAuthor(@PathVariable(value = "id") Long id, @RequestBody Author authorParam){
      try {
        Map<String, Object> result = new HashMap<>();
        Optional<Author> author = authorRepository.findById(id);
        HttpStatus status;
        if (author.isPresent()) {
          Author authorData = author.get();
          authorData.setAuthorFirstName(authorParam.getAuthorFirstName());
          authorData.setAuthorLastName(authorParam.getAuthorLastName());
          authorData.setGender(authorParam.getGender());
          authorData.setAge(authorParam.getAge());
          authorData.setCountry(authorParam.getCountry());
          authorData.setRating(authorParam.getRating());
          authorRepository.save(authorData);
          result.put("status", "200");
          result.put("message", "Data updated successfully.");
          result.put("data", authorData);
          status = HttpStatus.OK;
        } else {
          result.put("status", "404");
          result.put("message", "Update data fail. Data not found.");
          status = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @DeleteMapping("/authors/{id}")
    public ResponseEntity<Object> deleteAuthorById(@PathVariable(value = "id") Long id) {
      try {
        Map<String, Object> result = new HashMap<>();
        Optional<Author> author = authorRepository.findById(id);
        HttpStatus status;
        if (author.isPresent()) {
          authorRepository.deleteById(id);
          status = HttpStatus.OK;
          result.put("status", "200");
          result.put("message", "Data deleted successfully.");
        } else {
          status = HttpStatus.NOT_FOUND;
          result.put("status", "404");
          result.put("message", "Delete data fail. Data not found.");
        }
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    } 
}
