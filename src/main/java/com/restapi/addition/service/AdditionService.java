package com.restapi.addition.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AdditionService {

    public int add(int a, int b) {
        return a + b;
    }
}
