package com.itotdel.itotdel_back.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MembersController {

    @GetMapping("/members")
    public String SayHello() {
        return "Hello world";
    }
}
