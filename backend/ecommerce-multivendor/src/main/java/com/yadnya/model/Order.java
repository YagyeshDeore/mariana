package com.yadnya.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Order {
    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id; // Unique identifier for the order
    
        private String orderId; // Unique identifier for the order (e.g., "ORD12345")

        @ManyToOne
        private User user; // User who placed the order (assuming User is another entity)

        private Long sellerId; // ID of the seller associated with the order (assuming Seller is another entity)

        @OneToMany(mappedBy = "order",cascade = CascadeType.ALL, orphanRemoval = true)
        private List<OrderItem> orderItems = new ArrayList<>(); // List of items in the order (assuming OrderItem is another entity)
        
        @ManyToOne
        private Address shippingAddress; // Shipping address for the order (assuming Address is another entity)

        @Embedded
        private PaymentDetails paymentDetails = new PaymentDetails  ; // Payment details for the order (assuming Payment is another entity)
        // private String orderStatus; // Status of the order (e.g., "Pending", "Shipped", "Delivered")
        // private String paymentStatus; // Status of the payment (e.g., "Paid", "Pending", "Failed")
        // private String paymentMethod; // Method of payment (e.g., "Credit Card", "PayPal")
        // private String deliveryAddress; // Address where the order will be delivered
    
}
