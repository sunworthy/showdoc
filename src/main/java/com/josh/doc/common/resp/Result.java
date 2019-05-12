package com.josh.doc.common.resp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.josh.doc.common.config.Config;

public class Result {
    private Integer code;
    private String msg;
    private Object body;

    public Result(){

    }

    public Result(Integer status, String message, Object body){
        this.code = status;
        this.body = body;
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

    public static Result success(Object data){
        return new Result(Config.RESULT_CODE_SUCCESS, "", data);
    }

    public static Result failed(String msg){
        return new Result(Config.RESULT_CODE_FAILED, msg, null);
    }


}
