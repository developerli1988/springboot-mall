package com.scott.springbootmall.dao;

import com.scott.springbootmall.dto.UserRegisterRequest;
import com.scott.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
