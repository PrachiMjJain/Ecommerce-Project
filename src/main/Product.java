package com.social.media.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String productName;
    private String description;
    private Integer quantity;
    private double price;
    private double specialPrice;
    
    // relationship with category
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    

}
