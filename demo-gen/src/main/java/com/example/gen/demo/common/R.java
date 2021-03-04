package com.example.gen.demo.common;

import cn.hutool.http.HttpStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @date 2020-12-11
 * @author lyj
 */

@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class R<T> implements Serializable {

    @Getter
    @Setter
    public int code = HttpStatus.HTTP_OK;

    @Getter
    @Setter
    public String msg = "success";

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public T data;

    public R() {
        super();
    }

    public R(T data) {
        super();
        this.data = data;
    }

    public R(T data, String errorMsg) {
        super();
        this.data = data;
        this.msg = errorMsg;
    }

    public R(Throwable e) {
        super();
        this.msg = e.getMessage();
        this.code = HttpStatus.HTTP_INTERNAL_ERROR;
    }

    public static R ok(){
        return R
                .builder()
                .code(HttpStatus.HTTP_OK)
                .msg("success")
                .build();
    }

    public static R ok(int code){
        return R
                .builder()
                .code(code)
                .msg("success")
                .build();
    }

    public static R error(){
        return R
                .builder()
                .code(HttpStatus.HTTP_INTERNAL_ERROR)
                .msg("error")
                .build();
    }

    public static R errorParam(Object param){
        return R
                .builder()
                .code(HttpStatus.HTTP_INTERNAL_ERROR)
                .msg("param error :" + param)
                .build();
    }

    public static R error(String msg){
        return R
                .builder()
                .code(HttpStatus.HTTP_INTERNAL_ERROR)
                .msg(msg)
                .build();
    }

    public static R error(int code) {
        return R
                .builder()
                .code(code)
                .msg("err")
                .build();
    }

    public static R error(int code, String msg){
        return R
                .builder()
                .code(code)
                .msg(msg)
                .build();
    }

    public static R error(IErrorMsg message, Object data){
        return R
                .builder()
                .code(message.getCode())
                .msg(message.getMessage())
                .data(data)
                .build();
    }

    public static R error(IErrorMsg message){
        return R
                .builder()
                .code(message.getCode())
                .msg(message.getMessage())
                .build();
    }

    public static R ok(Object data){
        return R
                .builder()
                .code(HttpStatus.HTTP_OK)
                .data(data)
                .msg("success")
                .build();
    }

    public static R ok(String msg, Object data){
        return R
                .builder()
                .code(HttpStatus.HTTP_OK)
                .data(data)
                .msg(msg)
                .build();
    }
}