package com.nttdata.trendshop.controller;

import com.nttdata.trendshop.models.Products;
import com.nttdata.trendshop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trendshop")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/searchProducts")
    private List<Products> searchProducts(@RequestParam(value = "size", defaultValue = "") String size,@RequestParam(value = "gender", defaultValue = "") String gender){
        return productService.searchProducts(size, gender);
    }


}
