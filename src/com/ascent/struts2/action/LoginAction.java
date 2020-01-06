package com.ascent.struts2.action;

public class LoginAction {
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


    public String execute(){
        if (getUsername().equals("liang")&&getPassword().equals("liang")){
            return "success";
        }
        return "error";
    }
}
