package com.ascent.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class Loginaction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        if ("admin".equals(this.getUsername().trim())&&"admin".equals(this.getPassword().trim())){
            return SUCCESS;
        }else {
            this.addFieldError("UserName","UserName or password is wrong");
            return INPUT;
        }

    }

    @Override
    public void validate() {
        if (null==this.getUsername()||"".equals(this.getUsername().trim())) {
            this.addFieldError("username","UserName is required");
        }
        if (null==this.getPassword()||"".equals(this.getPassword().trim())){
            this.addFieldError("password","Password is required");
        }
    }
}
