package com.nttdata.trendshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.trendshop.models.CartItem;
import com.nttdata.trendshop.models.Product;
import com.nttdata.trendshop.models.Users;
import com.nttdata.trendshop.services.ProductService;
import com.nttdata.trendshop.services.UsersService;

@RestController
@RequestMapping("/trendshop")
public class ProductController {
	
	
    @Autowired
    private ProductService productService;
    
    
    
    @GetMapping("/searchProducts")
    public List<Product> searchProducts() {
        return productService.findAllProducts();
    }
    
    @PostMapping("/addProductsToCart")
    public void addProductToCart(@RequestBody CartItem cartItem) {
        productService.addProductToCart(cartItem);
    }

    @DeleteMapping("/deleteProductsToCart")
    public void deleteProductFromCart(@RequestParam Long productId) {
        productService.deleteProductFromCart(productId);
    }

    @GetMapping("/cartList")
    public List<CartItem> getCartList() {
        return productService.getCartItems();
    }
}
