package com.example.demo.infrastructer.products.repository;

import com.example.demo.domain.products.domainobject.Product;
import com.example.demo.domain.products.irepositoryinterface.IProductRepositoryInterface;
import com.example.demo.infrastructer.products.jparepository.IProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class ProductRepository implements IProductRepositoryInterface {
    @Autowired
    IProductJpaRepository productJpaRepository;

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Product findById(UUID id) {
        return this.productJpaRepository.findAllById(id).adaptToProduct();
    }

}
