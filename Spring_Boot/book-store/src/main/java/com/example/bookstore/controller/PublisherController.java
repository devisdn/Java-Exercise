package com.example.bookstore.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.bookstore.dtos.PaperDTO;
import com.example.bookstore.dtos.PublisherDTO;
import com.example.bookstore.model.Publisher;
import com.example.bookstore.repository.PublisherRepository;

@RestController
@RequestMapping("/api")
public class PublisherController {
    @Autowired
    PublisherRepository publisherRepository;

    @PostMapping("/publishers/create")
    public ResponseEntity<Object> createPublisher(@RequestBody Publisher publisherParam){
      try {
        Publisher publisher = publisherRepository.save(new Publisher(
          publisherParam.getCompanyName(),
          publisherParam.getCountry(),
          publisherParam.getPaper()
        ));
        Map<String, Object> result = new HashMap<String, Object>();
        HttpStatus status = HttpStatus.CREATED;
        result.put("status", "201");
        result.put("message", "Create Publisher Success.");
        result.put("data", publisher);
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
    
    @GetMapping("/publishers/read")
    public ResponseEntity<Object> getAllPublisherMap(){
        Map<String, Object> result = new HashMap<String, Object>();
        List<Publisher> listAllPublisher = publisherRepository.findAll();
        List<PublisherDTO> listAllPublisherDTO = new ArrayList<PublisherDTO>();
        
        for (Publisher publisherEntity : listAllPublisher) {
            PublisherDTO publisherDTO = new PublisherDTO();
            publisherDTO.setPublisherId(publisherEntity.getPublisherId());
            publisherDTO.setCompanyName(publisherEntity.getCompanyName());
            publisherDTO.setCountry(publisherEntity.getCountry());
            
            PaperDTO paperDTO = new PaperDTO();
            paperDTO.setPaperId(publisherEntity.getPaper().getPaperId());
            paperDTO.setQualityName(publisherEntity.getPaper().getQualityName());
            paperDTO.setPaperPrice(publisherEntity.getPaper().getPaperPrice());
            
            publisherDTO.setPaper(paperDTO);
            listAllPublisherDTO.add(publisherDTO);
        }
        
        if (listAllPublisher.isEmpty()) {
            result.put("status", "404");
            result.put("message", "No DATA");
            result.put("data", listAllPublisherDTO);
            result.put("total", listAllPublisherDTO.size());
            HttpStatus status = HttpStatus.NOT_FOUND;
            return new ResponseEntity<Object>(result, status);
        }else {
            result.put("status", "200");
            result.put("message", "Read All data Publisher Success.");
            result.put("data", listAllPublisherDTO);
            result.put("total", listAllPublisherDTO.size());
            HttpStatus status = HttpStatus.OK;
            return new ResponseEntity<Object>(result, status);
        }
    }

    @PutMapping("/publishers/update/{publisherId}")
    public ResponseEntity<Object> updatePublisher(@PathVariable("publisherId") long publisherId, @RequestBody Publisher publisher) {
      Optional<Publisher> publisherData = publisherRepository.findById(publisherId);
      Map<String, Object> result = new HashMap<String, Object>();
      if (publisherData.isPresent()) {
        
        Publisher _publisher = publisherData.get();
        _publisher.setCompanyName(publisher.getCompanyName());
        _publisher.setCountry(publisher.getCountry());
        _publisher.setPaper(publisher.getPaper());
        return new ResponseEntity<>(publisherRepository.save(_publisher), HttpStatus.OK);
      } else {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        result.put("status", "400");
        result.put("message", "ERROR, no data with id " + publisherId);
        
        return ResponseEntity.status(status).body(result);
      }
    }

    @DeleteMapping("/publishers/deleteAll")
    public ResponseEntity<Object> deleteAllPublisher(){
      try {
        publisherRepository.deleteAll();
        Map<String, Object> result = new HashMap<>();
        HttpStatus status = HttpStatus.OK;
        result.put("status", "200");
        result.put("message", "Delete All data success.");
        return new ResponseEntity<Object>(result, status);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    @DeleteMapping("/publishers/delete/{publisherId}")
    public ResponseEntity<Object> deletePublisherById(@PathVariable(value = "publisherId") Long publisherId) {
      try {
        Map<String, Object> result = new HashMap<>();
        Optional<Publisher> publisher = publisherRepository.findById(publisherId);
        HttpStatus status;
        if (publisher.isPresent()) {
          publisherRepository.deleteById(publisherId);
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
