package com.example.bookstore.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
  List<Customer> findByCustomerNameContaining(String customerName);
  List<Customer> findByDateOfBirth(Date dateOfBirth);
  List<Customer> findByCountryContaining(String country);
  List<Customer> findByAddressContaining(String address);
  List<Customer> findByPhoneNumberContaining(String phoneNumber);
  List<Customer> findByPostalCodeContaining(String postalCode);
  List<Customer> findByEmailContaining(String email);
}