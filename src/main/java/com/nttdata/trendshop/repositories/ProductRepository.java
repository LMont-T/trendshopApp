package com.nttdata.trendshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.trendshop.models.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}