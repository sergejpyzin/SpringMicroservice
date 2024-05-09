package ru.sergeypyzin.Order.Service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public String getAllOrders() {
        return "List of orders";
    }
}
