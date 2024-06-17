package com.nttdata.trendshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.trendshop.models.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    CartItem findByProductId(Long productId);
}