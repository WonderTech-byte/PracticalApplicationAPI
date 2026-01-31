package com.ecommerce.personalpractice.service;

import com.ecommerce.personalpractice.model.Product;
import com.ecommerce.personalpractice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void  saveProduct(Product product) {
        productRepository.save(product);
    }


}
