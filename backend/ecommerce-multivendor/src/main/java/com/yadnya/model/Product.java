package com.yadnya.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class Product {
    @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private long id; // Unique identifier for the cart
       private String title; // Title of the product
       private String description; // Description of the product
       private int mrpPrice; // MRP price of the product
       private int sellingPrice; // Selling price of the product
       private int discountPercent; // Discount percentage on the product
       private int quantity; // Quantity of the product available
       private String color; // Color of the product (if applicable)
       private List<String> images = new ArrayList<>(); // List of image URLs for the product
       private int numRatings; // Number of ratings for the product

       @ManyToOne
       private Category category; // Category of the product (e.g., Electronics, Clothing, etc.)
       

       @ManyToOne
       private Seller seller; // Seller associated with the product
       private LocalDateTime createdAt; // Date and time when the product was created

       //@ElementCollection
       private String Sizes;
       
       @OneToMany(mappedBy = "product", cascade = jakarta.persistence.CascadeType.ALL, orphanRemoval = true)
       private List<Review> reviews = new ArrayList<>(); // List of reviews for the product


}
