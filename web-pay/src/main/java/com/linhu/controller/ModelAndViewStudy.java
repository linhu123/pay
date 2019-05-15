package com.linhu.controller;

import com.linhu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/study")
public class ModelAndViewStudy {

    @RequestMapping(value = "/one")
    public Object one(HttpServletRequest request,@RequestParam User user){
        user.setAge("19");
//        ModelAndView modelAndView = new ModelAndView("redirect:/two");
//        if (user.getAge().equals(19)){
//            return modelAndView;
//        }
        request.setAttribute("user",user);
        return "forward:/three";
    }

    @RequestMapping(value = "/two")
    public Object two(@RequestParam User user){
        System.out.println(user);
        return null;
    }

    @RequestMapping("/three")
    public String three(){
        System.out.println("asfghkjhaeiu21jdlksa");
        return "index";
    }

}

