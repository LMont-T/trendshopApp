package com.nttdata.trendshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.trendshop.models.CartItem;
import com.nttdata.trendshop.models.Product;
import com.nttdata.trendshop.repositories.CartItemRepository;
import com.nttdata.trendshop.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public void addProductToCart(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }

    public void deleteProductFromCart(Long productId) {
        CartItem cartItem = cartItemRepository.findByProductId(productId);
        if (cartItem != null) {
            cartItemRepository.delete(cartItem);
        }
    }

    public List<CartItem> getCartItems() {
        return cartItemRepository.findAll();
    }
}
