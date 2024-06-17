package com.nttdata.trendshop.services;

import com.nttdata.trendshop.models.Cart;
import com.nttdata.trendshop.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public void addToCart(Cart cart){
        cartRepository.save(cart);
    }
}
