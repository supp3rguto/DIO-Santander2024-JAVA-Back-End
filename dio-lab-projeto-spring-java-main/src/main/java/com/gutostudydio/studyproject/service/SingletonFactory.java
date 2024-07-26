package com.gutostudydio.studyproject.service;

import com.gutostudydio.studyproject.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SingletonFactory {

    private static ProductServiceImpl productServiceInstance;

    public static ProductServiceImpl getProductServiceInstance() {
        if (productServiceInstance == null) {
            productServiceInstance = new ProductServiceImpl();
        }
        return productServiceInstance;
    }
}

