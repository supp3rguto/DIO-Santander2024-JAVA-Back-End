package com.gutostudydio.studyproject.service.impl;

import com.gutostudydio.studyproject.model.Product;
import com.gutostudydio.studyproject.model.ProductRepository;
import com.gutostudydio.studyproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
