package me.ksagar.shopapi.repository;

import me.ksagar.shopapi.entity.ProductInOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By K'sagar on 06/04/2020
 */
public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
