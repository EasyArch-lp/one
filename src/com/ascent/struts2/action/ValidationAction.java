package com.ascent.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class ValidationAction extends ActionSupport {
    private String requiredString;

    public String getRequiredString() {
        return requiredString;
    }

    public void setRequiredString(String requiredString) {
        this.requiredString = requiredString;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
