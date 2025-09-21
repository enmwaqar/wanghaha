package com.example.calendar.mapper;

import com.example.calendar.entity.Homepage;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Homepagemapper {

    @Select("select * from my_homepage")
    List<Homepage> findAll();
}
