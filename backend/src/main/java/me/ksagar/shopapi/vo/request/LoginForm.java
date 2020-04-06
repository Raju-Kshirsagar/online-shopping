package me.ksagar.shopapi.vo.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created By K'sagar on 06/04/2020.
 */
@Data
public class LoginForm {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
