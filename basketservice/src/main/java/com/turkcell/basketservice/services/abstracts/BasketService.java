package com.turkcell.basketservice.services.abstracts;

import com.turkcell.basketservice.entities.Basket;

import java.util.Map;

public interface BasketService {
    void add(String customerId,String productId);
    Map<String, Basket> getAllItems();
}
