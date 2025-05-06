package com.yadnya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class OrderItem {

      @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id; // Unique identifier for the order item

        @JsonIgnore
        @ManyToOne
        private Order order; // Order to which this item belongs (assuming Order is another entity)
        private String size; // Size of the item (e.g., "M", "L", "XL")
        private int quantity; // Quantity of the item ordered
        private Integer mrpPrice; // MRP price of the item (before any discounts)
        private Integer sellingPrice; // Selling price of the item (after discounts)
        private long userId; // ID of the user who placed the order (assuming User is another entity)
}
