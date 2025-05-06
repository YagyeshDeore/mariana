package com.yadnya.model;



import org.springframework.security.authentication.AccountStatusException;

import com.yadnya.domain.AccountStatus;
import com.yadnya.domain.USER_ROLE;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellerReport{
   
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       
       @OneToOne
       private Seller seller;
       private Long totalEarnings=0L;
       private Long totalSales=0L;
       private Long totalRefunds=0L;
       private Long totalTax=0L;
       private Long netEarnings=0L;
       private Integer totalOrders=0;
       private Integer canceledOrders=0;
       private Integer totalTransactions=0;
}