package com.example.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore.model.Reviewer;

@Repository
public interface ReviewerRepository extends JpaRepository<Reviewer, Long>{
  
}
