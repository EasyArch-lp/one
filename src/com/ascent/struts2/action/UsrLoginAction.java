package com.ascent.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
@SuppressWarnings("serial")
public class UsrLoginAction extends ActionSupport {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private String password;
    private String tip;



    public String getPassword() {
        System.out.println(password);
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public ArrayList getDataList() {
        return dataList;
    }

    public void setDataList(ArrayList dataList) {
        this.dataList = dataList;
    }

    private ArrayList dataList;

    public String execute(){
        System.out.println(dataList);
        System.out.println(username+"------"+password);
        return "error";
    }
}
