package me.ksagar.shopapi.service;


import me.ksagar.shopapi.entity.User;

import java.util.Collection;

/**
 * Created By K'sagar on 3/13/2018.
 */
public interface UserService {
    User findOne(String email);

    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
