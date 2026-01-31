package com.ecommerce.personalpractice.controller;

import com.ecommerce.personalpractice.model.Product;
import com.ecommerce.personalpractice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/allProducts")
    public List<Product> allProducts() {
        return productService.findAll();
    }

    @GetMapping("product/id/{id}")
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }

    @GetMapping("product/name/{name}")
    public List<Product> findByName(@PathVariable String name){
        return productService.findByName(name);
    }

    @GetMapping("product/category/{category}")
    public List<Product> findByCategory(@PathVariable String category){
        return productService.findByCategoryId(category);
    }
}
