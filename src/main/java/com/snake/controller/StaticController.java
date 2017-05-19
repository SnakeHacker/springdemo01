package com.snake.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


/**
 * Created by Snake on 2017/5/15.
 */


public class StaticController extends MultiActionController{

    public ModelAndView img(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response){
        System.out.println("------img--------");

        return new ModelAndView("/staticFile");
    }
}
