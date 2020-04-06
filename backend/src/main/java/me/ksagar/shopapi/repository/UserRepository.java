package me.ksagar.shopapi.repository;


import me.ksagar.shopapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created By K'sagar on 06/04/2020
 */

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
    Collection<User> findAllByRole(String role);

}
