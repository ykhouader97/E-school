package com.example.eschool.model;


import lombok.Data;

@Data
public class Note {

    private int id;
    private float note;
    private int studentId;
    private int examId;
}
