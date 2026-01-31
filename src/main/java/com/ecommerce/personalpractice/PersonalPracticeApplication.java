package com.ecommerce.personalpractice;

import com.ecommerce.personalpractice.model.Product;
import com.ecommerce.personalpractice.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PersonalPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalPracticeApplication.class, args);


    }

    @Bean
    CommandLineRunner loadData(ProductService productService) {
        return args -> {
            productService.create(new Product(0, "Laptop", "Gaming Laptop", 1500.0));
            productService.create(new Product(0, "Phone", "Smartphone", 800.0));
            productService.create(new Product(0, "Headphones", "Noise Cancelling", 200.0));

            System.out.println("Dummy products added!");
        };
    }

}
