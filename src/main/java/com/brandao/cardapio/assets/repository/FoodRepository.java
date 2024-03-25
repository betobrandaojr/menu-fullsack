package com.brandao.cardapio.assets.repository;


import com.brandao.cardapio.assets.module.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
