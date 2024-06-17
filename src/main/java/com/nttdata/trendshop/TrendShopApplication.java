package com.nttdata.trendshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nttdata.trendshop.models.Product;
import com.nttdata.trendshop.repositories.ProductRepository;

@SpringBootApplication
public class TrendShopApplication{
	
	
    public static void main(String[] args) {
        SpringApplication.run(TrendShopApplication.class, args);
    }
   
}
