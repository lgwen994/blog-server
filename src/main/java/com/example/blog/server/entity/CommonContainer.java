package com.example.blog.server.entity;

public class CommonContainer {
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private boolean success = true;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Object data ;

}
