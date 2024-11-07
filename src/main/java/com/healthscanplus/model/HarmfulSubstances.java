package com.healthscanplus.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String barcode;
    private String category;
    private HarmfulSubstances harmfulSubstances;

    // Getters and Setters
    // Constructor
}

public class HarmfulSubstances {
    private List<String> names;
    
    // Getters and Setters
} 