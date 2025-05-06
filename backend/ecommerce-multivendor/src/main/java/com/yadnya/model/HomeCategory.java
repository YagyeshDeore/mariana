package com.yadnya.model;

import com.yadnya.domain.HomeCategorySection;

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
public class HomeCategory {
	
	 @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private long id; 
	 
	 private String name;
	 private String image;
	 private String Category;
	 private HomeCategorySection section;

}
