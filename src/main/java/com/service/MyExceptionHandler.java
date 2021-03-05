package com.service;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {
    //不论拦截到任何异常，返回json格式
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<Object,Object> exceptionHandler() {
        HashMap<Object,Object> result = new HashMap<Object, Object>();
        result.put("code",500);
        result.put("msg","系统错误");
        return result;
    }

}
