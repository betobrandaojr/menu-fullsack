package com.brandao.cardapio.assets.controller;

import com.brandao.cardapio.assets.module.Food;
import com.brandao.cardapio.assets.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;


    @GetMapping
    public List<Food> getAll(){

        List<Food> foodList = foodRepository.findAll();
        return foodList;

    }
}
