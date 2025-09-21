package com.example.calendar.controller;

import com.example.calendar.entity.Homepage;
import com.example.calendar.mapper.Homepagemapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homepage")
public class Homepagecontroller {

    @Resource
    Homepagemapper homepagemapper;

    @GetMapping("/index")
    public List<Homepage> index() {
        return homepagemapper.findAll();
    }




}
