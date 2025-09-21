package com.example.calendar.entity;

import lombok.Data;

@Data
public class schedule {
    private int id;
    private String title;
    private String description;
    private String location;
    private String start_time;
    private String end_time;
    private String created_at;


}
