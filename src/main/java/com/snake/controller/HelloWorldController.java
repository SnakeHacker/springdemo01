package com.snake.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Snake on 2017/5/15.
 */


public class HelloWorldController implements Controller{

    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        System.out.println("=====你好啊周博士=====");
        String hello = "hello 周博士";
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("map1","周博士1");
        map.put("map2","周博士2");
        map.put("map3","周博士3");

//        return new ModelAndView("/welcome","result",hello);

        return new ModelAndView("/welcome","map",map);
    }
}
