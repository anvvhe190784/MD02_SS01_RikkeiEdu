package com.example.product_management.service;

import com.example.product_management.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "iPhone 15", 20000000));
        products.add(new Product(2, "Samsung S24", 18000000));
        products.add(new Product(3, "MacBook M3", 35000000));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}