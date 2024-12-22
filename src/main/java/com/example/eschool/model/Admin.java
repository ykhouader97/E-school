package com.example.eschool.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Admin extends User {
    private String cin;


    public Admin(String userName, String password, String email, String phone, String address, String role, String cin) {
        super(userName, password, email, phone, address, role);
        this.cin = cin;
    }

    public Admin(String cin) {
        this.cin = cin;
    }
}
