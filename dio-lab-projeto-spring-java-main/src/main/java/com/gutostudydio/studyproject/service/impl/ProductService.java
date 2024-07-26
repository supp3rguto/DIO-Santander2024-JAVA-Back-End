package com.gutostudydio.studyproject.service;

import com.gutostudydio.studyproject.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
}
