package me.ksagar.shopapi.service;

import me.ksagar.shopapi.entity.ProductInOrder;
import me.ksagar.shopapi.entity.User;

/**
 * Created By K'sagar on 1/3/2019.
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
