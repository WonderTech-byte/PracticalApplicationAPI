package com.ecommerce.personalpractice.repository;
import org.springframework.stereotype.Repository;
import com.ecommerce.personalpractice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

    List<Product> findByNameIgnoreCase(String name);

    List<Product> findByDescription(String description);

    List<Product> findByPrice(int price);

    String deleteProductByid(Long id);




}
