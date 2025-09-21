package com.example.calendar.mapper;

import com.example.calendar.entity.schedule;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Schedulemapper {

    @Select("SELECT * FROM schedule")
    List<schedule> findAll();

    @Insert("Insert Into schedule (title, description, start_time, end_time) VALUES (#{title}, #{description}, #{start_time},#{end_time})")
    void insert(schedule schedule);

    @Update("UPDATE schedule SET title = #{title}, description = #{description}, start_time = #{start_time}, end_time = #{end_time} WHERE id = #{id}")
    void updateById(schedule schedule);

    @Delete("DELETE FROM schedule WHERE id = #{id}")
    void deleteById(int id);
}
