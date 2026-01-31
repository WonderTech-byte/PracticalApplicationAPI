package com.ecommerce.personalpractice.service;

import com.ecommerce.personalpractice.model.Product;
import com.ecommerce.personalpractice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    public Product findById(Long id){
        return productRepository.findById(id).get();
    }

    public List<Product> findByName( String name){
        return productRepository.findByNameIgnoreCase(name);
    }

    public List<Product> findByCategoryId(String category){
        return productRepository.findByDescription(category);
    }


}
