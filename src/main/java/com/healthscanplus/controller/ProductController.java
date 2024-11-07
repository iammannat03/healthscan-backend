package com.healthscanplus.controller;

import com.healthscanplus.model.Product;
import com.healthscanplus.repository.ProductRepository;
import com.healthscanplus.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/test")
    public String test() {
        return "hello, testing is complete";
    }

    @GetMapping("/testDB")
    public List<Product> testDB() {
        return productService.findAll();
    }

    @GetMapping("/homepage")
    public Object getHomepage() {
        productService.initDB(); // This would need to be implemented
        return homepage; // You'll need to define this
    }

    @GetMapping("/scan")
    public List<Product> scanProduct(@RequestParam String barcode) {
        return productService.findByBarcode(barcode);
    }

    @GetMapping("/search-products")
    public List<Product> searchProducts(@RequestParam String name) {
        return productService.findByName(name);
    }

    @GetMapping("/{barcode}")
    public List<Product> getProductByBarcode(@PathVariable String barcode) {
        return productService.findByBarcode(barcode);
    }

    @GetMapping("/homepage/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category) {
        return productService.findByCategory(category);
    }
} 