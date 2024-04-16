package com.java.sport.repository;

import com.java.sport.model.Product; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> { // Rename interface to ProductRepository
}

