/*
 * Copyright (c) 2016. 杭州端点网络科技有限公司.  All rights reserved.
 */

package x.springboot.dubbo.api.model;

import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author panxin
 * @Date 2016-07-15
 */
@NoArgsConstructor
public class Response<T> implements Serializable{

    private static final long serialVersionUID = 7446512194871867953L;

    /**
     * 判断方法调用是否成功
     */
    private Boolean success;

    /**
     * 调用方法获得的信息, 如果success = true, result可以获得需要的信息.
     */
    private T result;

    /**
     * 调用方法返回的错误信息, 如果success = false, error中可以获得错误的信息.
     */
    private String error;

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean isSuccess() {
        return this.success;
    }

    private void setResult(T result) {
        this.success = true;
        this.result = result;
    }

    public T getResult() {
        return this.result;
    }

    private void setError(String error) {
        this.success = false;
        this.error = error;
    }

    public String getError() {
        return this.error;
    }

    public static <T> Response<T> ok(T data) {
        Response<T> resp = new Response<T>();
        resp.setResult(data);
        return resp;
    }

    public static <T> Response<T> failed(String error) {
        Response<T> resp = new Response<T>();
        resp.setError(error);
        return resp;
    }

}
