package com.fh.shop.commons;

public enum ResponseEnum {
    SUCCESS(200,"success"),
    ERROR(500,"error"),
    USERNAME_USERPWD_ISEXSIT(1000,"用户名或密码为空"),
    USERNAME_ERROR(10001,"用户名错误"),
    USERPWD_ERROR(10002,"密码错误"),;

    private int code;
    private String msg;

    //生成私有构造函数
    private ResponseEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
