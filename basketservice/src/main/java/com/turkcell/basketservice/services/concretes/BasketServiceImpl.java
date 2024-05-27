package com.turkcell.basketservice.services.concretes;

import com.turkcell.basketservice.entities.Basket;
import com.turkcell.basketservice.entities.BasketItem;
import com.turkcell.basketservice.repositories.RedisRepository;
import com.turkcell.basketservice.services.abstracts.BasketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class BasketServiceImpl implements BasketService {

    private RedisRepository redisRepository;

    @Override
    public void add(String customerId, String productId) {

        Basket basket = new Basket();
        BasketItem basketItem = new BasketItem();
        basketItem.setProductId(productId);
        basketItem.setProductName("Modem");
        basketItem.setPrice(2000);
        basket.setCustomerId(customerId);
        basket.setTotalPrice(basket.getTotalPrice()+basketItem.getPrice());
        basket.getBasketItems().add(basketItem);
        redisRepository.addItem(basket);
    }

    @Override
    public Map<String, Basket> getAllItems() {
       return redisRepository.getAllItems();
    }
}
