package com.skynet.action;

import com.opensymphony.xwork2.ActionSupport;
import com.skynet.service.UserService;
import com.skynet.user.UserEnity;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class UserAction extends ActionSupport {

    private UserService userService;

    private String username;
    private String password;

    public String login(){
        UserEnity userEnity = userService.checkLogin(username,password);
        if (userEnity!=null)
            return SUCCESS;
        return ERROR;
    }

    public String register(){
        boolean reg = userService.register(username,password);
        if (reg)
            return SUCCESS;
        else
            return ERROR;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

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
}
