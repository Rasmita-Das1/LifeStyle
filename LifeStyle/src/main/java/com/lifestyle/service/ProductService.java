package com.lifestyle.service;

import java.util.List;

import com.lifestyle.model.Product;

public interface ProductService {
	
    List<Product> listAllProducts();
    
    Product getProductById(Long id);
    
    Product addProduct(Product product);
    
    Product updateProduct(Product product);
    
    void deleteProductById(Long id);
}
