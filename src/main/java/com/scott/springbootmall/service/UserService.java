package com.scott.springbootmall.service;

import com.scott.springbootmall.dto.UserLoginRequest;
import com.scott.springbootmall.dto.UserRegisterRequest;
import com.scott.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
