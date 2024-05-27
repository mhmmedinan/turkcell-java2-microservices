package com.turkcell.basketservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
public class BasketItem implements Serializable {

    private String id;
    private String productId;
    private String productName;
    private double price;

    public BasketItem(){
        this.id= UUID.randomUUID().toString();
    }

}
