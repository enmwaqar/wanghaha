package com.example.calendar.controller;


import com.example.calendar.entity.schedule;
import com.example.calendar.mapper.Schedulemapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class Schedulecontrolle {
    @Resource
    Schedulemapper schedulemapper;

    @RequestMapping("/findAll")
    public List<schedule> get() {
         return  schedulemapper.findAll();
    }

    @PostMapping("/add")
    public String add(@RequestBody schedule schedule){
        schedulemapper.insert(schedule);
        return "success";
    }
    @PutMapping("/update")
    public String update(@RequestBody schedule schedule){
        schedulemapper.updateById(schedule);
        return "success";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        schedulemapper.deleteById(id);
        return "success";
    }
}
