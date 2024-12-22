package com.example.eschool.model;

import lombok.Data;

@Data
public class Teacher extends User{
  private String cin;
  private String schoolSubject;

    public Teacher(String userName, String password, String email, String phone, String address, String role, String cin, String schoolSubject) {
        super(userName, password, email, phone, address, role);
        this.cin = cin;
        this.schoolSubject = schoolSubject;
    }

    public Teacher(String cin, String schoolSubject) {
        this.cin = cin;
        this.schoolSubject = schoolSubject;
    }
}
