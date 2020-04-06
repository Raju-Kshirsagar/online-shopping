package me.ksagar.shopapi.exception;


import me.ksagar.shopapi.enums.ResultEnum;

/**
 * Created By K'sagar on 06/04/2020.
 */
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
