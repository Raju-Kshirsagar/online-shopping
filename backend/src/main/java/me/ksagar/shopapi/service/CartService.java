package me.ksagar.shopapi.service;

import me.ksagar.shopapi.entity.Cart;
import me.ksagar.shopapi.entity.ProductInOrder;
import me.ksagar.shopapi.entity.User;

import java.util.Collection;

/**
 * Created By K'sagar on 3/10/2018.
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
