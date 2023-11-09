package com.example.menu.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class  FoodController {


    private FoodController repository;
    @GetMapping
    public void getAll(){



    }
}
