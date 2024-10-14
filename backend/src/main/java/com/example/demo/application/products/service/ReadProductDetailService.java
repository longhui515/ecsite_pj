package com.example.demo.application.products.service;

import com.example.demo.application.products.viewmodel.ProductViewModel;
import com.example.demo.domain.products.domainobject.Product;
import com.example.demo.domain.products.irepositoryinterface.IProductRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class ReadProductDetailService {
    @Autowired
    IProductRepositoryInterface productRepository;

    @Transactional
    public ProductViewModel readProductById(UUID id) {
        Product product =
                this.productRepository.findById(id);

        return ProductViewModel.adaptToProductVewModel(product.getId(), product.getProductName(), product.getDescription(),
                product.getStockQuantity());
    }

}
