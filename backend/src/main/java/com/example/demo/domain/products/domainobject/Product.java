package com.example.demo.domain.products.domainobject;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@ToString
@EqualsAndHashCode
public class Product {
    private final UUID id;
    private final String productName;
    private final String description;
    private final Integer stockQuantity;
    private final LocalDateTime created;
    private final LocalDateTime modified;



    public Product(UUID id, String productName, String description, Integer stockQuantity, LocalDateTime created, LocalDateTime modified) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.stockQuantity = stockQuantity;
        this.created = created;
        this.modified = modified;
    }

    public static Product createProduct(UUID id, String productName, String description, Integer stockQuantity, LocalDateTime created, LocalDateTime modified) {
        return new Product(
                id, productName, description, stockQuantity, created, modified
        );
    }
}