package com.yadnya.model;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
public class Transaction {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // Unique identifier for the transaction
	
	@ManyToOne 
	private User customer;  // User who made the transaction (assuming User is another entity)
	
	@OneToOne
	private Order order;    // Order associated with the transaction (assuming Order is another entity)
	
	@ManyToOne
	private Seller seller;  // Seller associated with the transaction (assuming Seller is another entity)
	private LocalDateTime date = LocalDateTime.now();
	
}
