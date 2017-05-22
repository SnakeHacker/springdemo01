package com.snake.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by Snake on 2017/5/19.
 * 注解方式进行访问
 */


@Controller
@RequestMapping("/user/data")
public class DataController {

    @RequestMapping(value = "/adduser")
    public String addUser(String userName, String age, HttpServletRequest request){
        System.out.println(userName);
        System.out.println(age);

        request.setAttribute("userName",userName);
        request.setAttribute("age",age);

        String s = "this is addUser annotation";
        System.out.println(s);
        return "/userManage";
    }

    @RequestMapping(value = "/deleteuser")
    public String deleteUser(){
        String s = "this is delUser annotation";
        System.out.print(s);
        return "";
    }

    @RequestMapping(value = "/touser")
    public String toUser(){
        return "/adduser";
    }

}
