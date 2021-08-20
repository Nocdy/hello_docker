package com.springboot.docker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexConroller {

    @RequestMapping("/hello")
    public @ResponseBody Object hello(){
        return "Hello Docker!";
    }

}
