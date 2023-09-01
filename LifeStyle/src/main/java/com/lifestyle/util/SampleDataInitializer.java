package com.lifestyle.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.lifestyle.model.Category;
import com.lifestyle.model.Product;
import com.lifestyle.model.User;
import com.lifestyle.repository.CategoryRepository;
import com.lifestyle.repository.ProductRepository;
import com.lifestyle.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class SampleDataInitializer {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void init() {
        // Create and save users
        User user1 = new User("user1", passwordEncoder.encode("user1password"), setOf("USER"));
        User user2 = new User("user2", passwordEncoder.encode("user2password"), setOf("USER"));
        userRepository.save(user1);
        userRepository.save(user2);

        // Create and save admins
        User admin1 = new User("admin1", passwordEncoder.encode("admin1password"), setOf("ADMIN"));
        User admin2 = new User("admin2", passwordEncoder.encode("admin2password"), setOf("ADMIN"));
        userRepository.save(admin1);
        userRepository.save(admin2);

        // Create categories
        Category menCategory = new Category("Men");
        Category womenCategory = new Category("Women");
        Category kidsCategory = new Category("Kids");
        Category beautyCategory = new Category("Beauty");
        categoryRepository.save(menCategory);
        categoryRepository.save(womenCategory);
        categoryRepository.save(kidsCategory);
        categoryRepository.save(beautyCategory);

        // Create products and associate them with categories
        Product product1 = new Product("Product 1", 10.99, "product1.jpg", "product1-url", menCategory);
        Product product2 = new Product("Product 2", 12.99, "product2.jpg", "product2-url", menCategory);
        Product product3 = new Product("Product 3", 14.99, "product3.jpg", "product3-url", womenCategory);
        Product product4 = new Product("Product 4", 16.99, "product4.jpg", "product4-url", womenCategory);
        Product product5 = new Product("Product 5", 9.99, "product5.jpg", "product5-url", kidsCategory);
        Product product6 = new Product("Product 6", 11.99, "product6.jpg", "product6-url", kidsCategory);
        Product product7 = new Product("Product 7", 8.99, "product7.jpg", "product7-url", beautyCategory);
        Product product8 = new Product("Product 8", 13.99, "product8.jpg", "product8-url", beautyCategory);

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);
        productRepository.save(product5);
        productRepository.save(product6);
        productRepository.save(product7);
        productRepository.save(product8);
    }

    private Set<String> setOf(String... elements) {
        Set<String> set = new HashSet<>();
        for (String element : elements) {
            set.add(element);
        }
        return set;
    }
}

