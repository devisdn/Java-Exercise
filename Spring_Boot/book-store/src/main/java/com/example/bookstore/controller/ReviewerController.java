package com.example.bookstore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.bookstore.model.Reviewer;
import com.example.bookstore.repository.ReviewerRepository;

@RestController
@RequestMapping("/api")
public class ReviewerController {
    @Autowired
    ReviewerRepository reviewerRepository;

    @PostMapping("/reviewer/create")
    public ResponseEntity<Object> createReviewer(@RequestBody Reviewer reviewerParam){
        try {
          Reviewer reviewer = reviewerRepository.save(new Reviewer(
            reviewerParam.getReviewerName(),
            reviewerParam.getCountry(),
            reviewerParam.getVerified()
          ));
          Map<String, Object> result = new HashMap<String, Object>();
          HttpStatus status = HttpStatus.CREATED;
          result.put("status", "201");
          result.put("message", "Create Data Reviewer Success.");
          result.put("data", reviewer);
          return new ResponseEntity<Object>(result, status);
        } catch (Exception e) {
          return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/reviewer/readAll")
    public ResponseEntity<Object> getAllReviewer(){
      try {
        Map<String, Object> result = new HashMap<String, Object>();
        List<Reviewer> listAllReviewer = reviewerRepository.findAll();
        HttpStatus status = HttpStatus.OK;
        if (listAllReviewer.isEmpty()) {
          status = HttpStatus.NOT_FOUND;
          result.put("status", "404");
          result.put("message", "Data Reviewer is empty.");
          result.put("data", listAllReviewer);
          return new ResponseEntity<Object>(result, status);
        }
        result.put("status", "200");
        result.put("message", "Read all data Reviewer success.");
        result.put("data", listAllReviewer);
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @PutMapping("/reviewer/update/{reviewerId}")
    public ResponseEntity<Object> updateReviewer(@PathVariable("reviewerId") long reviewerId, @RequestBody Reviewer reviewer) {
      Optional<Reviewer> reviewerData = reviewerRepository.findById(reviewerId);
      Map<String, Object> result = new HashMap<String, Object>();
      if (reviewerData.isPresent()) {
        
        Reviewer _reviewer = reviewerData.get();
        _reviewer.setReviewerName(reviewer.getReviewerName());
        _reviewer.setCountry(reviewer.getCountry());
        _reviewer.setVerified(reviewer.getVerified());
        return new ResponseEntity<>(reviewerRepository.save(_reviewer), HttpStatus.OK);
      } else {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        result.put("status", "400");
        result.put("message", "ERROR, no data with id " + reviewerId);
        
        return ResponseEntity.status(status).body(result);
      }
    }

    @DeleteMapping("/reviewer/deleteAll")
    public ResponseEntity<Object> deleteAllReviewer(){
      try {
        reviewerRepository.deleteAll();
        Map<String, Object> result = new HashMap<String, Object>();
        HttpStatus status = HttpStatus.OK;
        result.put("status", "200");
        result.put("message", "Delete All data success.");
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @DeleteMapping("/reviewer/delete/{reviewerId}")
    public ResponseEntity<Object> deleteReviewerById(@PathVariable("reviewerId") Long reviewerId) {
      try {
        Map<String, Object> result = new HashMap<>();
        Optional<Reviewer> Reviewer = reviewerRepository.findById(reviewerId);
        HttpStatus status;
        if (Reviewer.isPresent()) {
          reviewerRepository.deleteById(reviewerId);
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
