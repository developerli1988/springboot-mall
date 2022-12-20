package com.scott.springbootmall.service.impl;

import com.scott.springbootmall.dao.UserDao;
import com.scott.springbootmall.dto.UserRegisterRequest;
import com.scott.springbootmall.model.User;
import com.scott.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImpl implements UserService {

    private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
       User user = userDao.getUserByEmail(userRegisterRequest.getEmail());

        if(user != null){
            log.warn("該email {} 已經被註冊過了", userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        return userDao.createUser(userRegisterRequest);
    }
}
