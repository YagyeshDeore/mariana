package com.yadnya.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class CartItem {
   
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private long id; // Unique identifier for the cart

       private Product product; // Product associated with the cart item
       private String size; // Size of the product (if applicable)
       private int quantity = 1; // Quantity of the product in the cart item
       private Integer sellingPrice; // Selling price of the product
       private Integer mrpPrice; // MRP price of the product
       private long userId; // User ID associated with the cart item
}
