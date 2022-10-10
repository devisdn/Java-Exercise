package com.example.bookstore.repository;

/* import java.util.Date;
import java.util.List; */

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
/*   List<Customer> findByCustomerName(String customerName);
  List<Customer> findByDateOfBirth(Date dateOfBirth);
  List<Customer> findByCountry(String country);
  List<Customer> findByAddress(String address);
  List<Customer> findByPhoneNumber(String phoneNumber);
  List<Customer> findByPostalCode(String postalCode);
  List<Customer> findByEmail(String email); */
}