package com.gutostudydio.studyproject.controller;

import com.gutostudydio.studyproject.model.Product;
import com.gutostudydio.studyproject.service.SingletonFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final SingletonFactory singletonFactory = new SingletonFactory();

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return singletonFactory.getProductServiceInstance().saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return singletonFactory.getProductServiceInstance().getAllProducts();
    }
}
