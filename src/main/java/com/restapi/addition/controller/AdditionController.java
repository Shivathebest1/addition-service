package com.restapi.addition.controller;

import com.restapi.addition.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/addition")
public class AdditionController {

    @Autowired
    private AdditionService additionService;

    @GetMapping("/sum")
    public int getSum(@RequestParam int a, @RequestParam int b) {
        return additionService.add(a, b);
    }
    @GetMapping("/test")
    public String testAPI() {
        return "Success Addition API returns...and working fine..";
    }

}
