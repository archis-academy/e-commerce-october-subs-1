package com.archisacademy.ecommerceoctobersubs1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name="product_name")
    private String productName;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private int price;
    @Column(name="stock_quantity")
    private int stockQuantity;
    @Column(name="product_image")
    private String productImage;

}
