package com.yadnya.model;

import java.util.HashSet;
import java.util.Set;

import com.yadnya.domain.AccountStatus;
import com.yadnya.domain.PaymentMethod;
import com.yadnya.domain.PaymentOrderStatus;
import com.yadnya.domain.USER_ROLE;

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
public class PaymentOrder {
	  
	  @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
	  private Long amount;
	  private PaymentOrderStatus Status = PaymentOrderStatus.PENDING;
	  
	  private PaymentMethod paymentMethod;
	  
	  private String paymentLinkId;
	  
	  @ManyToOne
	  private User user;
	  private Set<Order> orders = new HashSet<>();
	  
}
 