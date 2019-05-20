package com.skynet.dao;

import com.skynet.user.UserEnity;

import java.util.List;

public interface BaseDAO {

    boolean add(Object o);
    boolean delete(Object o);
    boolean update(Object o);
    List find(Object o);

}
