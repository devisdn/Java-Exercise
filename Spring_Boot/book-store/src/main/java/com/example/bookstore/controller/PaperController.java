package com.example.bookstore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.bookstore.model.Paper;
import com.example.bookstore.repository.PaperRepository;

@RestController
@RequestMapping("/api")
public class PaperController {
    @Autowired
    PaperRepository paperRepository;

    @PostMapping("/paper/create")
    public ResponseEntity<Object> createPaper(@RequestBody Paper paperParam){
        try {
          Paper paper = paperRepository.save(new Paper(
            paperParam.getQualityName(),
            paperParam.getPaperPrice()
          ));
          Map<String, Object> result = new HashMap<String, Object>();
          HttpStatus status = HttpStatus.CREATED;
          result.put("status", "201");
          result.put("message", "Create Data Paper Success.");
          result.put("data", paper);
          return new ResponseEntity<Object>(result, status);
        } catch (Exception e) {
          return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/paper/readAll")
    public ResponseEntity<Object> getAllPaper(){
      try {
        Map<String, Object> result = new HashMap<String, Object>();
        List<Paper> listAllPaper = paperRepository.findAll();
        HttpStatus status = HttpStatus.OK;
        if (listAllPaper.isEmpty()) {
          status = HttpStatus.NOT_FOUND;
          result.put("status", "404");
          result.put("message", "Data paper is empty.");
          result.put("data", listAllPaper);
          return new ResponseEntity<Object>(result, status);
        }
        result.put("status", "200");
        result.put("message", "Read all data paper success.");
        result.put("data", listAllPaper);
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @PutMapping("/paper/update/{paperId}")
    public ResponseEntity<Object> updatepaper(@PathVariable("paperId") long paperId, @RequestBody Paper paper) {
      Optional<Paper> paperData = paperRepository.findById(paperId);
      Map<String, Object> result = new HashMap<String, Object>();
      if (paperData.isPresent()) {
        
        Paper _paper = paperData.get();
        _paper.setQualityName(paper.getQualityName());
        _paper.setPaperPrice(paper.getPaperPrice());
        return new ResponseEntity<>(paperRepository.save(_paper), HttpStatus.OK);
      } else {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        result.put("status", "400");
        result.put("message", "ERROR, no data with id " + paperId);
        
        return ResponseEntity.status(status).body(result);
      }
    }

    @DeleteMapping("/paper/deleteAll")
    public ResponseEntity<Object> deleteAllPaper(){
      try {
        paperRepository.deleteAll();
        Map<String, Object> result = new HashMap<String, Object>();
        HttpStatus status = HttpStatus.OK;
        result.put("status", "200");
        result.put("message", "Delete All data success.");
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @DeleteMapping("/paper/delete/{paperId}")
    public ResponseEntity<Object> deletePaperById(@PathVariable("paperId") Long paperId) {
      try {
        Map<String, Object> result = new HashMap<>();
        Optional<Paper> paper = paperRepository.findById(paperId);
        HttpStatus status;
        if (paper.isPresent()) {
          paperRepository.deleteById(paperId);
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
