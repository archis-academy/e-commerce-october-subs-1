package com.archisacademy.ecommerceoctobersubs1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "card_details")
@Data
public class CardDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "card_holder_name")
    private String cardHolderName;
    @Column(name = "expiration_month")
    private Integer expirationMonth;
    @Column(name = "expiration_year")
    private Integer expirationYear;
    @Column(name = "cvv")
    private String cvv;
    @Column(name = "card_type")
    private String cardType;
    @Column(name = "is_active")
    private Boolean isActive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}