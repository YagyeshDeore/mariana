package com.yadnya.model;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDateTime;

import com.yadnya.domain.OrderStatus;
import com.yadnya.domain.PaymentStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name="orders")
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
        private PaymentDetails paymentDetails = new PaymentDetails(); // Payment details for the order (assuming Payment is another entity)
        
        private double totalMrpPrice; // Total MRP price of the order (before any discounts)
        private Integer totalSellingPrice; // Total selling price of the order (after discounts)
        private Integer discount; // Total discounts applied to the order
        private OrderStatus orderStatus; // Status of the order (e.g., "Pending", "Shipped", "Delivered")
        private int totalItem;  // Total number of items in the order
        private PaymentStatus paymentStatus = PaymentStatus.PENDING; // Status of the payment (e.g., "Paid", "Pending", "Failed")
        private LocalDateTime orderDate = LocalDateTime.now(); // Date and time when the order was placed
        private LocalDateTime deliverDate = orderDate.plusDays(7); // Estimated delivery date (7 days from order date)
        
        
        
        // private String orderStatus; // Status of the order (e.g., "Pending", "Shipped", "Delivered")
        // private String paymentStatus; // Status of the payment (e.g., "Paid", "Pending", "Failed")
        // private String paymentMethod; // Method of payment (e.g., "Credit Card", "PayPal")
        // private String deliveryAddress; // Address where the order will be delivered
    
}
