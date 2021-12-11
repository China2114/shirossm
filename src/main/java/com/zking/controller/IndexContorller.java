package com.zking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexContorller {

    @RequestMapping("/goAddUser")
    public  String addUser(){
        return "addUser";
    }

}
