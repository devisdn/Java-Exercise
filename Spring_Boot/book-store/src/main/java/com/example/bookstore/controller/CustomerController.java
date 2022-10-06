package com.example.bookstore.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.bookstore.model.Customer;
import com.example.bookstore.repository.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomerController {
  @Autowired
  CustomerRepository customerRepository;

  @PostMapping("/customers")
  public ResponseEntity<Object> createCustomer(@RequestBody Customer customerParam) {
    try {
      Customer customer = customerRepository.save(new Customer(
        customerParam.getCustomerName(),
        customerParam.getDateOfBirth(),
        customerParam.getCountry(),
        customerParam.getAddress(),
        customerParam.getPhoneNumber(),
        customerParam.getPostalCode(),
        customerParam.getEmail()
      ));
      HttpStatus status = HttpStatus.CREATED;
      Map<String, Object> result = new HashMap<>();
      result.put("status", "201");
      result.put("message", "Create customer success.");
      result.put("data", customer);
      return new ResponseEntity<Object>(result, status);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/customers")
  public ResponseEntity<Object> getAllCustomer(){
    try {
      HttpStatus status = HttpStatus.NO_CONTENT;
      Map<String, Object> result = new HashMap<>();
      List<Customer> customers = customerRepository.findAll();
      if (!(customers.isEmpty())) {
        status = HttpStatus.OK;
        result.put("status", "200");
        result.put("message", "Get All Data Success.");
        result.put("data", customers);
        return new ResponseEntity<Object>(result, status);
      }
      return new ResponseEntity<>(status);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PutMapping("/customers/{id}")
  public ResponseEntity<Object> updateCustomer(@PathVariable(value = "id") Long id, @RequestBody Customer customerParam){
    try {
      Map<String, Object> result = new HashMap<>();
      Optional<Customer> customer = customerRepository.findById(id);
      HttpStatus status;
      if (customer.isPresent()) {
        Customer customerData = customer.get();
        customerData.setCustomerName(customerParam.getCustomerName());
        customerData.setDateOfBirth(customerParam.getDateOfBirth());
        customerData.setCountry(customerParam.getCountry());
        customerData.setAddress(customerParam.getAddress());
        customerData.setPhoneNumber(customerParam.getPhoneNumber());
        customerData.setPostalCode(customerParam.getPostalCode());
        customerData.setEmail(customerParam.getEmail());
        result.put("status", "200");
        result.put("message", "Update data success.");
        result.put("data", customerData);
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

  @DeleteMapping("/customers/{id}")
  public ResponseEntity<Object> deleteCustomerById(@PathVariable(value = "id") Long id) {
    try {
      Map<String, Object> result = new HashMap<>();
      Optional<Customer> customer = customerRepository.findById(id);
      HttpStatus status;
      if (customer.isPresent()) {
        customerRepository.deleteById(id);
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
