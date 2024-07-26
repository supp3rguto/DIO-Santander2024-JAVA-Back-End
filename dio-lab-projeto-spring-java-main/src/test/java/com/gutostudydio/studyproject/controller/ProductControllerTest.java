package com.gutostudydio.studyproject.controller;

import com.gutostudydio.studyproject.model.Product;
import com.gutostudydio.studyproject.service.SingletonFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SingletonFactory singletonFactory;

    @Test
    void createProduct() throws Exception {
        Product product = new Product();
        product.setId(1L);
        product.setName("Product 1");
        product.setPrice(100.0);

        when(singletonFactory.getProductServiceInstance().saveProduct(product)).thenReturn(product);

        mockMvc.perform(post("/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{ \"name\": \"Product 1\", \"price\": 100.0 }"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":1,\"name\":\"Product 1\",\"price\":100.0}"));
    }

    @Test
    void getAllProducts() throws Exception {
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Product 1");
        product1.setPrice(100.0);

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Product 2");
        product2.setPrice(200.0);

        when(singletonFactory.getProductServiceInstance().getAllProducts()).thenReturn(Arrays.asList(product1, product2));

        mockMvc.perform(get("/products"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{\"id\":1,\"name\":\"Product 1\",\"price\":100.0},{\"id\":2,\"name\":\"Product 2\",\"price\":200.0}]"));
    }
}
