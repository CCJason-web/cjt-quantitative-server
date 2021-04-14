package com.cjt.authentication.controller;


import com.cjt.authentication.domain.Users;
import com.cjt.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;


@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Users register(Users users) {
        users.setId(UUID.randomUUID().toString());
        int i = userService.registerUsers(users);
        if (i > 0) {

        }
        return new Users();
    }
}
