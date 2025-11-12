package com.example.nxttrendz.repository;

import com.example.nxttrendz.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByPrimeDealTrue();
}
