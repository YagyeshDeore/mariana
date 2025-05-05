package com.yadnya.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Address {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;    // Unique identifier for the address

   private String name; // Name of the address (e.g., "Home", "Office")
   private String locallity; // Locality or area of the address
   private String address; // Full address (street, building, etc.)
   private String city;    // City of the address
   private String state;   // State of the address
   private String country; // Country of the address
   private String pincode; // Postal code of the address
   private String mobile;  // Mobile number associated with the address

}
