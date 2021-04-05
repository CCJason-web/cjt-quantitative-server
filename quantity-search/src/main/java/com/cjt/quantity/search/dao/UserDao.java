package com.cjt.quantity.search.dao;

import com.cjt.quantity.search.domain.User;

public interface UserDao {

    User selectByPrimaryKey(Integer userId);

}