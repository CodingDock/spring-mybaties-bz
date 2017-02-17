package com;


/**
 * 自定义非检查型异常
 */
public class ApolloException extends RuntimeException {
    private String msg;
    
    public ApolloException() {
    }

    public ApolloException( String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
