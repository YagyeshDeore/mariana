package com.yadnya.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;
import org.springframework.cglib.core.Local;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Coupon {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String code; // Unique code for the coupon
   private double discountPercentage; // Discount amount or percentage
   private LocalDate validityStartDate; // Start date of the coupon validity in "yyyy-MM-dd" format
   private LocalDate validityEndDate;  // End date of the coupon validity in "yyyy-MM-dd" format
   private double minimunOrderValue; // Minimum order value required to use the coupon
   private boolean isActive=true; // Flag to indicate if the coupon is active or not

   @ManyToMany(mappedBy = "usedCoupons")
   private Set<User> UsedByUsers = new HashSet<>(); // Set of users who have used the coupon

   // private String description; // Description of the coupon
   // private double discount; // Discount amount or percentage
   // private String expiryDate; // Expiry date of the coupon in "yyyy-MM-dd" format
   // private int minPurchaseAmount; // Minimum purchase amount required to use the coupon
   // private int maxDiscountAmount; // Maximum discount amount that can be availed using the coupon
   // private int maxUsageCount; // Maximum number of times the coupon can be used
   // private int usedCount; // Number of times the coupon has been used
   // private String createdAt; // Creation date of the coupon in "yyyy-MM-dd" format
   // private String updatedAt; // Last updated date of the coupon in "yyyy-MM-dd" format
   // private String createdBy; // User who created the coupon
   // private String updatedBy; // User who last updated the coupon
   // private String couponType; // Type of the coupon (e.g., "percentage", "fixed amount")
   // private String applicableTo; // Applicable to (e.g., "all products", "specific categories")
   // private String applicableCategories; // List of categories to which the coupon is applicable
   // private String applicableProducts; // List of products to which the coupon is applicable
   // private String applicableBrands; // List of brands to which the coupon is applicable
   // private String applicableSellers; // List of sellers to which the coupon is applicable
   // private String applicableUsers; // List of users to whom the coupon is applicable
   // private String applicableLocations; // List of locations to which the coupon is applicable
   // private String applicablePaymentMethods; // List of payment methods to which the coupon is applicable
   // private String applicableShippingMethods; // List of shipping methods to which the coupon is applicable
   // private String applicableOrderTypes; // List of order types to which the coupon is applicable
   // private String applicableOrderStatuses; // List of order statuses to which the coupon is applicable
   // private String applicableOrderSources; // List of order sources to which the coupon is applicable
   // private String applicableOrderTags; // List of order tags to which the coupon is applicable
   // private String applicableOrderNotes; // List of order notes to which the coupon is applicable
   // private String applicableOrderComments; // List of order comments to which the coupon is applicable
   // private String applicableOrderAttributes; // List of order attributes to which the coupon is applicable
   // private String applicableOrderMeta; // List of order meta to which the coupon is applicable
   // private String applicableOrderCustomFields; // List of order custom fields to which the coupon is applicable
   // private String applicableOrderCustomAttributes; // List of order custom attributes to which the coupon is applicable
   // private String applicableOrderCustomMeta; // List of order custom meta to which the coupon is applicable
   

}
