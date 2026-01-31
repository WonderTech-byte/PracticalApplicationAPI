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

    public Product findById(Long id){
        return productRepository.findById(id).get();
    }

    public List<Product> findByName( String name){
        return productRepository.findByNameIgnoreCase(name);
    }

    public List<Product> findByCategory(String category){
        return productRepository.findByDescription(category);
    }

    public List<Product> findByPrice(int price){
        return productRepository.findByPrice(price);
    }

    public Product create(Product product){
        return productRepository.save(product);
    }

    public String deleteById(Long id){
        if(productRepository.findById(id).isPresent()){
            productRepository.deleteById(id);
            return "product deleted successfully";
        }
        return "product not found";
    }
}
