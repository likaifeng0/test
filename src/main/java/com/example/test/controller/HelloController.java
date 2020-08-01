package com.example.test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/test/{id}")
    public String helloContrller(@PathVariable("id")String id) {
        return "" +id;
    }
}
