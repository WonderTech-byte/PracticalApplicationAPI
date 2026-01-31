package com.ecommerce.personalpractice.controller;

import com.ecommerce.personalpractice.model.Product;
import com.ecommerce.personalpractice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
        return productService.findByCategory(category);
    }

    @GetMapping("product/price/{price}")
    public List<Product> findByPrice(@PathVariable int price){
        return productService.findByPrice(price);
    }

    @PostMapping("product/save/")
    public Product saveProduct(@RequestBody Product product){
        return productService.create(product);
    }

    @DeleteMapping("product/delete/id/{id}")
    public String deleteProduct(@PathVariable long id){
        return productService.deleteById(id);
    }


}
