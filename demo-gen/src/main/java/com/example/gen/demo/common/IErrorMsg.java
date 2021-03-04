package com.example.gen.demo.common;

/**
 * 封装API的错误码
 *
 * @author lyj
 */
public interface IErrorMsg {

    /**
     * 获取错误码
     *
     * @return int
     */
    int getCode();

    /**
     * 获取错误信息
     *
     * @return String
     */
    String getMessage();

}
