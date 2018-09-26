package com.jcw.util;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(Exception e) {
        e.printStackTrace();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("respCode", "9999");
        result.put("respMsg", e.getMessage());
        return result;
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(BindException e) {
        e.printStackTrace();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("respCode", "9999");
        result.put("respMsg", "绑定异常");
        return result;
    }
}
