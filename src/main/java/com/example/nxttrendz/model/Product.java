package com.example.nxttrendz.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import lombok.Data;

@Data // Provides getters, setters, toString, equals, and hashCode
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String brand;
    private Double price;
 
    // 👇 FIX: This maps the Java field 'imageUrl' to the DB column 'image_url'
    @Column(name = "image_url") 
    @JsonProperty("image_url")
    private String imageUrl;

    private int rating;
    private String availability;
    private String description;
    private int totalReviews;
    private Long categoryId;
    private boolean primeDeal;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTotalReviews() {
		return totalReviews;
	}
	public void setTotalReviews(int totalReviews) {
		this.totalReviews = totalReviews;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public boolean isPrimeDeal() {
		return primeDeal;
	}
	public void setPrimeDeal(boolean primeDeal) {
		this.primeDeal = primeDeal;
	}
    
    
    // NOTE: Manual getters/setters were removed as @Data provides them.
    // Ensure Lombok is correctly installed and configured in your IDE/build.
}