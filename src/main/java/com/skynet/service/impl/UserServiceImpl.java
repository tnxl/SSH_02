package com.skynet.service.impl;

import com.skynet.dao.BaseDAO;
import com.skynet.service.UserService;
import com.skynet.user.UserEnity;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Scope("prototype")
public class UserServiceImpl implements UserService {

    private BaseDAO baseDAO;

    private UserEnity userEnity;
    private List list;

    @Override
    public UserEnity checkLogin(String username, String password) {
        List users = doThing(username, password);
        if (users.size() != 0)
            for (int i = 0; i < list.size(); i++) {
                UserEnity u = (UserEnity) users.get(i);
                if (u.getUsername().equals(userEnity.getUsername())) {
                    if (u.getPassword().equals(userEnity.getPassword()))
                        return userEnity;
                }
            }
        return null;
    }

    @Override
    public boolean register(String username, String password) {
        List users = doThing(username, password);
        boolean flag = false;
        for (int i = 0; i < users.size(); i++) {
            UserEnity u = (UserEnity) users.get(i);
            if (u.getUsername().compareTo(userEnity.getUsername())==0) {
                flag = true;
            }
        }
        if (!flag){
            baseDAO.add(userEnity);
            return true;
        }
        return false;
    }

    private List doThing(String username, String password) {
        userEnity = new UserEnity();
        userEnity.setUsername(username);
        userEnity.setPassword(password);
        list = baseDAO.find(userEnity);
        return list;
    }

    public void setBaseDAO(BaseDAO baseDAO) {
        this.baseDAO = baseDAO;
    }
}
