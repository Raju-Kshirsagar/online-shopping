package me.ksagar.shopapi.repository;

import me.ksagar.shopapi.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By K'sagar on 06/04/2020
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
