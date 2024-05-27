package com.turkcell.basketservice.controllers;

import com.turkcell.basketservice.entities.Basket;
import com.turkcell.basketservice.services.abstracts.BasketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/basket")
@AllArgsConstructor
public class BasketController {

    private BasketService basketService;

    @PostMapping
    public void addItem(@RequestParam String customerId,@RequestParam String productId){
        basketService.add(customerId,productId);
    }

    @GetMapping
    public Map<String, Basket> getAllItems(){
        return basketService.getAllItems();
    }
}
