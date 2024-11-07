package com.healthscanplus.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String barcode;
    private String description;
    private String category;
    private List<String> ingredients;
    private HarmfulSubstances harmfulSubstances;
    private NutritionalInformation nutritionalInformation;
    private List<String> images;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
static class HarmfulSubstances {
    private List<String> names;
    private List<String> descriptions;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
static class NutritionalInformation {
    private Integer calories;
    private String servingSize;
    private String details;
    private String summary;
} 