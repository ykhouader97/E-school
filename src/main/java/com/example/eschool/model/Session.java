package com.example.eschool.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Session
{
    private int id;
    private LocalDate date;
    private int duration ;
    private int classId;
    private int roomId;
    private int teacherId;
}

