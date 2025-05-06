package com.yadnya.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "category")  // Optional, specifies the table name
@Data
public class Category {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id; // Unique identifier for the category

   private String name; // Name of the category (e.g., Electronics, Clothing)

   @Column(unique = true)
   private String CategoryId; // Unique identifier for the category

   @ManyToOne
   private Category parentCategory; // Parent category (if applicable)

   private Integer level; // Level of the category in the hierarchy (e.g., 1 for top-level, 2 for sub-category)
}
