package com.archisacademy.ecommerceoctobersubs1.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "payments")
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name="transaction_uuid")
    private String transactionUUID;
    @Column(name = "payment_method")
    private String paymentMethod;
    @Column(name = "payment_status")
    private boolean paymentStatus;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
