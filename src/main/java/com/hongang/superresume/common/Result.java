package com.hongang.superresume.common;

import com.google.gson.Gson;
import io.swagger.annotations.ApiModelProperty;

public class Result<T> {

    public static final int SUCCESS = 1;
    public static final int FAIL = 0;
    @ApiModelProperty(
            value = "结果码",
            dataType = "Integer",
            required = true
    )
    private int status;
    @ApiModelProperty(
            value = "结果描述",
            dataType = "String",
            required = true
    )
    private String message;
    @ApiModelProperty("响应数据对象")
    private T data;

    public Result() {
    }

    public Result(int status, String message) {
        this.status = status;
        this.message = message;
        this.data = null;
    }

    public Result(T data) {
        this.status = 1;
        this.message = "SUCCESS";
        this.data = data;
    }

    public Result(int status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static <T> Result<T> custom(int status, T t, String message) {
        return new Result(status, t, message);
    }

    public static <T> Result<T> custom(int status, String message) {
        return new Result(status, message);
    }

    public static <T> Result<T> success(T t, String message) {
        return new Result(1, t, message);
    }

    public static <T> Result<T> success(String message) {
        return new Result(1, message);
    }

    public static <T> Result<T> fail(T t, String message) {
        return new Result(0, t, message);
    }

    public static <T> Result<T> fail(String message) {
        return new Result(0, message);
    }

    public static Result<String> success() {
        return new Result(1, "OK");
    }

    public static Result<String> fail() {
        return new Result(0, "FAIL");
    }

    public int getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }
}
