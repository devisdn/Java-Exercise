package com.example.bookstore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @PostMapping("/book/create")
    public ResponseEntity<Object> createBook(@RequestBody Book bookParam){
        try {
            Book book = bookRepository.save(new Book(
              bookParam.getTitle(),
              bookParam.getReleasedDate(),
              bookParam.getAuthor(),
              bookParam.getPublisher(),
              bookParam.getPrice()
            ));
            Map<String, Object> result = new HashMap<String, Object>();
            HttpStatus status = HttpStatus.CREATED;
            result.put("status", "201");
            result.put("message", "Create Data Book Success.");
            result.put("data", book);
            return new ResponseEntity<Object>(result, status);
          } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
          }        
    }

    @GetMapping("/book/readAll")
    public ResponseEntity<Object> getAllBook(){
      try {
        Map<String, Object> result = new HashMap<String, Object>();
        List<Book> listAllBook = bookRepository.findAll();
        HttpStatus status = HttpStatus.OK;
        if (listAllBook.isEmpty()) {
          status = HttpStatus.NOT_FOUND;
          result.put("status", "404");
          result.put("message", "Data paper is empty.");
          result.put("data", listAllBook);
          return new ResponseEntity<Object>(result, status);
        }
        result.put("status", "200");
        result.put("message", "Read all data paper success.");
        result.put("data", listAllBook);
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @PutMapping("/book/update/{bookId}")
    public ResponseEntity<Object> updatepaper(@PathVariable("bookId") long bookId, @RequestBody Book book) {
      Optional<Book> bookData = bookRepository.findById(bookId);
      Map<String, Object> result = new HashMap<String, Object>();
      if (bookData.isPresent()) {
        
        Book _book = bookData.get();
        _book.setTitle(book.getTitle());
        _book.setReleasedDate(book.getReleasedDate());
        _book.setAuthor(book.getAuthor());
        _book.setPublisher(book.getPublisher());
        _book.setPrice(book.getPrice());
        return new ResponseEntity<>(bookRepository.save(_book), HttpStatus.OK);
      } else {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        result.put("status", "400");
        result.put("message", "ERROR, no data with id " + bookId);
        
        return ResponseEntity.status(status).body(result);
      }
    }

    @DeleteMapping("/book/deleteAll")
    public ResponseEntity<Object> deleteAllPaper(){
      try {
        bookRepository.deleteAll();
        Map<String, Object> result = new HashMap<String, Object>();
        HttpStatus status = HttpStatus.OK;
        result.put("status", "200");
        result.put("message", "Delete All data success.");
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @DeleteMapping("/book/delete/{paperId}")
    public ResponseEntity<Object> deletePaperById(@PathVariable("bookId") Long bookId) {
      try {
        Map<String, Object> result = new HashMap<>();
        Optional<Book> book = bookRepository.findById(bookId);
        HttpStatus status;
        if (book.isPresent()) {
          bookRepository.deleteById(bookId);
          status = HttpStatus.OK;
          result.put("status", "200");
          result.put("message", "Delete data success.");
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
