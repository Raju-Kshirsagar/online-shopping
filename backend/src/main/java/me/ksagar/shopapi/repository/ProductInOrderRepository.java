package me.ksagar.shopapi.repository;

import me.ksagar.shopapi.entity.ProductInOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By K'sagar on 3/14/2018.
 */
public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
