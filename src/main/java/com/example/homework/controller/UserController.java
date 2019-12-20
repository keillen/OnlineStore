package com.example.homework.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.homework.model.User;
import com.example.homework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(maxAge = 3600, origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public Object Check(@RequestParam String name, @RequestParam String password) {
        long users = userService.checkUser(name, password);
        if (users == 0) {
            User user = new User();
            user.setName(name);
            user.setPassword(password);
            long l = userService.CheckName(user);
            if (l == 0) {
                userService.insert(user);
                return JSONObject.toJSON("注册成功");
            }else {
                return JSONObject.toJSON("用户名已存在，请输入正确密码");
            }

        }else {
            return JSONObject.toJSON("登录成功");
        }
    }
}



