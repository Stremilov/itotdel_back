package com.itotdel.itotdel_back.controllers;


import com.itotdel.itotdel_back.configuration.ItotdelConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class MembersController {

    private final ItotdelConfig itotdelConfig;

    @Autowired
    public MembersController(ItotdelConfig itotdelConfig) {
        this.itotdelConfig = itotdelConfig;
    }

    @GetMapping("/members")
    public ItotdelConfig getMembers() {
        System.out.print(itotdelConfig);
        return itotdelConfig;
    }
}
