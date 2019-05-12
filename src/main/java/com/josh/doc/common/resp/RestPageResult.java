package com.josh.doc.common.resp;

import com.fasterxml.jackson.annotation.JsonInclude;

public class RestPageResult {
    private Integer code;
    private String msg = "";
    private Object body;

    public RestPageResult(Integer status, String message, Object body){
        this.code = status;
        this.body = body;
        this.msg = message;
    }

    public RestPageResult(Integer status, Object body) {
        this.code = status;
        this.body = body;
    }

    public RestPageResult(Integer status) {
        this.code = status;
    }


    public RestPageResult(Object body) {
        this.code = 200;
        this.body = body;
    }

    public RestPageResult(Integer status, String message){
        this.code = status;
        this.msg = message;
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

    public void setBody(Object body) {
        this.body = body;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getBody() {
        return body;
    }



}
