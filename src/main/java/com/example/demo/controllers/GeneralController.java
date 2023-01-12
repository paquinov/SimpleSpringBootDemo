package com.example.demo.controllers;

import com.example.demo.dto.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/demo")
@RequiredArgsConstructor
public class GeneralController {

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = Arrays.asList(Product.builder()
                                                        .id(UUID.randomUUID().toString())
                                                        .name("Yogurt")
                                                        .description("Drink")
                                                        .unitPrice(3.5)
                                                        .build(),
                                                Product.builder()
                                                        .id(UUID.randomUUID().toString())
                                                        .name("Donut")
                                                        .description("Eatable")
                                                        .unitPrice(1.7)
                                                        .build(),
                                                Product.builder()
                                                        .id(UUID.randomUUID().toString())
                                                        .name("TV")
                                                        .description("Appliance")
                                                        .unitPrice(350)
                                                        .build(),
                                                Product.builder()
                                                        .id(UUID.randomUUID().toString())
                                                        .name("Car")
                                                        .description("Vehicle")
                                                        .unitPrice(68000)
                                                        .build(),
                                                Product.builder()
                                                        .id(UUID.randomUUID().toString())
                                                        .name("PC")
                                                        .description("Working tool")
                                                        .unitPrice(1250)
                                                        .build());
        return ResponseEntity.ok(products);
    }

}
