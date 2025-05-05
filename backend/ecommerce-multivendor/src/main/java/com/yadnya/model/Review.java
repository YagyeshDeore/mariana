package com.yadnya.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class Review {
   
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       @Column(nullable = false)
       private String reviewText;

       @Column(nullable = false)
       private int rating;

       @JsonIgnore
       @ManyToOne
       @Column(nullable = false)
       private Product product;

       @ManyToOne
       @Column(nullable = false)
       private User user;
   
       @Column(nullable = false)
       private LocalDateTime createdAt= LocalDateTime.now(); // Date and time when the review was created
      
       }