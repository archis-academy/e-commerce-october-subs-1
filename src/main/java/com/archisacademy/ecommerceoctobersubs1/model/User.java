package com.archisacademy.ecommerceoctobersubs1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fullname")
    private String fullName;
    @Column(name="username")
    private String userName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="address")
    private String address;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Order> orders;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private Wishlist wishlist;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<CardDetails> cardDetails;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private Cart cart;

}
