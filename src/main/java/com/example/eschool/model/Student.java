package com.example.eschool.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Student extends User {
    private String cne;
    private int classID;

    public Student(String userName, String password, String email, String phone, String address, String role, String cne) {
        super(userName, password, email, phone, address, role);
        this.cne = cne;
    }

    public Student(String cne) {
        this.cne = cne;
    }
}
