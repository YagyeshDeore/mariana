package com.yadnya.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // Unique identifier for the cart

    private User user; // User associated with the cart
    
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CartItem> cartItems = new HashSet<>(); // Set of items in the cart
    
    private double totalSellingPrice; // Total selling price of the cart items
    private int totalItem; // Total number of items in the cart
    private int totalMrpPrice; // Total MRP price of the cart items
    private int discount; // Total discount on the cart items
    private String couponCode; // Coupon code applied to the cart

}
