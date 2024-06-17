package com.nttdata.trendshop.services;

import com.nttdata.trendshop.models.Products;
import com.nttdata.trendshop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Products> searchProducts(String size,String gender){
        List<Products> prodotti = productRepository.findAll();
        if (!size.isEmpty()){
            prodotti = prodotti.stream().filter(prod -> prod.getSize().equals(size)).collect(Collectors.toList());
        }
        if (!gender.isEmpty()){
            prodotti = prodotti.stream().filter(prod -> prod.getGender().equals(gender)).collect(Collectors.toList());
        }
        return prodotti;
    }

}
