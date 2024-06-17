package com.nttdata.trendshop.controller;

import com.nttdata.trendshop.models.Cart;
import com.nttdata.trendshop.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trendshop")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/addToCart")
    public void addToCart(@RequestBody Cart cart){
        cartService.addToCart(cart);
    }


}
