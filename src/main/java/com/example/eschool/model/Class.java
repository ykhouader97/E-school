package com.example.eschool.model;

import lombok.Data;

@Data
public class Class {
    private int id;
    private int level;
    private String className;


    public Class(int level, String className) {

        this.level = level;
        this.className = className;
    }

}
