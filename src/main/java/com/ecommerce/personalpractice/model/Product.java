package com.ecommerce.personalpractice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor
@Entity
public class Product {


    private long id;

    private String name;
    private String description;
    private double price;

}
