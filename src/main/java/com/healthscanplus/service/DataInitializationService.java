package com.healthscanplus.service;

import com.healthscanplus.model.Product;
import com.healthscanplus.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Arrays;

@Service
public class DataInitializationService implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) {
        initializeData();
    }

    public void initializeData() {
        // Clear existing data
        productRepository.deleteAll();

        // Create sample products
        Product laysChips = new Product(
            null,
            "Lays Potato Chips - India's Magic Masala",
            "838914951289",
            "Flavorful potato chips with a blend of Indian spices",
            "Chips",
            Arrays.asList("Potatoes", "Vegetable Oil", "Spices", "Salt", "Sugar", "Onion Powder", "Tomato Powder"),
            new HarmfulSubstances(
                Arrays.asList("Monosodium Glutamate", "Yeast Extract Powder", "Silicon Dioxide"),
                Arrays.asList(
                    "Monosodium glutamate (MSG) is a flavor enhancer commonly added to processed foods. Excessive consumption may cause adverse reactions in some individuals.",
                    "Yeast extract powder is used as a flavor enhancer. Some people may be sensitive to it.",
                    "Silicon dioxide is an anti-caking agent used in food processing."
                )
            ),
            new NutritionalInformation(
                160,
                "28g",
                "Per 1 oz (about 28g) serving",
                "Lays Potato Chips - India's Magic Masala are a delicious snack with a blend of Indian spices."
            ),
            Arrays.asList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTht8WIaEJPEy-oH6HZf3VcOeqe2S0IBkaCNlrgxq1uRw&s")
        );

        // Add more products here following the same pattern...

        // Save to database
        productRepository.save(laysChips);
        
        // You can continue adding more products from your data.js file
        // For brevity, I've shown just one example
    }
} 