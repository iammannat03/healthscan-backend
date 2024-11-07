package com.healthscanplus.service;

import com.healthscanplus.model.Product;
import com.healthscanplus.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findByBarcode(String barcode) {
        return productRepository.findByBarcode(barcode);
    }

    public List<Product> findByName(String name) {
        return productRepository.findByNameRegex(name);
    }

    public List<Product> findByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public void initDB() {
        productRepository.deleteAll();
        // You'll need to implement the data initialization logic here
        // similar to your Node.js implementation
    }
} 