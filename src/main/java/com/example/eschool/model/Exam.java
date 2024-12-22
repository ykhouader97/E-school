package com.example.eschool.model;


import lombok.Data;

import java.time.LocalDate;

@Data
public class Exam {

    private int id;
    private String title;
    private String subject;
    private int teacherID;
    private LocalDate date;









}
