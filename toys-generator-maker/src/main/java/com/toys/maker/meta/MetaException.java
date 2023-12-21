package com.toys.maker.meta;

/**
 * 元信息异常
 * @author: Toys
 * @date: 2023年12月21 14:37
 **/
public class MetaException extends RuntimeException {

    public MetaException(String message) {
        super(message);
    }

    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}
