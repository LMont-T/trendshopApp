package com.nttdata.trendshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nttdata.trendshop.models.Product;
import com.nttdata.trendshop.repositories.ProductRepository;

@SpringBootApplication
public class TrendShopApplication  implements CommandLineRunner{
	
	@Autowired
    private ProductRepository productRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(TrendShopApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product("1", "Product A", 10.0, 100));
        productRepository.save(new Product("2", "Product B", 20.0, 200));
        productRepository.save(new Product("3", "Product C", 30.0, 300));
    }
}
