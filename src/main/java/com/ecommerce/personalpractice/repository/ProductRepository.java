package com.ecommerce.personalpractice.repository;
import org.springframework.stereotype.Repository;
import com.ecommerce.personalpractice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

}
