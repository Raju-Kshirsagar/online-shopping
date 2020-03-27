package me.ksagar.shopapi.vo.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created By K'sagar on 1/1/2019.
 */
@Data
public class LoginForm {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
