package com.example.base.repository;

import com.example.base.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    boolean existsByEmail(String email);
}
