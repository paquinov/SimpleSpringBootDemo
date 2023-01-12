package com.example.demo.controllers;

import com.example.demo.dto.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.http.ResponseEntity;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GeneralControllerTests {

    private GeneralController generalController;

    @BeforeEach
    void setup() {
        generalController = new GeneralController();
    }

    @Test
    void checkIfProductsAreNotEmpty() {
        ResponseEntity<List<Product>> productsResponseEntity = generalController.getProducts();
        Assertions.assertEquals(5, productsResponseEntity.getBody().size());
    }

}
