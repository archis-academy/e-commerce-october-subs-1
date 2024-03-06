package com.archisacademy.ecommerceoctobersubs1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "refunds")
@Data
public class Refund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "refund_address")
    private String refundAddress;
    @Column(name = "reason")
    private String reason;
    @Column(name = "refund_date")
    private LocalDate refundDate;

}
