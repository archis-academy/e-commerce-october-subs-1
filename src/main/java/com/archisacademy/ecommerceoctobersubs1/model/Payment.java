package com.archisacademy.ecommerceoctobersubs1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "payments")
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name="transaction_uuid")
    private UUID transactionUUID;
    @Column(name = "payment_method")
    private String paymentMethod;
    @Column(name = "payment_status")
    private boolean paymentStatus;

}