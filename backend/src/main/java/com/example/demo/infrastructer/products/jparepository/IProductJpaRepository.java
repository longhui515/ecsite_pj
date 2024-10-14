package com.example.demo.infrastructer.products.jparepository;

import com.example.demo.infrastructer.products.dbmodel.ProductDbModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IProductJpaRepository extends JpaRepository<ProductDbModel, UUID> {
    ProductDbModel findAllById(UUID id);

}
