package com.example.demo.infrastructer.products.dbmodel;

import com.example.demo.domain.products.domainobject.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "products")
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ProductDbModel implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "modified")
    private LocalDateTime modified;

    public Product adaptToProduct() {
        return new Product(
                this.id,
                this.productName,
                this.description,
                this.stockQuantity,
                created, modified);
    }

    public static ProductDbModel adaptToProductDbModel(Product product) {
        return new ProductDbModel(product.getId(), product.getProductName(), product.getDescription(), product.getStockQuantity(), product.getCreated(), product.getModified());
    }
}
