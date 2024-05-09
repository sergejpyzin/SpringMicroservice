package ru.sergeypyzin.Product.Service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String getAllProducts (){
        return "List of products";
    }
}
