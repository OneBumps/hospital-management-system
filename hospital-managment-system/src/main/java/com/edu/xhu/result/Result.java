package com.edu.xhu.result;

import java.io.Serializable;

/**
 * Created by zxd on 2023/11/4
 */
public class Result<T> implements Serializable {

    //状态码
    private Integer code;

    //提示信息
    private String msg;

    //总记录数
    private Long count;

    //返回数据
    private T data;

    /**
     * 带分页的成功
     *
     * @param count
     * @param data
     * @return
     */
    public static Result buildSuccess(Long count, Object data) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("请求成功!");
        result.setCount(count);
        result.setData(data);
        return result;
    }

    /**
     * 返回单个数据的成功
     *
     * @param data
     * @return
     */
    public static Result buildSuccess(Object data) {
        return buildSuccess(null, data);
    }


    /**
     * 不带参数的成功
     *
     * @return
     */
    public static Result buildSuccess() {
        return buildSuccess(null, null);
    }

    /**
     * 构建失败
     *
     * @param code 状态码
     * @param msg  提示消息
     * @return
     */
    public static Result buildFail(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}