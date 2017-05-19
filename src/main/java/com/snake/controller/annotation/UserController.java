package com.snake.controller.annotation;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.RequestWrapper;


/**
 * Created by Snake on 2017/5/19.
 * 注解方式进行访问
 */


@Controller
public class UserController {

    @RequestMapping(value = "/user/adduser",method = RequestMethod.POST)
    public ModelAndView addUser(){
        String s = "this is addUser annotation";
        System.out.println(s);
        return new ModelAndView("/Annotation","result",s);
    }

    @RequestMapping(value = "/user/deleteuser",method = RequestMethod.GET)
    public ModelAndView deleteUser(){
        String s = "this is delUser annotation";
        System.out.print(s);
        return new ModelAndView("/Annotation","result",s);
    }

    @RequestMapping(value = "/user/changeuser",method = RequestMethod.GET)
    public ModelAndView changeUser(){
        String s = "this is changeUser annotation";
        System.out.print(s);
        return new ModelAndView("/Annotation","result",s);
    }

    @RequestMapping(value = "/user/touser", method = RequestMethod.GET)
    public ModelAndView toUser(){
        return new ModelAndView("/Annotation");
    }
}
