package com.ascent.struts2.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport {
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
        if (getUsername().equals("accent")&&getPassword().equals("accent") ) {
            ActionContext.getContext().getSession().put("user",this.getUsername());
            return SUCCESS;
        }

        return ERROR;
    }

    @Override
    public void validate() {
        if (getUsername()==null||"".equals(this.getUsername().trim())) {
            this.addFieldError("username",this.getText("username.required"));
        }
        if (getPassword()==null||"".equals(this.getPassword().trim())) {
            this.addFieldError("password",this.getText("password.required"));
        }
    }
}
