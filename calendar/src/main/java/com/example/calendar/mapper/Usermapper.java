package com.example.calendar.mapper;

import com.example.calendar.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;


public interface Usermapper {

    @Select("select * from user")
    List<User> findAll();

    @Update("INSERT INTO user (name, tel, gender) VALUE (#{name}, #{tel}, #{sex})")
    @Transactional
    void save(User user);

    @Update("update user set name=#{name}, tel=#{tel}, sex=#{sex} where id=#{id}" )
    void updateById(User user);

    @Delete("delete from user where id=#{id}")
    void deleteById(Long id);
}
