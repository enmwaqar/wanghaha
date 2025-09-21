package com.example.calendar.controller;

import com.example.calendar.entity.User;
import com.example.calendar.mapper.Usermapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Usercontroller
{
    @Resource
    Usermapper usermapper;

    @GetMapping
    public List<User> getUser(){
        return usermapper.findAll();
    }

    @PostMapping
    public String createUser(@RequestBody User user){
       usermapper.save(user);
        return "success";
    }
    @PutMapping
    public String updateUser(@RequestBody User user){
        usermapper.updateById(user);
        return "success";
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        usermapper.deleteById(id);
        return "success";
    }
}
