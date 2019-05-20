package com.skynet.service;

import com.skynet.user.UserEnity;

public interface UserService {

    UserEnity checkLogin(String username, String password);

    boolean register(String username,String password);

}
