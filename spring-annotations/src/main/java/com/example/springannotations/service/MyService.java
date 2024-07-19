package com.example.springannotations.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String sayHello() {
        return "Hello World";
    }
}
