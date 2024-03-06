package com.archisacademy.ecommerceoctobersubs1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name="order_number")
    private Long orderNumber;
    @Column(name="date")
    private LocalDate date;
    @Column(name="total_amount")
    private double totalAmount;
    @Column(name="status")
    private String status;

}
