package com.ecommerce.personalpractice.controller;

import com.ecommerce.personalpractice.model.Product;
import com.ecommerce.personalpractice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
