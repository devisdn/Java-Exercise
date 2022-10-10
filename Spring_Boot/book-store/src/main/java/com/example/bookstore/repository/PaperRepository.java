package com.example.bookstore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore.model.Paper;

@Repository
public interface PaperRepository extends JpaRepository<Paper, Long>{
  
}