package com.example.demo.application.products.controller;

import com.example.demo.application.products.service.ReadProductDetailService;
import com.example.demo.application.products.viewmodel.ProductViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ReadProductDetailService readProductDetailService;
    @GetMapping("/read/{id}")
    public ProductViewModel findProductById(@PathVariable("id") UUID id) {
        return this.readProductDetailService.readProductById(id);
    }
}
