package com.lifestyle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
//    public Product(String string, double d, String string2, String string3, Category menCategory) {
//		// TODO Auto-generated constructor stub
//	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    
    private String productName;
    private double price;
    private String productPicture;
    private String productUrl;
    
    @ManyToOne
    private Category category; // Establishing Many-to-One relationship with Category
    
    public Product() {
    	
    }

	public Product(String productName, double price, String productPicture, String productUrl, Category category) { //Long productId, 
//		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.productPicture = productPicture;
		this.productUrl = productUrl;
		this.category = category;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductPicture() {
		return productPicture;
	}

	public void setProductPicture(String productPicture) {
		this.productPicture = productPicture;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
    
}
