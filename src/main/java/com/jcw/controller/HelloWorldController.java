package com.jcw.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Api(tags={"用户的API"})
@Controller
public class HelloWorldController {

    private static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @ApiOperation(value="用户新增", nickname="index", httpMethod="GET", notes="新增用户接口")
    @GetMapping("/hello")
    public String index() {
        return "welcome.html";
    }

    @GetMapping("/hello2")
    public ModelAndView index2() {
        return new ModelAndView("welcome");
    }

}
