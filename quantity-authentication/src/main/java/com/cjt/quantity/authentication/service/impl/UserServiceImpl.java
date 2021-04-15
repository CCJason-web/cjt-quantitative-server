package com.cjt.quantity.authentication.service.impl;

import com.cjt.quantity.authentication.dao.UsersDao;
import com.cjt.quantity.authentication.domain.Users;
import com.cjt.quantity.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UsersDao usersDao;

    @Override
    public int registerUsers(Users users) {
        return usersDao.insertUsers(users);
    }
}
