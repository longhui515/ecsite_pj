package com.example.demo.domain.products.irepositoryinterface;

import com.example.demo.domain.products.domainobject.Product;

import java.util.List;
import java.util.UUID;

public interface IProductRepositoryInterface {

    public List<Product> findAll();

    public Product findById(UUID id);

}
