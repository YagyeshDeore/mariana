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
public class Seller{
   
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       private String sellerName;
       private String mobile;

       @Column(unique = true, nullable = false)
       private String email;
       private String password;

        @Embedded
         private BuisenessDetails businessDetails; // Business details of the seller

         @Embedded
         private BankDetails bankDetails; // Banking details of the seller

         private Address pickupaddress=new Address(); // Address of the seller

         private String GSTIN; // GSTIN of the seller

         private USER_ROLE role = USER_ROLE.ROLE_SELLER; // Role of the seller (e.g., "seller", "admin")

         private boolean isEmailVerified; // Flag to indicate if the email is verified or not

         private AccountStatus accountStatus = AccountStatus.PENDING_VERIFICATTION; // Account status of the seller (e.g., "active", "pending verification", "suspended")
         
}