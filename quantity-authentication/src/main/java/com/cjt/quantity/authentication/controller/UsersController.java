package com.cjt.quantity.authentication.controller;

import com.cjt.quantity.authentication.domain.Users;
import com.cjt.quantity.authentication.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Users register(@RequestBody String request) {
        Gson gson = new Gson();
        Users users = gson.fromJson(request, Users.class);
        users.setId(UUID.randomUUID().toString().substring(0, 10) + (System.currentTimeMillis() + "").substring(0, 10));
        int i = userService.registerUsers(users);
        if (i > 0) {

        }
        return new Users();
    }

    @RequestMapping(value = "/checkemail", method = RequestMethod.POST)
    @ResponseBody
    public Users checkEmail(@RequestBody String request) {
        Gson gson = new Gson();
        Users users = gson.fromJson(request, Users.class);
        return new Users();
    }
}
