package com.example.eschool.model;


import lombok.Data;

@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String role;

    public User( String userName, String password, String email, String phone, String address, String role) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public User( ) {

    }

}







