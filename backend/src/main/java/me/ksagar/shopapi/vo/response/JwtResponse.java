package me.ksagar.shopapi.vo.response;

import lombok.Data;

/**
 * Created By K'sagar on 1/1/2019.
 */
@Data
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String account;
    private String name;
    private String role;

    public JwtResponse(String token, String account, String name, String role) {
        this.account = account;
        this.name = name;
        this.token = token;
        this.role = role;
    }
}
