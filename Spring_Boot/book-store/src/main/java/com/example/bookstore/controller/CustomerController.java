package com.example.bookstore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

import com.example.bookstore.model.Customer;
import com.example.bookstore.repository.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomerController {
  @Autowired
  CustomerRepository customerRepository;

  // Create
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

  // Read
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

  // Update
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
        result.put("message", "Data Updated Successfully.");
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

  // Delete
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
