package com.bgs.examinationfront.pojo;

import java.io.Serializable;

//手机号
public abstract class Result implements Serializable {

    private static final long serialVersionUID = 850309986972261236L;

    private String code = "0"; // 错误码
    private String message;    // 错误对象
    private Object data;       // 返回数据

    public Result(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}