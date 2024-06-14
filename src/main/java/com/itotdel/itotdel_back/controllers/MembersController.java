package com.itotdel.itotdel_back.controllers;


import com.itotdel.itotdel_back.configuration.ItotdelConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class MembersController {

    private final ItotdelConfig itotdelConfig;

    @GetMapping("/")
    public String mainPage() {
        return "ok";
    }

    @GetMapping("/members")
    public ResponseEntity getMembers() {
        return ResponseEntity.ok(itotdelConfig.getMembers());
    }
}
