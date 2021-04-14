package com.cjt.authentication.service.impl;

import com.cjt.authentication.dao.UsersDao;
import com.cjt.authentication.domain.Users;
import com.cjt.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UsersDao usersDao;

    @Override
    public int registerUsers(Users users) {
        return usersDao.insertUsers(users);
    }
}
