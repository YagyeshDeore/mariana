package com.yadnya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yadnya.domain.USER_ROLE;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String fullname;
   private String email;

   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   private String password;
   private String mobile;
   
   private USER_ROLE role = USER_ROLE.ROLE_CUSTOMER; // "admin" or "user"

   @OneToMany
   private Set<Address> Addresses= new HashSet<>(); // Set of addresses associated with the user
   
   @ManyToMany
   @JsonIgnore
   private Set<Coupon> usedCoupons= new HashSet<>(); // Set of Coupon methods associated with the user
}