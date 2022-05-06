package com.ascklrt.api.model;

/**
 * @author wangjiawei
 * @description
 * @date 2022/3/25 5:06 下午
 */
public class CommonResult<T> {

    private Boolean status;

    private T data;

    public CommonResult(Boolean status, T data) {
        this.status = status;
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
