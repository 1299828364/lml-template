package com.template.lml.demo.config;


public enum ResultEnum {
    /**
     *
     */
    succese(200,"成功"),
    succese_create(201,"成功"),
    succese_delete(204,"成功"),
    ERROR_ACCESS_FAILED(402,"登录失败"),
    ERROR_ACCESS_UNAUTHORIZED(401,"未登录"),
    ERROR_SYSTEM_REJECT(403,"系统拒绝！"),
    ERROR_SYSTEM_NOTFIND(404,"资源不存在"),
    ERROR_ACCESS_FORBIDDEN(405,"权限不足"),
    ERROR_ACCESS_TIMEOUT(408,"访问超时！"),
    ERROR_ACCESS_TTO_MANY_REQUEST(429,"系统拒绝！"),
    ERROR_SERVER_ERROR(500,"服务器错误"),
    ERROR_SERVER_SUSPENSION(503,"服务器暂停服务！"),
    ;

    private Integer code;


    private String msg;

    ResultEnum(Integer code, String msg){
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode(){return code;}

    public String getMsg(){return msg;}
}
