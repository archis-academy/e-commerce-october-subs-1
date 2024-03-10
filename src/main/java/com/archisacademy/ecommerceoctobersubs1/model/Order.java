package com.archisacademy.ecommerceoctobersubs1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "order", fetch = FetchType.LAZY)
    private Shipping shipping;

    @OneToOne(mappedBy = "order", fetch = FetchType.LAZY)
    private Refund refund;

    /// ???????
    @ManyToMany
    @JoinTable(name = "order_product",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;

    @OneToOne(mappedBy = "order", fetch = FetchType.LAZY)
    private Cart cart;
}
