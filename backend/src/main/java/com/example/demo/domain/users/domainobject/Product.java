
public Product(UUID id, String productName, String description, Integer stockQuantity, LocalDateTime created, LocalDateTime modified) {
    this.id = id;
    this.productName = productName;
    this.description = description;
    this.stockQuantity;
    this.created = created;
    this.modified = modified;
}

public static User createProduct(UUID id, String productName, String description, Integer stockQuantity, LocalDateTime created, LocalDateTime modified) {
    return new Product(
            id, productName, description, stockQuantity, created, modified
    );
}
