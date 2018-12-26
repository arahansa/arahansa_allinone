package com.arahansa.dto;

import lombok.Data;

/**
 * @author Lucas Choi
 */
@Data
public class CommonRes<T> {
    int status;
    String msg;
    T data;

    public static final int VALID = 422;

    public CommonRes() {
        this.status = 0;
    }

    public CommonRes(T data) {
        this.status = 0;
        this.data = data;
    }

    public CommonRes(int status, String msg){
        this.status = status;
        this.msg = msg;
    }
}
