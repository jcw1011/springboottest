package com.jcw.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jcw.dto.PersonDto;
import com.jcw.entity.User;
import com.jcw.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jin Chenwu
 * @since 2018-09-19
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/addUser")
    public String index2(User user) {
        User newUser = userMapper.selectOne(new QueryWrapper<User>()
                .eq("person_name", user.getPersonName()));
        return "success";
    }
}

