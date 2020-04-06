package me.ksagar.shopapi.service;

import me.ksagar.shopapi.entity.ProductCategory;

import java.util.List;

/**
 * Created By K'sagar on 06/04/2020.
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
