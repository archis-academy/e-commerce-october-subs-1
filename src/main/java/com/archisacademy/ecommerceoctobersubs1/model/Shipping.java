package com.archisacademy.ecommerceoctobersubs1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "shippings")
@Data
public class Shipping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "shipping_address")
    private String shippingAddress;
    @Column(name = "shipping_method")
    private String shippingMethod;
    @Column(name = "tracking_information")
    private String trackingInformation;

}