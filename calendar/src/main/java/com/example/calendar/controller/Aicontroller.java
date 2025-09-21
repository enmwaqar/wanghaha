package com.example.calendar.controller;

import com.example.calendar.mapper.AI;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class Aicontroller {
    @Resource
    AI AI;
    @GetMapping
    public Object ai(){
        return "There is the AI module";
    }
}
