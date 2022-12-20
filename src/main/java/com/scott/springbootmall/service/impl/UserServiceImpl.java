package com.scott.springbootmall.service.impl;

import com.scott.springbootmall.dao.UserDao;
import com.scott.springbootmall.dto.UserRegisterRequest;
import com.scott.springbootmall.model.User;
import com.scott.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
