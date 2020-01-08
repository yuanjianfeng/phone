package com.goth.common;

/**
 * @Description TODO
 * @Author yuan.jianfeng
 * @Date 2020/1/8  7:01 下午
 */
public class windException  extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public windException(String message) {
        super(message);
    }

    public windException(Throwable throwable) {
        super(throwable);
    }

    public windException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
